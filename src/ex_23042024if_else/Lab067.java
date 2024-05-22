package ex_23042024if_else;

import java.util.Scanner;

public class Lab067 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark=sc.nextInt();
        if(mark>=90)
        {
            System.out.println("Scored 90%");
        }
        else if(mark<90 && mark>50)
        {
            System.out.println("Scored 80%");
        }
        else
        {
            System.out.println("Average marks");
        }
    }
}
