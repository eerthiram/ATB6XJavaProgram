package ex_23042024if_else;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {

        //greatest of 3 numbers.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        double num1= sc.nextInt();
        double num2= sc.nextInt();
        double num3= sc.nextInt();
        if((num1>num2) && (num1>num3))
        {
            System.out.println("num1 is largest");
        } else if (num2>num3)
        {
            System.out.println("num2 is greater");
        }else{
            System.out.println("num3 is greater");
        }
        sc.close();
    }
}
