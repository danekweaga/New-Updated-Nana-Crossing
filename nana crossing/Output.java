import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

/***************************************************************
 * @title The Output Class
 * The class of all the inputs of the game screen
 *
 * @author Alamn Adeleke, Chukwunonso Ekweaga, Ashlee Muchirahondo
 * @version 1
 **************************************************************/
public class Output extends Pane
{
    //background object
    protected Rectangle BG = new Rectangle(-10, 0, 1080, 130);
    //graphical lane indicator
    protected LaneIndecator laneI = new LaneIndecator(30, 45);
    
    protected Text laneHeader = new Text(30 ,40,"Current Lane;");
    protected Text vBucksHeader = new Text(325,40,"Current VBucks;");
    protected Text oddsHeader = new Text(630,45,"Odds of ");
    protected Text failHeader = new Text(660,75,"failure;");
    protected Text successHeader = new Text(575,75,"success;");
    
    
    //Text lane = new Text(80,70,"Lane 1 of 8");
    protected Text vBucks = new Text(325,75,"XX VBucks");
    protected Text failOdds = new Text(720,105,"XX%");
    protected Text successOdds = new Text(590,105,"XX%");
    
    /****************************************************
     * Default Constructor for the Output Class
     ***************************************************/
    public Output()
    {
        //Cusomizing the background rectangle
        BG.setArcWidth(15);
        BG.setArcHeight(15);
        BG.setFill(Color.BLACK);
        BG.setOpacity(0.6);
        
        //Customizing the text objects size
        laneHeader.setFont(new Font(35));
        vBucksHeader.setFont(new Font(35));
        oddsHeader.setFont(new Font(35));
        failHeader.setFont(new Font(35));
        successHeader.setFont(new Font(35));
        //lane.setFont(new Font(30));
        vBucks.setFont(new Font(30));
        successOdds.setFont(new Font(30));
        failOdds.setFont(new Font(30));
        
        //Customizing the text objects fill color
        laneHeader.setStroke(Color.rgb(115, 168,212));
        vBucksHeader.setStroke(Color.rgb(115, 168,212));
        oddsHeader.setStroke(Color.rgb(115, 168,212));
        failHeader.setStroke(Color.rgb(115, 168,212));
        successHeader.setStroke(Color.rgb(115, 168,212));
        //lane.setStroke(Color.rgb(115, 168,212));
        vBucks.setStroke(Color.rgb(115, 168,212));
        successOdds.setStroke(Color.RED.darker());
        failOdds.setStroke(Color.GREEN.darker());
        
        //Customizing the text objects stroke color
        laneHeader.setFill(Color.rgb(115, 168,212).darker());
        vBucksHeader.setFill(Color.rgb(115, 168,212).darker());
        oddsHeader.setFill(Color.rgb(115, 168,212).darker());
        failHeader.setFill(Color.rgb(115, 168,212).darker());
        successHeader.setFill(Color.rgb(115, 168,212).darker());
        //lane.setFill(Color.rgb(115, 168,212).darker());
        vBucks.setFill(Color.rgb(115, 168,212).darker());
        successOdds.setFill(Color.RED);
        failOdds.setFill(Color.GREEN.brighter());
        
        
        this.getChildren().addAll(BG, /*lane, */laneHeader, vBucks, vBucksHeader, failOdds, successOdds, failHeader, successHeader, oddsHeader, laneI);
    }
    
    /*******************************************************************************
     Method to set the objects of the class and set based on the input
       
     @param - lane, player's current vbucks, odds of success
    *******************************************************************************/
    public void setOutput(int lane, int vBucks, double odds)
    {
        //this.lane.setText("Lane " + lane + " of 8");
        laneI.setOn(lane);
        this.vBucks.setText(vBucks + " VBucks");
        this.successOdds.setText(odds + "%");
        this.failOdds.setText((100 - odds) + "%");
    }
}
