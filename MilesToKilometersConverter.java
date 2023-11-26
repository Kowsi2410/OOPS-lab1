/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication88;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MilesToKilometersConverter extends JFrame implements ActionListener {

     JTextField milesTextField;
     JLabel resultLabel;

    public MilesToKilometersConverter() {
        // Set up the JFrame
        setTitle("Miles to Kilometers Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        milesTextField = new JTextField(10);
        JButton convertButton = new JButton("Convert!");
        resultLabel = new JLabel("Result: ");

        // Set layout
        setLayout(new FlowLayout());

        // Add components to the frame
        add(new JLabel("Enter miles: "));
        add(milesTextField);
        add(convertButton);
        add(resultLabel);

        // Add action listener to the convert button
        convertButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle the button click event
        if (e.getActionCommand().equals("Convert!")) {
            convertMilesToKilometers();
        }
    }

    private void convertMilesToKilometers() {
        try {
            // Get the value from the text field
            double miles = Double.parseDouble(milesTextField.getText());

            // Convert miles to kilometers (1 mile = 1.609 kilometers)
            double kilometers = miles * 1.609;

            // Display the result
            resultLabel.setText("Result: " + kilometers + " kilometers");
        } catch (NumberFormatException ex) {
            // Handle the case when the input is not a valid number
            resultLabel.setText("Result: Invalid input");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MilesToKilometersConverter converter = new MilesToKilometersConverter();
            converter.setVisible(true);
        });
    }
}
