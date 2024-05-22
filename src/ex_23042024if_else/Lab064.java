package ex_23042024if_else;

import java.util.Scanner;

public class Lab064 {
    public static void main(String[] args) {
        //getting input from user.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        double s=sc.nextInt();
        if(s%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        sc.close();
    }
}
