package com.javaLab;

import javax.swing.*;
import java.io.IOException;

public class Read{
    public static void main(String[] args) throws IOException{
        char ch ,ignore,answer = 'k';
       do {
           System.out.println("I'm thinking of a letter between A and Z.\n");

           System.out.print("can you guess it: ");
           ch = (char) System.in.read(); //get char
           //discard any other characters  in the input buffer
           do {
               ignore = (char) System.in.read();
           } while (ignore != '\n');
           if (ch == answer)
               System.out.println("\n** Right **");
           else {
               System.out.println("\n....sorry, you're   ");
               if (ch < answer) System.out.println("\ntoo low");
               else System.out.println("\ntoo high");
           }
       } while (answer != ch );


    }
}