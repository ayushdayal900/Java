package JFrameLearning;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Lable extends JFrame{

    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("linuxLogo.png");
        Border b = BorderFactory.createLineBorder(Color.green,3);

        // JLabel = a GUI display are for a string of text, an image, or both
        JLabel jl = new JLabel();   // create a label
        jl.setText("Terminal for Linux");  //set test of label
        jl.setIcon(image);  // adding image in label
        jl.setHorizontalTextPosition(JLabel.CENTER);    // set test to left right or center of image icon
        jl.setVerticalTextPosition(JLabel.TOP);         // set test to bottom top or center of image icon
        jl.setForeground(Color.BLUE);   // set text collor
        jl.setFont(new Font("MV Boli",Font.BOLD, 20));  // set font of label
        jl.setIconTextGap(5);   // set gap betn image and text
        jl.setBackground(Color.BLACK);  // set ackground color of label
        jl.setOpaque(true);     // display bakgroung color 
        jl.setBorder(b);    // adding border
        jl.setVerticalAlignment(JLabel.CENTER);    // set vertical position of icon + text within label
        jl.setHorizontalAlignment(JLabel.CENTER);    // set horizontal position of icon + text within label
        // jl.setBounds(100,100,450,450);  // set x and y position within fram as well as dimensions




        JFrame jf = new JFrame();
        jf.setTitle("Linux Terminal");    // sets title of frame
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit ou of application 
        // jf.setSize(420,420);       // sets x and y dimension of frame
        jf.setVisible(true);      // make frame visible        

        // jf.setLayout(null);
        
        
        jf.add(jl); // add JLabel
        jf.pack();  // set size of frame such that all components are visible (always use this metod at end)





    }
}
