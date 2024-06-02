package com.mycompany.calculator;

import java.awt.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Frame extends JFrame implements ActionListener {
    
    
    JPanel panel1;
    JPanel panel2;
    JPanel panel3;
    
    JTextField textField;
    
    JButton numButtons[] = new JButton[10];
    //JButton functionButtons[] = new JButton[4];
    JButton addButton,subButton,multButton,divButton;
    JButton decButton,clearButton,deletButton,equalButton,negButton;
    
    
    public Frame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(260, 320);
        this.setTitle("Calculator");
        this.setLocation(600, 250);
        this.setLayout(null);
        
        
        /****panel1****/
        panel1 = new JPanel();
        panel1.setBounds(0, 0, 250, 50);
        panel1.setLayout(null);
        /****create text field****/
        textField = new JTextField();
        textField.setBounds(12, 10, 226, 40);
        textField.setFont(new Font("MV Boli",Font.BOLD,15));
        textField.setEditable(false);
        textField.addActionListener(this);
        
        panel1.add(textField);
        /****panel1****/
        
        
        /****panel2****/
        panel2 = new JPanel();
        panel2.setBounds(10, 55, 230, 170);
        panel2.setLayout(new GridLayout(4,4,5,5));
        
        numButtons[0] = new JButton("1");
        numButtons[1] = new JButton("2");
        numButtons[2] = new JButton("3");
        numButtons[3] = new JButton("4");
        numButtons[4] = new JButton("5");
        numButtons[5] = new JButton("6");
        numButtons[6] = new JButton("7");
        numButtons[7] = new JButton("8");
        numButtons[8] = new JButton("9");
        numButtons[9] = new JButton("0");
        for(int i=0 ; i<10 ; i++){
            numButtons[i].setFocusable(false);
            numButtons[i].setFont(new Font("MV Boli",Font.BOLD,15));
            numButtons[i].addActionListener(this);
        }
        addButton = new JButton("+");
        addButton.setFocusable(false);
        addButton.setFont(new Font("MV Boli",Font.BOLD,15));
        addButton.addActionListener(this);
        
        subButton = new JButton("-");
        subButton.setFocusable(false);
        subButton.setFont(new Font("MV Boli",Font.BOLD,15));
        subButton.addActionListener(this);
        
        multButton = new JButton("*");
        multButton.setFocusable(false);
        multButton.setFont(new Font("MV Boli",Font.BOLD,15));
        multButton.addActionListener(this);
        
        divButton = new JButton("/");
        divButton.setFocusable(false);
        divButton.setFont(new Font("MV Boli",Font.BOLD,15));
        divButton.addActionListener(this);
        
        decButton = new JButton(".");
        decButton.setFocusable(false);
        decButton.setFont(new Font("MV Boli",Font.BOLD,15));
        decButton.addActionListener(this);
        
        equalButton = new JButton("=");
        equalButton.setFocusable(false);
        equalButton.setFont(new Font("MV Boli",Font.BOLD,15));
        equalButton.addActionListener(this);
            
        panel2.add(numButtons[0]);//1
        panel2.add(numButtons[1]);//2
        panel2.add(numButtons[2]);//3
        panel2.add(addButton);//+
        panel2.add(numButtons[3]);//4
        panel2.add(numButtons[4]);//5
        panel2.add(numButtons[5]);//6
        panel2.add(subButton);//-
        panel2.add(numButtons[6]);//7
        panel2.add(numButtons[7]);//8
        panel2.add(numButtons[8]);//9
        panel2.add(multButton);//*
        panel2.add(decButton);//.
        panel2.add(numButtons[9]);//0
        panel2.add(equalButton);//=
        panel2.add(divButton);// /
        /****panel2****/
        
        /****panel3****/
        panel3 = new JPanel();
        panel3.setBounds(0, 225, 250, 100);
        panel3.setLayout(null);
        
        negButton = new JButton("(-)");
        negButton.setBounds(10, 10, 80, 30);
        deletButton = new JButton("Delet");
        deletButton.setBounds(85, 10, 80, 30);
        clearButton = new JButton("Clear");
        clearButton.setBounds(160, 10, 80, 30);
        
        deletButton.setFont(new Font("MV Boli",Font.BOLD,15));
        clearButton.setFont(new Font("MV Boli",Font.BOLD,15));
        negButton.setFont(new Font("MV Boli",Font.BOLD,15));
        
        deletButton.setFocusable(false);
        clearButton.setFocusable(false);
        negButton.setFocusable(false);
        
        deletButton.addActionListener(this);
        clearButton.addActionListener(this);
        negButton.addActionListener(this);
        
        panel3.add(deletButton);
        panel3.add(clearButton);
        panel3.add(negButton);
        /****panel3****/
        
        
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.setVisible(true);
    }

    double num1 = 0,num2 = 0,result = 0;
    String operator = null;
        
    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        for(int i=0 ; i<10 ; i++){
            if(e.getSource() == numButtons[i]){
                if("0".equals(numButtons[i].getText()))
                   textField.setText(textField.getText().concat(String.valueOf("0")));
                else 
                    textField.setText(textField.getText().concat(String.valueOf(i+1)));
            }
        }
        
        
        if(e.getSource() == decButton){
                textField.setText(textField.getText().concat("."));
        }
        
        
        if(e.getSource() == addButton){
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = "+";
        }
        if(e.getSource() == subButton){
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = "-";
        }
        if(e.getSource() == multButton){
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = "*";
        }
        if(e.getSource() == divButton){
            num1 = Double.parseDouble(textField.getText());
            textField.setText("");
            operator = "/";
        }
        
        
        if(e.getSource() == equalButton){
            num2 = Double.parseDouble(textField.getText());
            
            if(operator.equals("+"))
                result = num1 + num2;
            else if(operator.equals("-"))
                result = num1 - num2;
            else if(operator.equals("*"))
                result = num1 * num2;
            else if(operator.equals("/")) 
                result = num1 / num2;
                
            if(num2 == 0 && operator.equals("/")) {
                textField.setText("Error");
            }
            else textField.setText(String.valueOf(result));
            num1 = result;
        }
        
        if(e.getSource() == clearButton){
            textField.setText("");
        }
        if(e.getSource() == deletButton){
            String s = textField.getText();
            String temp = "";
            
            for(int i=0 ; i<s.length()-1 ; i++)
               temp += s.charAt(i);  
            textField.setText(temp);
        }
        
        if(e.getSource() == negButton){
            String s = textField.getText();
            String temp = "-";
            for(int i=0 ; i<s.length() ; i++)
                temp += s.charAt(i);  
            
            textField.setText(temp);
        }
    }
}
