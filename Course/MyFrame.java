package Course;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class MyFrame extends JFrame{
    
    MyFrame(){

        this.setTitle("JFrame title goes here"); //sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application 
        this.setResizable(false); // prevent this from being resized 
        this.setSize(420, 420); //sets the x-dimension, and y-dimention of this
        this.setVisible(true); // make this visible
        
        ImageIcon image = new ImageIcon("/Users/sanjju/projects/java/logo.png"); // create an ImageIcon 
        this.setIconImage(image.getImage()); // change icon of this 
        // this.getContentPane().setBackground(Color.black); // set background
        this.getContentPane().setBackground(new Color(0, 0, 0));

    }
}
