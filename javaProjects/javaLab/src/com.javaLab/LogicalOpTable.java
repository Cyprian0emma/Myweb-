package com.javaLab;

public class LogicalOpTable {
    public static void main(String[] args) {
         boolean p,q;

        System.out.println("p\t\t\tq\t\t\tAND\t\t\tOR\t\t\tXOR\t\t\tNOT");

        p= true; q = true;
        System.out.print(p+"\t\t" + q + "\t\t");
        System.out.print((p&q) + "\t\t" + (p|q) +"\t\t");
        System.out.println((p^q) + "\t\t" + (!p));

        p = true; q= false;
        System.out.print(p+"\t\t" + q + "\t\t");
        System.out.print((p&q) + "\t\t" + (p|q) +"\t\t");
        System.out.println((p^q) + "\t\t" + (!p));

        p = false; q= true;
        System.out.print(p+"\t\t" + q + "\t\t");
        System.out.print((p&q) + "\t\t" + (p|q) +"\t\t");
        System.out.println((p^q) + "\t\t" + (!p));

        p=false; q=false;
        System.out.print(p+"\t\t" + q + "\t\t");
        System.out.print((p&q) + "\t\t" + (p|q) +"\t\t");
        System.out.println((p^q) + "\t\t" + (!p));

    }
}
