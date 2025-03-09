import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;
import java.util.Random;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.transform.Rotate;
import javafx.scene.effect.Glow;

/*************************************************************************************
 * @title The Lane Class.
 * It includes visual components such as roads, sidewalks, and animated cars.
 * This class handles animating cars moving up and down within the lane
 *
 * @author Alamn Adeleke, Chukwunonso Ekweaga, Ashlee Muchirahondo
 * @version 1
 ************************************************************************************/
public class Lane extends Pane
{
    //An array of file locations of car graphics
    protected String[] cars = {"/assets/car1.png", "/assets/car2.png", "/assets/car3.png", "/assets/car4.png", "/assets/car5.png", "/assets/car6.png" };
    
    //instance data
    protected Random rNG = new Random();
    protected int y;
    protected int x;
    protected double laneHeight = 384;
    protected double carHeight = 50;
    protected int laneNum;
    
    //nodes used in the lane
    protected ImageView road;
    protected ImageView side;
    protected ImageView car1;
    protected ImageView car2;
    protected ImageView end;
    
    Rectangle topBlock = new Rectangle(x, y, 112, 50);
    Rectangle bottomBlock = new Rectangle(x, y + 334, 112, 50);
    
    /*******************************************************************
     * Constructor with parameters for Lane
     * 
     * @param y The y-coordinate of the lane
     * @param x The x-coordinate of the lane
     ********************************************************************/
    public Lane(int y, int x, int laneNum)
    {
        //initialising images
        road = new ImageView(new Image("/assets/road.png"));
        side = new ImageView(new Image("/assets/side.png"));
        car1 = new ImageView(new Image(cars[rNG.nextInt(cars.length)]));
        car2 = new ImageView(new Image(cars[rNG.nextInt(cars.length)]));
        
        this.laneNum = laneNum;
        
        draw();
        //Add animations to the car
        animUp(car1);
        animDown(car2);
    }
    
    /***********************************************************
     * Method to draw the Lane
     **********************************************************/
    public void draw()
    {
        //Set the size positions of all the assets of the lane
        road.setX(x+40);
        road.setY(y);
        road.setFitHeight(laneHeight);
        road.setFitWidth(72);
        
        side.setX(x);
        side.setY(y);
        side.setFitHeight(laneHeight);
        side.setFitWidth(40);
        
        car1.setX(x+42);
        car1.setY(y);
        car1.setFitHeight(carHeight);
        car1.setFitWidth(30);
        
        car2.setX(x+76);
        car2.setY(y);
        car2.setFitHeight(carHeight);
        car2.setFitWidth(30);
        //turn the car around
        car2.getTransforms().add(new Rotate(180, 92, 25));
        
        this.getChildren().addAll(road, side, car1, car2, topBlock, bottomBlock);
    }
    
    /*******************************************************************************************************
     * Method to animate the motion of the cars downwards and back indefinitely
     * 
     * @param car The car to animate
     *******************************************************************************************************/
    public void animDown(ImageView car)
    {
        //Create a transition
        TranslateTransition transition = new TranslateTransition();
        //Duration set to a number with rng(multiple rng for wider range of possible speeds), to avoid having cars with same speed
        transition.setDuration(Duration.seconds(0.2+ (1.5 / (0.7*laneNum +1))*(2+rNG.nextInt(3)*(2+rNG.nextInt(3)*(2+rNG.nextInt(3)))))); 
        // Repeat indefinitely
        transition.setCycleCount(TranslateTransition.INDEFINITE); 
        // Make it move back and forth 
        // Apply the transition to the input object
        transition.setNode(car); 
        //set the motion
        transition.setByY(laneHeight - carHeight);
        
        //Play the animation
        transition.play();
    }
    
    /*******************************************************************************************************
     * Method to animate the motion of the cars upwards and back indefinitely
     * 
     * @param car The car to animate
     *******************************************************************************************************/   
    public void animUp(ImageView car)
    {
        //move the car to the bottom,
        car.setY(333);
        //Create a transition
        TranslateTransition transition = new TranslateTransition();
        //Duration set to a number with rng(multiple rng for wider range of possible speeds), to avoid having cars with same speed
        transition.setDuration(Duration.seconds(0.2+ (1.5 / (0.7*laneNum +1))*(2+rNG.nextInt(3)*(2+rNG.nextInt(3)*(2+rNG.nextInt(3)))))); 
        // Repeat indefinitely
        transition.setCycleCount(TranslateTransition.INDEFINITE); 
        // Make it move back and forth
        // Apply the transition to the input object
        transition.setNode(car); 
        //set the motion
        transition.setByY(-1* (laneHeight - carHeight));
        
        //Play the animation
        transition.play();
    }
    
    public void glow()
    {
        Glow glow = new Glow();
        glow.setLevel(1); 
        topBlock.setEffect(glow);
        bottomBlock.setEffect(glow);
        
        topBlock.setFill(Color.rgb(115, 168,212));
        bottomBlock.setFill(Color.rgb(115, 168,212));
    }
    
    public void unglow()
    {
        Glow glow = new Glow();
        glow.setLevel(0); 
        topBlock.setEffect(glow);
        bottomBlock.setEffect(glow);
        
        topBlock.setFill(Color.rgb(115, 168,212));
        bottomBlock.setFill(Color.rgb(115, 168,212));
    }
}
