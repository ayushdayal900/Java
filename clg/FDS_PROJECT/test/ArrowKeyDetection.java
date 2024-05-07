package test;

import javax.swing.*;
import java.awt.event.*;

public class ArrowKeyDetection extends JFrame {
    public ArrowKeyDetection() {
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    System.out.println("UP arrow key pressed");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new ArrowKeyDetection();
    }
}
