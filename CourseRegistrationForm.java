/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication89;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseRegistrationForm extends JFrame implements ActionListener {

    JTextField nameField, addressField, phoneNumberField;
    JComboBox<String> genderComboBox, departmentComboBox, courseComboBox;

    public CourseRegistrationForm() {
        // Set up the JFrame
        setTitle("Course Registration Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create components
        nameField = new JTextField(20);
        addressField = new JTextField(20);
        phoneNumberField = new JTextField(20);

        String[] genders = {"Male", "Female"};
        genderComboBox = new JComboBox<>(genders);

        String[] departments = {"CSE", "ECE", "EEE", "Mech", "Civil"};
        departmentComboBox = new JComboBox<>(departments);

        String[] courses = {"C", "C++", "JAVA", "PYTHON"};
        courseComboBox = new JComboBox<>(courses);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Set layout
        setLayout(new GridLayout(7, 2));

        // Add components to the frame
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Address:"));
        add(addressField);
        add(new JLabel("Phone Number:"));
        add(phoneNumberField);
        add(new JLabel("Gender:"));
        add(genderComboBox);
        add(new JLabel("Department:"));
        add(departmentComboBox);
        add(new JLabel("Course:"));
        add(courseComboBox);
        add(new JLabel("")); // Empty label as a placeholder
        add(submitButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Submit")) {
            displayConfirmationDialog();
        }
    }

    private void displayConfirmationDialog() {
        String name = nameField.getText();
        String course = (String) courseComboBox.getSelectedItem();

        String message = String.format("%s, you have successfully enrolled in %s", name, course);

        JOptionPane.showMessageDialog(this, message, "Registration Confirmation", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CourseRegistrationForm registrationForm = new CourseRegistrationForm();
            registrationForm.setVisible(true);
        });
    }
}
