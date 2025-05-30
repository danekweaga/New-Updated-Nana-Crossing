import javafx.scene.layout.Pane; import javafx.scene.control.Button; import javafx.scene.image.ImageView; import javafx.scene.image.Image; import javafx.scene.Scene; import javafx.scene.text.Text; import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color; import javafx.scene.control.TextField; import javafx.scene.effect.Glow; import javafx.scene.text.Font; import javafx.scene.media.Media; import javafx.scene.media.MediaPlayer; 
import java.io.File; import java.util.ArrayList; import java.util.List;

/*****************************************************************************************************************
 * @title The HomeScreen class.
 * A pane containing a input fields(for odds of success and pay for each succesful crossing) and a  play button
 * 
 * @author Alamn Adeleke, Chukwunonso Ekweaga, Ashlee Muchirahondo
 * @version version 1 
 ****************************************************************************************************************/
public class HomeScreen extends Pane
{
    protected ImageView BG = new ImageView(new Image("/assets/BG.png"));
    protected ImageView playB = new ImageView(new Image("/assets/play.png"));
    protected ImageView setB = new ImageView(new Image("/assets/settings.png"));
    protected ImageView doneB = new ImageView(new Image("/assets/done.png"));
    
    protected Text t1 = new Text(30,190, "Type your \nnana's name");
    protected Text t2 = new Text(370,185, "Probability Difference\n(3% recomended)");
    protected Text t3 = new Text(370,253, "Reward per Lane\n(100 Recomended)");
    protected Text t4 = new Text(440,230, "%");
    protected Text t5 = new Text(436,290, "VBucks");
    protected Text t6 = new Text(400,299, "Settings");
    
    protected Rectangle holder1, holder2;
     
    protected Media clickSound = new Media(getClass().getResource("/assets/sounds/click.mp3").toExternalForm());
    protected MediaPlayer click = new MediaPlayer(clickSound);
    
    //Textfields to input App data
    protected TextField nameField = new TextField("");
    protected TextField oddsField = new TextField("3");
    protected TextField payField = new TextField("125"); 
    
    // List of music file paths
    protected List<String> musicFiles = new ArrayList<>(); 
    
    // MediaPlayer for background music
    protected static  MediaPlayer mediaPlayer; 

    // Index of the current track
    protected int currentTrackIndex = 0; 
    


    /************************************************************************
     *Default constructor for HomeScreen
     ***********************************************************************/
    public HomeScreen()
    {
        draw();
        // Load background music
        loadMusicFiles("assets/sounds/background music");     
        nameField.setText(RandomGameText.getGranName());
    }
    
    /*************************************************************
     * Method to draw the HomeScreen
     *************************************************************/
    public void draw()
    {        
        //Customize the assets of the Home page
        playB.setLayoutX(60);
        playB.setLayoutY(260);
        playB.setFitWidth(35);
        playB.setFitHeight(35);
        //Animation
        glow(playB);
        
        
        t2.setFont(new Font(9));
        t3.setFont(new Font(9));
        
        nameField.setLayoutX(30);
        nameField.setLayoutY(215);
        nameField.setPrefWidth(100);
        
        oddsField.setLayoutX(370);
        oddsField.setLayoutY(210);
        oddsField.setPrefWidth(65);
        
        payField.setLayoutX(370);
        payField.setLayoutY(275);
        payField.setPrefWidth(65);
        
        holder1 = new Rectangle(360,170,120,140);
        holder1.setOpacity(0.75);
        holder1.setArcWidth(20);
        holder1.setArcHeight(20);
        holder1.setFill(Color.rgb(115, 168, 212));
        holder2 = new Rectangle(20,170,120,140);
        holder2.setOpacity(0.75);
        holder2.setArcWidth(20);
        holder2.setArcHeight(20);
        holder2.setFill(Color.rgb(115, 168, 212));
        
        setB.setLayoutX(368);
        setB.setLayoutY(190);
        setB.setFitWidth(100);
        setB.setFitHeight(90);
        //Animation
        glow(setB);
        
        this.getChildren().addAll(BG,holder1 ,holder2, t1, nameField,playB,setB,t6);
    }
    
    /***********************************************
     * Method that displays game settings
     * 
     * Displays the settings for the game
     **********************************************/
    public void setFunc()
    {
        //Empty the home screen
        this.getChildren().clear();
        //Add all the prior elements
        this.getChildren().addAll(BG, holder1 , holder2, t1, t2, t3, t4, t5, nameField, oddsField, payField, playB,doneB);
        //customize the button
        doneB.setLayoutX(368);
        doneB.setLayoutY(289);
        doneB.setFitWidth(100);
        doneB.setFitHeight(100);
        glow(doneB);//400,299
        //When the done button is clicked,
        doneB.setOnMouseClicked(e->
        {
            //Play click sound effect
            click.seek(click.getStartTime());
            click.play();
            //clear the pane to add only what should be added
            this.getChildren().clear();
            this.getChildren().addAll(BG,holder1 ,holder2, t1, nameField,playB,setB,t6);
        });
    }
    
    
    /****************************************************************************************
     * Method that handles the switching from one track to the other 
     * 
     * Stops the current track and plays a new music file from the specified file path.
     ****************************************************************************************/
    public static void playMusic(String filePath) 
    {
        try 
        {
            // Stop the previous track if it's playing
            if (mediaPlayer != null) 
            {
                mediaPlayer.stop(); 
            }
    
            //changes the file and plays
            Media media = new Media(new File(filePath).toURI().toString());
            mediaPlayer = new MediaPlayer(media);
            mediaPlayer.play();
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    }
    
    /*******************************************************************************************************
     * Method to create a glowing effect on a button
     * Create the hovering effect of a play button, as long as all fields have been filled.
     * 
     * @param img The image view to apply the glow effect to
     *******************************************************************************************************/
    public void glow(ImageView img)
    {
        Glow glow = new Glow();
        // Set the intensity of the glow to high(0.8) when mouse hovering on it, as long as all fields have been filled
        img.setOnMouseEntered(
        e ->{
            if(canGoToGameScreen())
            {
                glow.setLevel(0.86); // Set the intensity of the glow
                img.setEffect(glow);
            }
        });
        // Set the intensity of the glow back to normal when mouse not highlited
        img.setOnMouseExited(
        e ->{
            glow.setLevel(0.0); 
            img.setEffect(glow);
        });
    }
    
    /*******************************************************************************************************
     * Method to set values from the input fields
     * 
     * Set the pay, odds and name (used by the whole program) to the values inputed on the home screen
     *******************************************************************************************************/
    public void setValues()
    {
        App.setOdds(Double.valueOf(oddsField.getText()));
        App.setPay(Integer.valueOf(payField.getText()));
        App.setName(nameField.getText());
    }
    
    /*******************************************************************************************************
     * Method to check if the screen can transition to the game screen
     * 
     * @return true, if the if the fields have been filled with, false otherwise.
     *******************************************************************************************************/
    public boolean canGoToGameScreen()
    {
        boolean can;
        try
        {
            //if name has at least 2 characters, and pay and odds has at least 1 digit
            if((nameField.getText().length() > 1)&&(payField.getText().length() > 0)&&(oddsField.getText().length() > 0))
            {
                can = true;
            }
            else
            {
                can = false;
            }
        }
        //catch incase input for pay and odds are not numbers 
        catch(Exception e)
        {
            can = false;
        }
        
        return can;
    }
    
    /***************************************************************************
     * Method to load music files
     * 
     * @param directoryPath Location of the music file on the computer
     ***************************************************************************/
    public void loadMusicFiles(String directoryPath) 
    {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles((dir, name) -> name.endsWith(".mp3")); // Filter for .mp3 files
        //as long as the folder contains the right kind of files,
        if (files != null) 
        {
            for (File file : files) 
            {
                // Add file paths to the list
                musicFiles.add(file.getAbsolutePath()); 
            }
        }
        playNextTrack(); // Start playing the first track
    }
    
    /******************************************************************************
     * Method to play the next track
     * 
     * Select and play a track
     ******************************************************************************/
    public void playNextTrack() 
    {
        //if music index out of bounds,
        if (currentTrackIndex >= musicFiles.size()) 
        {
            // Loop back to the first track
            currentTrackIndex = 0; 
        }
        //if no track selected,
        if (!musicFiles.isEmpty()) 
        {
            // Get the next track
            String nextTrack = musicFiles.get(currentTrackIndex); 
            // Create a Media object
            Media media = new Media(new File(nextTrack).toURI().toString()); 
            // Set the next track to play
            mediaPlayer = new MediaPlayer(media); 
            mediaPlayer.setOnEndOfMedia(this::playNextTrack);
            mediaPlayer.setVolume(0.3);
            
            //Play the track
            mediaPlayer.play();
            // Increment the track index
            currentTrackIndex++;
        }
    }

    /*******************************************************************************************************
     * Method to stop music
     *******************************************************************************************************/
    public void stopMusic() 
    {
        if (mediaPlayer != null) 
        {
            // Stop the music
            mediaPlayer.stop(); 
        }
    }

}
