package main.java;

public class BasicCalculator {
    public double  Add( double num1 ,double num2){
        return  num1 + num2;
    }
    public  double  Subtract(double num1, double num2){
        return  num1-num2;
    }

    public double Multiply (double num1 , double num2){
        return  num1 * num2;
    }

    public double Division(double num1 , double num2){
        if (num2 == 0){
            System.out.println("error , you cant divide by zero ");
        }
        return num1/num2;
    }

}
