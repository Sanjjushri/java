package Course;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class GUIJava{
    public static void main(String[] args){
        // JFrame = a GUI window to add components to 
        // JFrame frame = new JFrame(); //creates a frame
        // frame.setTitle("JFrame title goes here"); //sets title of frame
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application 
        // frame.setResizable(false); // prevent frame from being resized 
        // frame.setSize(420, 420); //sets the x-dimension, and y-dimention of frame
        // frame.setVisible(true); // make frame visible
        
        // ImageIcon image = new ImageIcon("/Users/sanjju/projects/java/logo.png"); // create an ImageIcon 
        // frame.setIconImage(image.getImage()); // change icon of frame 
        // // frame.getContentPane().setBackground(Color.black); // set background
        // frame.getContentPane().setBackground(new Color(0, 0, 0));

        new MyFrame();
    }
}