package com.javaLab;

import java.io.IOException;

public class STOP {
    public static void main(String[] args) throws IOException {
        System.out.println("press s to stop. ");

//        for(i = 0; (char) System.in.read() !='S'; i++){
//            System.out.println("Pass #" + i);
//        }
        int e;
        int result;

        for (int i = 0; i <10 ; i++){
            result =1;
            e = i;
            while (e>0){
                result *= 3;
                e--;
            }
            System.out.println("3 to the "+ i + " power is " + result);



        }
    }
}
