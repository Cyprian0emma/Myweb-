package com.javaLab;

import javax.swing.*;

public class displayPanes {
    public static void main(String[] args) {

        String FirstName , FamilyName,FullName;
        FirstName = JOptionPane.showInputDialog("Enter Your First Name: ");

        FamilyName = JOptionPane.showInputDialog("Enter your Family name");

        FullName = "hello   " + FirstName+ "  " + FamilyName;
        JOptionPane.showMessageDialog(null,FullName);
        System.exit(0);
    }
}
