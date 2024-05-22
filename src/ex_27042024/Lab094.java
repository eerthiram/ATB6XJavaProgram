package ex_27042024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        //Fizz buzz
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no: ");
        int n=sc.nextInt();

        if(n%2==0){
            System.out.println("Fizz");
        } else if (n%3==0) {
            System.out.println("Buzz");
        } else if (n%2==0 && n%3==0) {
            System.out.println("FizzBuzz");
        }else{
            System.out.println(n);
        }
        sc.close();
    }

}
