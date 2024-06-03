package ex_04052024array2;

import java.util.Scanner;

public class Lab115stringsbuffer_string_Builder {
    public static void main(String[] args) {
        //getting input from the user.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string to check whether the given string is Palindrome or not: ");
        String input=sc.next();

        StringBuilder sb=new StringBuilder(input);//parsing the input in string builder.
        String reverse_input=sb.reverse().toString();
        if(reverse_input.equalsIgnoreCase(input)){
            System.out.println("Palindrome "+input);
        }else {
            System.out.println("Not a Palindrome");
        }
    }
}
