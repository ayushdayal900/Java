package JFrameLearning;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Panel {
    public static void main(String[] args) {

        JLabel label_green = new JLabel();   // create a label
        label_green.setText("Green");  ;

        JLabel label_orange = new JLabel();   // create a label
        label_orange.setText("Orange");  ;

        JLabel label_white = new JLabel();   // create a label
        label_white.setText("White");  ;

        JPanel orange_jp = new JPanel();
        orange_jp.setBackground(new Color(244, 196, 48));
        orange_jp.setBounds(0,0,500,250);
        orange_jp.setLayout(new BorderLayout());
        
        JPanel white_jp = new JPanel();
        white_jp.setBackground(Color.WHITE);
        white_jp.setBounds(0,251,500,250);
        white_jp.setLayout(new BorderLayout());
        
        JPanel green_jp = new JPanel();
        green_jp.setBackground(Color.GREEN);
        green_jp.setBounds(0,502,500,250);
        green_jp.setLayout(new BorderLayout());


        // JPanel = a GUI component that functions as container to holds other component
        JFrame jf = new JFrame();
        jf.setTitle("Linux Terminal");    // sets title of frame
        jf.setLayout(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit ou of application 
        jf.setSize(750,750);       // sets x and y dimension of frame
        jf.setVisible(true);      // make frame visible 

        orange_jp.add(label_orange);
        white_jp.add(label_white);
        green_jp.add(label_green);
        jf.add(orange_jp);
        jf.add(white_jp);
        jf.add(green_jp);
    }
}
