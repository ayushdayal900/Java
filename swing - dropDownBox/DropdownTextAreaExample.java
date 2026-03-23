package dropDownBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DropdownTextAreaExample {
    private JFrame frame;
    private JComboBox<String> comboBox;
    private JTextArea textArea;

    public DropdownTextAreaExample() {
        frame = new JFrame("Dropdown & TextArea Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a dropdown box
        String[] options = {"ParallelReduction", "ParallelDFSTraversal", "ParallelBFSTraversal", "MultiThreadedMergeSort", "MultiThreadedBubbleSort"};
        comboBox = new JComboBox<>(options);
        frame.add(comboBox);

        // Create a text area
        textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        frame.add(scrollPane);

        // Add an action listener to the combo box
        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                MultiThreadedBubbleSort mbs = new MultiThreadedBubbleSort();

                textArea.setText("");
                String selectedOption = (String) comboBox.getSelectedItem();
                // textArea.append("Selected option: " + selectedOption + "\n");
                if(selectedOption.equals("MultiThreadedBubbleSort")){
                    // textArea.append(MultiThreadedBubbleSort.AdvBubbleSort(options));
                    textArea.append("hii");
                    
                }
            }
        });

        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new DropdownTextAreaExample();
            }
        });
    }
}
