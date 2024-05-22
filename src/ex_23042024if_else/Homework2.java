package ex_23042024if_else;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //To check whether the given char is vowel or consonent.

        //Getting i/p from the user.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = sc.next().charAt(0);

        //if condition:
        if(ch == 'a'||ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u' )
        {
            System.out.println("It's vowel");
        }
        else
        {
            System.out.println("It's Consonent");
        }
    }
}