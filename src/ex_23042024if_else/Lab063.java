package ex_23042024if_else;

import java.util.Scanner;

public class Lab063 {
    public static void main(String[] args) {
        //for getting a value for a var from user directly.
        //Scanner sc=new Scanner(System.in);
        //int num=sc.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no");
        int z= sc.nextInt();

        if(z%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        //finaly we have to close the scanner.
        sc.close();
    }
}
