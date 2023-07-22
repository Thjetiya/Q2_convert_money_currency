package org.example;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Scanner THBInput = new Scanner(System.in);
        System.out.print("Number on THB : ");
        int THB = THBInput.nextInt();

        Scanner typeInput = new Scanner(System.in);
        System.out.print("Convert To Currency Type : ");
        String type = typeInput.nextLine().toUpperCase();

        MoneyCurrency currency = new MoneyCurrency(THB, type);
        int NumberOfConverted = currency.convertTHBTo(type);
        currency.setNumberOfConverted(NumberOfConverted);
        System.out.println(currency.numberOfConvertedToString());

        //Swing GUI
//        JFrame frame = new JFrame("Convert Money Currency");
//        frame.setSize(320, 240);
//        frame.setLayout(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//
//        JLabel THBLabel = new JLabel("Number on THB : ");
//        THBLabel.setBounds(15, 25, 120, 30);
//        frame.add(THBLabel);
//
//        JTextField THBTextField = new JTextField();
//        THBTextField.setBounds(115, 25, 120, 30);
//        frame.add(THBTextField);
//
//        JLabel typeLabel = new JLabel("Currency Type : ");
//        typeLabel.setBounds(15, 65, 120, 30);
//        frame.add(typeLabel);
//
//        JTextField typeTextField = new JTextField();
//        typeTextField.setBounds(115, 65, 120, 30);
//        frame.add(typeTextField);
//
//        JLabel numberOfConvertedLabel = new JLabel();
//        numberOfConvertedLabel.setBounds(15, 105, 120, 30);
//        frame.add(numberOfConvertedLabel);
//
//        JButton convertButton = new JButton("Convert");
//        convertButton.setBounds(100, 145, 120, 30);
//        convertButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                String THBText = THBTextField.getText();
//                int THB = Integer.parseInt(THBText);
//                String type = typeTextField.getText();
//
//                MoneyCurrency currency = new MoneyCurrency(THB, type);
//                int numberOfConverted = currency.convertTHBTo(type);
//                currency.setNumberOfConverted(numberOfConverted);
//                String output = currency.numberOfConvertedToString();
//                numberOfConvertedLabel.setText(output);
//
//            }
//        });
//        frame.add(convertButton);

    }
}