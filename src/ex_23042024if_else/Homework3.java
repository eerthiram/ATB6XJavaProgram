package ex_23042024if_else;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        //Getting the input from the user.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        double year=sc.nextDouble();

        //Leap year condition.
        if(year%400==0 && year%100!=0 || year%4==0)
        {
            System.out.println("Leap Year");
        }else
        {
            System.out.println("Not a Leap year");
        }
    }
}
