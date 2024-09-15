package com.example.app;

import java.awt.*;
import javax.swing.*;

public class View {
    public static JPanel mainPanel;

    public static void RenderUi() {
        JFrame frame = new JFrame();
        frame.setSize(600, 400);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE; // Prevent stretching
        gbc.insets = new Insets(15, 15, 15, 15); // Add padding between components

        frame.getContentPane().add(mainPanel);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void addToSubpanel(JPanel subPanel, JComponent... components){
        for (JComponent component : components){
            subPanel.add(component);
        }
    }

    public static void createSingleInputView(CoinCounter coinCounter) {
        // Create subpanel to add content
        JPanel subPanel = new JPanel(new GridLayout(0, 1, 10, 10));

        // Get class name and assign to label
        JLabel columnLabel = new JLabel(coinCounter.getClass().getSimpleName());
        JLabel answer = new JLabel("Respuesta: ");
        
        // Create inputs
        JTextField inputField = new JTextField(16);
        
        // Validate numbers
        inputField.addKeyListener(new NumberValidator(inputField));

        // Create button and event listener
        JButton button = new JButton("Calcular");
        button.addActionListener(new SingleInputListener(coinCounter, inputField, answer));

        addToSubpanel(subPanel, columnLabel, inputField, button, answer);
        mainPanel.add(subPanel);
    }
}
