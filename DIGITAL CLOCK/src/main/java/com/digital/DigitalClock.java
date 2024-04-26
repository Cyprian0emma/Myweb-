package com.digital;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;




import java.awt.*;
import java.io.IOException;

public class DigitalClock {


    private JFrame Frame;
    JTextField textField;
    JTextField textField_1;
    JTextField textField_2;

    /*
    lounch the application
    */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    DigitalClock window = new DigitalClock();
                    window.Frame.setVisible(true);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    /*
    Create the application.
    */
    public DigitalClock(){
//        IntelliJTheme.setup();
        initializer();
    }
    private  void initializer(){
        Frame = new JFrame();
        Frame.setBounds(100,100,546,300);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.setUndecorated(true);
        Frame.setLocationRelativeTo(null);

        Font f = null;
        try {
            f = Font.createFont(Font.TRUETYPE_FONT,DigitalClock.class.getResourceAsStream("/TickingTimebombBB.ttf "));
        } catch (FontFormatException e) {
            //TODO-GENERATED CATCH BLOCK
            e.printStackTrace();
        } catch (IOException e) {
            //TODO-GENERATED CATCH BLOCK
            e.printStackTrace();
        }

        JPanel panel = new JPanel();
        panel.setBackground(Color.darkGray);
        panel.setBounds(0,0,546,300);
        Frame.getContentPane().add(panel);
        panel.setLayout(null);

        textField = new JTextField("06");
        textField.setFont(f.deriveFont(Font.BOLD,100f));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setBorder(null);
        textField.setEditable(false);
        textField.setBounds(26,84,119,112);
        panel.add(textField);
        textField.setColumns(10);

        textField_1 = new JTextField("06");
        textField_1.setFont(f.deriveFont(Font.BOLD,100f));

        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setBorder(null);
        textField_1.setEditable(false);
        textField_1.setBounds(201,84,119,112);
        panel.add(textField_1);
        textField_1.setColumns(10);

         textField_2 = new JTextField("06");
        textField_2.setFont(f.deriveFont(Font.BOLD,100f));

        textField_2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_2.setBorder(null);
        textField_2.setEditable(false);
        textField_2.setBounds(385,84,119,112);
        panel.add(textField_2);
        textField_2.setColumns(10);

        JLabel lblNewlabel = new JLabel(":");
        lblNewlabel.setFont(f.deriveFont(Font.BOLD,100f));

        lblNewlabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewlabel.setBounds(152,84,45,112);
        panel.add(lblNewlabel);

        JLabel lblNewlabel_1 = new JLabel(":");
        lblNewlabel_1.setFont(f.deriveFont(Font.BOLD,100f));

        lblNewlabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewlabel_1.setBounds(330,84,45,112);
        panel.add(lblNewlabel_1);


    new  ClockThread(this);

    }
}