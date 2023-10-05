package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author zoey42
 */
public class RegistrationForm extends JFrame {
    private JTextField firstNameField;
    private JTextField lastNameField;
    private JTextField ageField;
    private JTextField emailField;
    
    public RegistrationForm() {
        setTitle("User Registration Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        JLabel firstNameLabel = new JLabel("First Name:");
        JLabel lastNameLabel = new JLabel("Last Name:");
        JLabel ageLabel = new JLabel("Age:");
        JLabel emailLabel = new JLabel("Email:");

        firstNameField = new JTextField(20);
        lastNameField = new JTextField(20);
        ageField = new JTextField(5);
        emailField = new JTextField(20);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationForm();
            }
        });
    }
}
