package com.javaLab;

class Student{
    int rollno;
    String name;
    int marks;

}
public class EnhancedArray {

    public static void main(String[] args) {


        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "emmanuel" ;
        s1.marks = 88;
Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "elsa" ;
        s2.marks = 90;
Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "joyce" ;
        s3.marks = 97;

        Student student[] =new Student[4];

        student[0] =s1;
        student[1] =s2;
        student[2] =s3;
//        student[3] =
        for(Student stud : student){
            System.out.println(stud.name + ":" + stud.marks);
        }



    /*    int nums[] = new int[5];
        nums[0] = 4;
        nums[1] = 9;
        nums[2] = 45;
        nums[3] = 3;

        for (int n : nums){
            System.out.println(n);
        }*/

    }
}
