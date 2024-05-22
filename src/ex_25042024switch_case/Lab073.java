package ex_25042024switch_case;

import java.util.Scanner;

public class Lab073 {
    public static void main(String[] args) {
        //Getting input from the user and findingwhether its a vowel or consonent.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        char input =sc.next().charAt(0);

        //switch case
        switch (input){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("It's a consonent");
        }
    }
}
