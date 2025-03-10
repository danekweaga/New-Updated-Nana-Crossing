import javafx.scene.shape.Rectangle;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

 /**********************************************************************************************************
 * @title The LaneIndecator class.
 * A class with simplistic visual representation of the lanes
 * 
 * @author Alamn Adeleke, Chukwunonso Ekweaga, Ashlee Muchirahondo
 * @version version 1
 **********************************************************************************************************/
public class LaneIndecator extends Pane
{
    //positon values
    protected int x,y;
    //array of rectangles, 
    
    protected Rectangle r1 = new Rectangle(23, 60);
    protected Rectangle r2 = new Rectangle(23, 60);
    protected Rectangle r3 = new Rectangle(23, 60);
    protected Rectangle r4 = new Rectangle(23, 60);
    protected Rectangle r5 = new Rectangle(23, 60);
    protected Rectangle r6 = new Rectangle(23, 60);
    protected Rectangle r7 = new Rectangle(23, 60);
    protected Rectangle r8 = new Rectangle(23, 60);
    protected Rectangle r9 = new Rectangle(23, 60);
    protected Rectangle[] r = {r1,r2,r3,r4,r5,r6,r7,r8,r9};
    
    protected Text t1 = new Text(23, 60, "1");
    protected Text t2 = new Text(23, 60, "2");
    protected Text t3 = new Text(23, 60, "3");
    protected Text t4 = new Text(23, 60, "4");
    protected Text t5 = new Text(23, 60, "5");
    protected Text t6 = new Text(23, 60, "6");
    protected Text t7 = new Text(23, 60, "7");
    protected Text t8 = new Text(23, 60, "8");
    protected Text t9 = new Text(23, 60, "9");
    protected Text[] t = {t1,t2,t3,t4,t5,t6,t7,t8,t9};
    
    /*******************************************************************************************************
     * Two Parameter constructor for LaneIndecator
     * 
     * @param x The x-coordinate of the indicator
     * @param y The y-coordinate of the indicator
     *******************************************************************************************************/
    public LaneIndecator(int x, int y)
    {
        //for each of the rectangles,
        for(int i = 0 ; i <9 ; i++)
        {
            //set the position, spaced based on where  in the array
            r[i].setX(x+i*26);
            r[i].setY(y+5);
            t[i].setX(x+8+i*26);
            t[i].setY(y+40);
            
            //Customize the rectangle
            r[i].setStrokeWidth(1);
            r[i].setStroke(Color.BLACK);
            r[i].setFill(Color.rgb(115, 168,212));
            
            t[i].setStroke(Color.BLUE.brighter());
            t[i].setStrokeWidth(1);
            
            //Add to the class
            this.getChildren().add(r[i]);
            this.getChildren().add(t[i]);
        }
        //Set the first to be turned "on"
        setOn(0);
    }
    
    /*********************************************************
     * Method to set the current lane
     * 
     * @param lane The current lane to highlight
     *********************************************************/
    public void setOn(int lane)
    {
        //if input is in valid(has a corresponding rectangle),
        if(lane<=8 || lane>=0)
        {
            //Turn all "off"
            for(int i = 0 ; i <9 ; i++)
            {
                r[i].setFill(Color.rgb(115, 168,212));
            }
            //then turn that which matches the input "on"
            r[lane].setFill(Color.LIGHTCYAN);
        }   
    }
}
