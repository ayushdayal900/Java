package JFrameLearning;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;

public class TextFieldHelper extends JFrame implements ActionListener{

    JButton jb;
    JTextField jtf;

    TextFieldHelper(){
        // JFrame jf = new JFrame();               // creating a frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // exit ou of application 
        this.setLayout(new FlowLayout());

        jb = new JButton("enter");
        jb.addActionListener(this);

        jtf = new JTextField();
        jtf.setPreferredSize(new Dimension(250,250));
        jtf.setFont(new Font("Consolas", Font.PLAIN, 35));
        jtf.setForeground(new Color(0x00FF00));
        jtf.setBackground(Color.black);
        jtf.setCaretColor(Color.white);  // line color
        jtf.setText("username : ");

        pack();
        
        
        
        this.add(jb);
        this.add(jtf);
        this.pack();
        this.setVisible(true);      // make frame visible
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jb){
            System.out.println("Hello "+jtf.getText()); 
            jb.setEnabled(false);
            jtf.setEditable(false);
            

        }
    }

}
