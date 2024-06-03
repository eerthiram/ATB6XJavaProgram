package ex_04052024array2;

import java.util.Scanner;

public class Lab114stringsbuffer_string_Builder {
    public static void main(String[] args) {
        //Normal strings are immutable-once the values are assigned they can't be changed.
        //String builders & String buffers are mutable where the values stored in it can be deleted or inserted and no new strings are cfeated for adding the values into it.
        //String buffer is thread safe whereas string builder isn't thread safe.
        //String buffer-one by one is added or deleted so its thread safe.And its a slow process.
        //String builder-everything is added at a time. so it isn't thread safe.

        //Palindrome(Reversing a string)
        //getting the input from the user
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string to check its Palindrome or not: ");
        String user_input=sc.next();

        //Parsing the user_input into the string builder.
        StringBuilder sb=new StringBuilder(user_input);
        String reverse_input =sb.reverse().toString();
        if(user_input.equalsIgnoreCase(reverse_input)){
            System.out.println("Palindrome: "+user_input);
        }else{
            System.out.println("Not a Palindrome");
        }



    }
}
