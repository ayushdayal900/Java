package test;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class JFrameInputText {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Input Text Retrieval");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create JTextFields
        JTextField textField1 = new JTextField("Text Field 1", 20);
        JTextField textField2 = new JTextField("Text Field 2", 20);

        // Add JTextFields to JFrame
        frame.add(textField1);
        frame.add(textField2);

        // Add a button to trigger text retrieval
        JButton retrieveButton = new JButton("Retrieve Input Text");
        frame.add(retrieveButton);

        // Create a JLabel to display the retrieved input text
        JLabel outputLabel = new JLabel("Retrieved Input Text:");
        frame.add(outputLabel);

        // Create a JTextArea to display the retrieved input text
        JTextArea outputTextArea = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(outputTextArea);
        frame.add(scrollPane);

        // Add action listener to the button
        retrieveButton.addActionListener(e -> {
            // Call function to retrieve input text
            ArrayList<String> inputTextList = getInputTextFromJFrame(frame);
            // Clear previous text
            outputTextArea.setText("");
            // Append the retrieved input text to the text area
            for (String inputText : inputTextList) {
                outputTextArea.append(inputText + "\n");
            }
        });

        // Set JFrame size and visibility
        frame.pack();
        frame.setVisible(true);
    }

    // Function to retrieve input text from all JTextFields in a JFrame
    public static ArrayList<String> getInputTextFromJFrame(JFrame frame) {
        ArrayList<String> inputTextList = new ArrayList<>();
        // Iterate through all components in the JFrame
        for (Component component : frame.getContentPane().getComponents()) {
            // Check if the component is a JTextField
            if (component instanceof JTextField) {
                // Cast the component to JTextField and retrieve its text
                JTextField textField = (JTextField) component;
                // Add the text to the list
                inputTextList.add(textField.getText());
            }
        }
        return inputTextList;
    }
}
