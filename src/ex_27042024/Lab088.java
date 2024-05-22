package ex_27042024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //even or odd using while loop

        //getting input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number-> ");
        int i=sc.nextInt();//

        //While loop
        while(i%2==0){ //condition
            System.out.println("Even");
            i++;  //increament
        }
        System.out.println("Odd");

    }
}
