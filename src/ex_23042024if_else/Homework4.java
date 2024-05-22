package ex_23042024if_else;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        //getting input from the user.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();

        //condition for checking whether the no is fizz, buzz or fizzBuzz.
        for(int i=1; i<=n; i++)
        if(i%3==0){
            System.out.println("Fizz");
        } else if (i%5==0) {
            System.out.println("Buzz");
        } else if ((i%3==0)&&(i%5==0)) {
            System.out.println("FizzBuzz");
        }else{
            System.out.println(i);
        }
        sc.close();
    }
}
