// Advancing the Console, Hello, World into a GUI app
// Filename: HelloWorld2.java
import javax.swing.*;

public class HelloWorld2 {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        JFrame frame = new JFrame("Hello, World!"); // Create a Windows frame and assign it a name
        frame.setSize(300, 120); // Set the frame's size
        JLabel label = new JLabel("Hello, World!", JLabel.CENTER);  // Create a Label within the frame and assign it what to say
        // Make everything visible
        frame.add(label);
        frame.setVisible(true);
    }
}