package ex_25042024switch_case;

import java.util.Scanner;

public class Lab080 {
    //Cube root of values
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();

        double result=Math.cbrt(Math.pow(a,2) + Math.pow(b,2) + Math.pow(c,2));
        System.out.println(result);
    }
}
