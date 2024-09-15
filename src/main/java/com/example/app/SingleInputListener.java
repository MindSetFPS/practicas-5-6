package com.example.app;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.util.Arrays;

public class SingleInputListener implements ActionListener {

    public CoinCounter coinCounter;
    public JTextField inputField;
    public JLabel answer;

    public SingleInputListener(CoinCounter coinCounter, JTextField inpuTextField, JLabel answer) {
        this.coinCounter = coinCounter;
        this.inputField = inpuTextField;
        this.answer = answer;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        // coinCounter.calculate(9, );
        answer.setText("Respuesta: " + coinCounter.calculate(Double.parseDouble(inputField.getText()), Arrays.asList(100.0, 50.0, 20.0, 10.0, 5.0, 2.0, 1.0, 0.5, 0.2, 0.01)));
    }
}