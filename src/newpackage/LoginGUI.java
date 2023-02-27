import javax.swing.*;
import java.awt.*;
import internalPages.dashboardPage;

public class LoginGUI {
    
    public static void main(String[] args) {
        LoginGUI loginGUI = new LoginGUI();
    }
    
    private JFrame loginFrame;
    private JPanel loginPanel;
    private JLabel userLabel;
    private JTextField userText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JLabel messageLabel;
    
    public LoginGUI() {
        // Create the login GUI
        loginFrame = new JFrame("Login");
        loginFrame.setSize(300, 150);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginPanel = new JPanel(new GridLayout(3, 2));
        userLabel = new JLabel("Username:");
        userText = new JTextField(20);
        passwordLabel = new JLabel("Password:");
        passwordText = new JPasswordField(20);
        loginButton = new JButton("Login");
        messageLabel = new JLabel("");
        
        // Add components to the login panel
        loginPanel.add(userLabel);
        loginPanel.add(userText);
        loginPanel.add(passwordLabel);
        loginPanel.add(passwordText);
        loginPanel.add(loginButton);
        loginPanel.add(messageLabel);
        
        // Add action listener to the login button
        loginButton.addActionListener(e -> {
            String username = userText.getText();
            char[] password = passwordText.getPassword();
            
            if (username.equals("user") && String.valueOf(password).equals("password")) {
                messageLabel.setText("Login successful!");
                loginFrame.setVisible(false); // Hide the login frame
                showExistingGUI(); // Show the existing GUI
            } else {
                messageLabel.setText("Invalid username or password.");
            }
        });
        // Display the login frame in the center of the screen
loginFrame.setLocationRelativeTo(null);
loginFrame.setVisible(true);

        
        // Add the login panel to the login frame
        loginFrame.add(loginPanel);
        
        // Display the login frame
        loginFrame.setVisible(true);
    }
    
    
    private void showExistingGUI() {
        // Create and display the existing GUI
        dashBoard existingFrame = new dashBoard(); // Replace this with the name of your existing JFrame class
        existingFrame.setVisible(true);
    }
}
