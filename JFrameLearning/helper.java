package JFrameLearning;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

// import test.sortBy3Stacks;


public class helper extends JFrame implements ActionListener {
    
    static JButton jb;
    static JLabel jl;

    helper(){

        ImageIcon img = new ImageIcon("linuxLogo.png");
        ImageIcon img2 = new ImageIcon("face.png");    

        jb = new JButton();
        jl = new JLabel();
        jb.setBounds(200,200,100,50);
        jl.setBounds(300,300,100,50);

        jl.setVisible(false);

        jb.addActionListener(this);


        // jb.addActionListener(e -> System.out.println("hii"));
        jb.setText("Enter");    // not get border around text inside the button
        jb.setFocusable(false);
        jb.setIcon(img);
        jb.setIcon(img);    
        jb.setHorizontalTextPosition(JButton.CENTER);
        jb.setVerticalTextPosition(JButton.CENTER);
        jb.setFont(new Font("Comic Sans", Font.BOLD, 20));
        // jb.setIconTextGap(30);
        jb.setForeground(Color.black);
        // jb.setBackground(Color.green);
        jb.setBorder(BorderFactory.createEtchedBorder());   // make 3d button
        // jb.setEnabled(false);   // disable a button
        /*
         * another method withoud actionalistener and its method
         * jb.addActionListener(e -> sout("hii"));
         */


        // JFrame jf = new JFrame();               // creating a frame
        this.setTitle("Linux Terminal");    // sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit ou of application 
        this.setLayout(null);
        // this.setResizable(false); //prevent frame from being resized
        this.setSize(500,500);       // sets x and y dimension of frame
        this.setVisible(true);      // make frame visible
        this.add(jb);
        this.add(jl);


        ///////////// color //////////////
        // this.getContentPane().setBackground(Color.black); // change color of background
        // this.getContentPane().setBackground(new Color(0,0,0)); // change color of background (black)
        // // this.getContentPane().setBackground(new Color(255,255,255)); // change color of background (white)
        // this.getContentPane().setBackground(new Color(255,0,0)); // change color of background (red)
        // this.getContentPane().setBackground(new Color(0,255,0)); // change color of background (green)
        // this.getContentPane().setBackground(new Color(0,0,255)); // change color of background (blue)

        //////////// image ///////////////
        // ImageIcon image = new ImageIcon("linuxLogo.png");  // create an image icon
        // this.setIconImage(image.getImage());  // change icon of frame


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb){
            System.out.println("poooo.......");
            jl.setVisible(true);
        }
    }
}
