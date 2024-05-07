package JFrameLearning;

import java.awt.Color;
import java.awt.Dimension;

// import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class FlowLayout {
    // Layout manager = define the natural layout for components within a containe            
    // FlowLayout = places component in a row , sized at their preferred size
                    // if the horizontal space in container is too low
                    // the flow layout class will uses the next available row.

                   
        public static void main(String[] args) {
            // JPanel = a GUI component that functions as container to holds other component
        JFrame jf = new JFrame();
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit ou of application 
        jf.setSize(750,750);       // sets x and y dimension of frame
        // jf.setLayout(new java.awt.FlowLayout());
        jf.setLayout(new java.awt.FlowLayout());

        JPanel jp = new JPanel();
        jp.setPreferredSize(new Dimension(100,250));
        jp.setBackground(Color.LIGHT_GRAY);
        jp.setLayout(new java.awt.FlowLayout());

        
        jp.add(new JButton("1"));
        jp.add(new JButton("2"));
        jp.add(new JButton("3"));
        jp.add(new JButton("4"));
        jp.add(new JButton("5"));
        jp.add(new JButton("6"));
        jp.add(new JButton("7"));
        jp.add(new JButton("8"));
        jp.add(new JButton("9"));
        jp.add(new JButton("19"));
        jp.add(new JButton("29"));
        jp.add(new JButton("39"));
        jp.add(new JButton("49"));


        jf.add(jp);
        jf.setVisible(true);      // make frame visible 
        
    }
}
