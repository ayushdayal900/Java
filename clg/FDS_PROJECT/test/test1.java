package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class test1 extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_BARS = 50;
    private static final int BAR_WIDTH = WIDTH / NUM_BARS;
    private static final int BAR_HEIGHT_MULTIPLIER = HEIGHT / NUM_BARS;

    private JPanel drawingPanel;
    private JButton startButton;
    private JButton resetButton;

    private int[] bars;

    public test1() {
        setTitle("Sorting Visualizer");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        drawingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawBars(g);
            }
        };
        drawingPanel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        add(drawingPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        startButton = new JButton("Start Sorting");
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startSorting();
            }
        });
        buttonPanel.add(startButton);

        resetButton = new JButton("Reset");
        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });
        buttonPanel.add(resetButton);

        add(buttonPanel, BorderLayout.SOUTH);
    }

    private void drawBars(Graphics g) {
        for (int i = 0; i < NUM_BARS; i++) {
            int barHeight = bars[i] * BAR_HEIGHT_MULTIPLIER;
            int x = i * BAR_WIDTH;
            int y = HEIGHT - barHeight;
            g.fillRect(x, y, BAR_WIDTH, barHeight);
        }
    }

    private void initBars() {
        bars = new int[NUM_BARS];
        for (int i = 0; i < NUM_BARS; i++) {
            bars[i] = (int) (Math.random() * NUM_BARS) + 1;
        }
    }

    private void startSorting() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                // Implement Bubble Sort algorithm
                for (int i = 0; i < NUM_BARS - 1; i++) {
                    for (int j = 0; j < NUM_BARS - i - 1; j++) {
                        if (bars[j] > bars[j + 1]) {
                            int temp = bars[j];
                            bars[j] = bars[j + 1];
                            bars[j + 1] = temp;

                            try {
                                Thread.sleep(50); // Adjust speed of visualization
                            } catch (InterruptedException ex) {
                                ex.printStackTrace();
                            }

                            repaint(); // Update drawing panel
                        }
                    }
                }
            }
        }).start();
    }

    private void reset() {
        initBars();
        repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                SortingVisualizer visualizer = new SortingVisualizer();
                visualizer.initBars(); // Initialize bars
                visualizer.setVisible(true);
            }
        });
    }
}
