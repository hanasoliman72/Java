package com.mycompany.projectoop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    
    JComboBox comboBox;
    JTextField radiusField,sideField,widthField,heightField;
    JButton calcButton;
    JLabel label;
    JPanel mainPanel;
    
    public MyFrame(){
        
        /***create a frame**/
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//to close the program
        this.setTitle("Calc22");
        this.setSize(450,200);//size of the frame
        this.setLocation(500, 350);//location of the frame in the screen
        this.getContentPane().setBackground(new Color(255,255,255));
        this.setResizable(false);
        this.setLayout(null);//AbsoluteLayout
        
        /***create a comboBox**/
        String shapes[] = {"","Rectangle","Square","Circle"};//items of the comboBox
        comboBox = new JComboBox(shapes);
        comboBox.setBounds(320, 20, 100, 30);
        comboBox.setFont(new Font("MV Boli",Font.BOLD,15));
        comboBox.addActionListener(this);
        this.add(comboBox);//add comboBox to the frame
        
        /***create fields***/
        radiusField = new JTextField("Radius in cm");
        radiusField.setBounds(50, 20, 120, 30);
        radiusField.setFont(new Font("MV Boli",Font.BOLD,15));
        this.add(radiusField);//add radiusField to the frame
        radiusField.setVisible(false);//hide the radiusField
        
        sideField = new JTextField("Side in cm");
        sideField.setBounds(50, 20, 120, 30);
        sideField.setFont(new Font("MV Boli",Font.BOLD,15));
        this.add(sideField);//add sideField to the frame
        sideField.setVisible(false);//hide the sideField
        
        widthField = new JTextField("Width in cm");
        widthField.setBounds(20, 20, 120, 30);
        widthField.setFont(new Font("MV Boli",Font.BOLD,15));
        this.add(widthField);//add widthField to the frame
        widthField.setVisible(false);//hide the widthField
        
        heightField = new JTextField("Height in cm");
        heightField.setBounds(150, 20, 120, 30);
        heightField.setFont(new Font("MV Boli",Font.BOLD,15));
        this.add(heightField);//add heightField to the frame
        heightField.setVisible(false);//hide the heightField
        
        /***create button***/
        calcButton = new JButton("Calculate");
        calcButton.setBounds(50, 70, 100, 30);
        calcButton.setBackground(new Color(137,207,240));
        calcButton.setFont(new Font("MV Boli",Font.BOLD,15));
        calcButton.setFocusable(false);//to delete the annoying border around the text in the button
        calcButton.addActionListener(this);
        this.add(calcButton);//add calcButton to the frame
        calcButton.setVisible(false);//hide the calcButton
        
        /**create a label***/
        label = new JLabel();
        label.setBounds(10, 100, 350, 50);
        label.setFont(new Font("MV Boli",Font.BOLD,12));
        this.add(label);//add the label to the frame
        label.setVisible(false);//hide the label
        
        /**create panel**/
        mainPanel = new MainPanel();
        mainPanel.setBounds(0, 0, 300, 200);
        this.add(mainPanel);
        
        this.setVisible(true);//to show the frame
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        DecimalFormat df = new DecimalFormat("#.#####");
        
        //select the shape
        if(e.getSource() == comboBox){
            if(comboBox.getSelectedItem() == "Circle"){
                radiusField.setVisible(true);//show the radiusField in the frame
                radiusField.setText("Radius in cm");
                
                calcButton.setBounds(50, 70, 100, 30);
                calcButton.setVisible(true);//show the calcButton in the frame
                
                sideField.setVisible(false);//hide the sideField
                widthField.setVisible(false);//hide the widthField
                heightField.setVisible(false);//hide the heightField
                label.setVisible(false);
                mainPanel.setVisible(false);
            }
            else if(comboBox.getSelectedItem() == "Rectangle"){
                widthField.setVisible(true);//show the widthField in the frame
                widthField.setText("Width in cm");
                heightField.setVisible(true);//show the heightField in the frame
                heightField.setText("Height in cm");
                
                calcButton.setBounds(20, 70, 100, 30);
                calcButton.setVisible(true);//show the calcButton in the frame
                
                radiusField.setVisible(false);//hide the radiusField
                sideField.setVisible(false);//hide the sideField
                label.setVisible(false);
                mainPanel.setVisible(false);
            }
            else if(comboBox.getSelectedItem() == "Square"){
                sideField.setVisible(true);//show the sideField in the frame
                sideField.setText("Side in cm");
                
                calcButton.setBounds(50, 70, 100, 30);
                calcButton.setVisible(true);//show the calcButton in the frame
                
                radiusField.setVisible(false);//hide the radiusField
                widthField.setVisible(false);//hide the widthField
                heightField.setVisible(false);//hide the heightField
                label.setVisible(false);
                mainPanel.setVisible(false);
            }
            else {
                radiusField.setVisible(false);//hide the radiusField
                widthField.setVisible(false);//hide the widthField
                heightField.setVisible(false);//hide the heightField
                sideField.setVisible(false);//hide the sideField
                label.setVisible(false);
                
                calcButton.setVisible(false);//hide the calcButton
                
                mainPanel.setVisible(true);
            }
        }
        
        //calculate
        if(e.getSource() == calcButton){
            if(comboBox.getSelectedItem() == "Circle"){
                try{
                    double radius = Double.parseDouble(radiusField.getText());//convert from string to double
                    if(radius <= 0){
                        throw new ArithmeticException();
                    }
                    Circle circle = new Circle(radius," ",true);
                    double area = circle.getArea();
                    double perimeter = circle.getPerimeter();
                
                
                    label.setText("Area = " + df.format(area) + " cm²,  " + "Perimeter = " + df.format(perimeter)+" cm ");//set the result to the label
                    label.setVisible(true);//show the label in the frame
                }
                catch(ArithmeticException | NumberFormatException exp){
                    JOptionPane.showMessageDialog(this, "This is invalid input, please enter two positive numbers","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            else if(comboBox.getSelectedItem() == "Rectangle"){
                try{
                    double width = Double.parseDouble(widthField.getText());//convert from string to double
                    double heigth = Double.parseDouble(heightField.getText());//convert from string to double
                    
                    if(width <= 0 || heigth <= 0){
                        throw new ArithmeticException();
                    }
                    
                    Rectangle rectangle = new Rectangle(width,heigth," ",true);
                    double area = rectangle.getArea();
                    double perimeter = rectangle.getPerimeter();
                
                    label.setText("Area = " + df.format(area) + " cm²,  " + "Perimeter = " + df.format(perimeter)+" cm ");//set the result to the label
                    label.setVisible(true);//show the label in the frame
                }
                catch(ArithmeticException | NumberFormatException exp){
                    JOptionPane.showMessageDialog(this, "This is invalid input, please enter two positive numbers","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            
            else if(comboBox.getSelectedItem() == "Square"){
                try{
                    double side = Double.parseDouble(sideField.getText());//convert from string to double
                    if(side <= 0){
                        throw new ArithmeticException();
                    }
                    Square square = new Square(side," ",true);
                    double area = square.getArea();
                    double perimeter = square.getPerimeter();
                
                    label.setText("Area = " + df.format(area) + " cm²,  " + "Perimeter = " + df.format(perimeter)+" cm ");//set the result to the label
                    label.setVisible(true);//show the label in the frame
                }
                catch(ArithmeticException | NumberFormatException exp){
                    JOptionPane.showMessageDialog(this, "This is invalid input, please enter two positive numbers","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        
        
    }//actionPerformed function
        
}//MyFrame class
