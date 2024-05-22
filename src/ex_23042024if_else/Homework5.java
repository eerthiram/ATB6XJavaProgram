package ex_23042024if_else;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        //If else-condition statement
        //if else-if else-multiple condition statement(instead of this we can use switch statement.
        //switch- multiple condition

        //Getting input from the user:
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the day: ");
        int day=sc.nextInt();

        //switch case
        switch (day) {
            case 1:
                System.out.println("Mon!");
                break;
            case 2:
                System.out.println("Tues!");
                break;
            case 3:
                System.out.println("Wed!");
                break;
            case 4:
                System.out.println("Thurs!");
                break;
            case 5:
                System.out.println("Fri!");
                break;
            default:
                System.out.println("Only 1-7 are allowed");
        }
        sc.close();
    }
}
