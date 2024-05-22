package ex_23042024if_else;

import java.util.Scanner;

public class Lab066 {
    public static void main(String[] args) {

        //Getting o/p directly from the user.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 2 nos: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        //Finding max with Math.max(num1, num2) function.
        System.out.println(Math.max(num1,num2));


    }
}
