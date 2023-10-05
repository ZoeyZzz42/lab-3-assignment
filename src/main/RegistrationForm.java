package main;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author zoey42
 */
public class RegistrationForm extends JFrame {
    public RegistrationForm() {
        setTitle("User Registration Form");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
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
