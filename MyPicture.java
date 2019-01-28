
/**
 * Write a description of class MyPicture here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyPicture
{
    // instance variables - replace the example below with your own
    private Circle rightEye;
    private Circle leftEye;
    private Circle head;
    private Circle mouth;
    private boolean drawn;

    /**
     * Constructor for objects of class MyPicture
     */
    public MyPicture()
    {
        rightEye = new Circle();
        leftEye = new Circle();  
        head = new Circle();
        mouth = new Circle ();
        drawn = false;
    }
    
public void draw()
    {
        if(!drawn) {
            head.changeColor("blue");
            head.moveHorizontal(15);
            head.moveVertical(25);
            head.changeSize(80);
            head.makeVisible();
            
            rightEye.moveHorizontal(60);
            rightEye.moveVertical(35);
            rightEye.changeSize(10);
            rightEye.changeColor("yellow");
            rightEye.makeVisible();
            
            leftEye.changeColor("yellow");
            leftEye.moveHorizontal(40);
            leftEye.moveVertical(35);
            leftEye.changeSize(10);
            leftEye.makeVisible();
            
            
            mouth.changeColor("black");
            mouth.moveHorizontal(52);
            mouth.moveVertical(75);
            mouth.changeSize(8);
            mouth.makeVisible();
    

            drawn = true;
        }
    }
    
}
