package ex_23042024if_else;

import java.util.Scanner;

public class Lab068 {
    public static void main(String[] args) {
        //Grade calculator.
        //Write a program to calculate and display the grades for respective marks.
        //A - 90-100
        //B - 80-89
        //C - 70-79
        //D - 60-69
        //E - 50-59

        //3 step stratergies for easy solving of problems.
        //1.find user inputs: Marks->datatype- int/double, Grade-> datatype- char.
        //2.Basic logic: if(mark>=90 && mark<=100), print("A").
        //3.Write the code.

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks= sc.nextInt();

        //90-100
        if(marks>=90 && marks<=100)
        {
            System.out.println("A Grade");
        } else if (marks>=80 && marks<=89)
        {
            System.out.println("B Grade");
        } else if (marks>=70 && marks<=79)
        {
            System.out.println("C Grade");
        } else if (marks>=60 && marks<=69)
        {
            System.out.println("D Grade");

        } else if (marks>=50 && marks<=59)
        {
            System.out.println("E Grade");
        }else{
            System.out.println("Better Luck Next Time");
        }
        sc.close();
    }
}
