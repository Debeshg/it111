import javax.swing.*;
import java.awt.*; // Needed for Color and Font

public class ShowWindow2 {
    public static void main(String[] args) {

        // declare our variables
        // we are going to make them CONSTANTS
        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

        // Create a window
        JFrame window = new JFrame();

        // Set the title
        window.setTitle("My simple window");

        // Set the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

        // Set window background color
        window.getContentPane().setBackground(Color.RED);

        // Set the location of the window to center of screen
        window.setLocationRelativeTo(null);

        // Set the layout to null so we can manually position elements
        window.setLayout(null);

        // Close the window and exit the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the first label
        JLabel myLabel = new JLabel("My First Big Label!!");
        myLabel.setFont(new Font("SansSerif", Font.PLAIN, 20));
        myLabel.setBounds(50, 20, 250, 30);

        // Create the first text field
        JTextField myTextField1 = new JTextField();
        myTextField1.setBounds(50, 60, 250, 25);

        // Create the second label
        JLabel myLabel2 = new JLabel("My Second Big Label!!");
        myLabel2.setFont(new Font("SansSerif", Font.BOLD, 14));
        myLabel2.setBounds(50, 100, 250, 30);

        // Create the second text field
        JTextField myTextField2 = new JTextField();
        myTextField2.setBounds(50, 140, 250, 25);

        // Add components to the window
        window.add(myLabel);
        window.add(myTextField1);
        window.add(myLabel2);
        window.add(myTextField2);

        // Make the window visible
        window.setVisible(true);
    }
}
