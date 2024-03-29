package main;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author zoey42
 */
public class UserRegistration extends javax.swing.JFrame {
    private String photoFilePath;

    public UserRegistration() {
        initComponents();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        firstNameTxtField = new javax.swing.JTextField();
        lastNameTxtField = new javax.swing.JTextField();
        ageTxtField = new javax.swing.JTextField();
        emailTxtField = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        photoLabel = new javax.swing.JLabel();
        uploadBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        msgLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(700, 500));

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        titleLabel.setText("User Registration Form");

        firstNameLabel.setText("First Name*");

        lastNameLabel.setText("Last Name*");

        ageLabel.setText("Age*");

        emailLabel.setText("Email*");

        submitBtn.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        submitBtn.setText("Submit");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        photoLabel.setText("Photo");

        uploadBtn.setText("Upload");
        uploadBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadBtnActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        msgLabel.setText("Message(<=160 characters)");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(msgLabel)
                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(submitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstNameLabel)
                                .addComponent(emailLabel)
                                .addComponent(lastNameLabel)
                                .addComponent(ageLabel)
                                .addComponent(photoLabel))
                            .addGap(134, 134, 134)
                            .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(firstNameTxtField)
                                .addComponent(lastNameTxtField)
                                .addComponent(ageTxtField)
                                .addComponent(emailTxtField)
                                .addComponent(uploadBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)))))
                .addContainerGap(134, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photoLabel)
                    .addComponent(uploadBtn))
                .addGap(31, 31, 31)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msgLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        String firstName = firstNameTxtField.getText();
        String lastName = lastNameTxtField.getText();
        String age = ageTxtField.getText();
        String email = emailTxtField.getText();
        String textBoxMsg = textArea.getText();
        
        if (firstName.isEmpty() || lastName.isEmpty() || age.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!isValidName(firstName)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid first name.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }

        if (!isValidName(lastName)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid last name.", "Error", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        
        int ageInt;
        try {
            ageInt = Integer.parseInt(age);
            if (ageInt < 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age (a positive integer).", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (!isValidEmail(email)) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (textBoxMsg.length() > 160) {
            JOptionPane.showMessageDialog(this, "Message should not exceed 160 characters.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String message = "First Name: " + firstName + "\n" +
            "Last Name: " + lastName + "\n" +
            "Age: " + age + "\n" +
            "Email: " + email + "\n" +
            "Message: " + textBoxMsg;
        
        if (photoFilePath != null) {
            ImageIcon photoIcon = new ImageIcon(photoFilePath);
            ImageIcon scaledPhoto = new ImageIcon(photoIcon.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT));
            JOptionPane.showMessageDialog(this, message, "User Registration Successful", JOptionPane.INFORMATION_MESSAGE, scaledPhoto);
        } else {
            JOptionPane.showMessageDialog(this, message, "User Registration Successful", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void uploadBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadBtnActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg", "gif");
        fileChooser.setFileFilter(filter);

        int result = fileChooser.showOpenDialog(this);

            File selectedFile = fileChooser.getSelectedFile();
            if (result == JFileChooser.APPROVE_OPTION) {
                if (!isValidImageFormat(selectedFile)) {
                    JOptionPane.showMessageDialog(this, "Please select a valid image file (jpg, png, jpeg, gif).", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            photoFilePath = selectedFile.getAbsolutePath();
            
            JOptionPane.showMessageDialog(this, "Photo uploaded successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_uploadBtnActionPerformed

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        return email.matches(emailRegex);
    }
    
    private boolean isValidImageFormat(File file) {
        String fileName = file.getName();
        int dotIndex = fileName.lastIndexOf('.');
        if (dotIndex == -1) {
            return false;
        }

        String fileExtension = fileName.substring(dotIndex + 1).toLowerCase();
        return fileExtension.equals("jpg") || fileExtension.equals("png") || fileExtension.equals("jpeg") || fileExtension.equals("gif");
    }
    
    private boolean isValidName(String name) {
        return !name.isEmpty() && name.matches("^[a-zA-Z]+$");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegistration().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTxtField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTxtField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTxtField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTxtField;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel msgLabel;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton submitBtn;
    private javax.swing.JTextArea textArea;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton uploadBtn;
    // End of variables declaration//GEN-END:variables
}
