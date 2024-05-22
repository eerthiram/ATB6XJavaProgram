package ex_23042024if_else;

import java.util.Scanner;

public class Lab069 {
    public static void main(String[] args) {
        //Triangle Classifier.
        //Given the i/p find the type of triangle:
        //1.All sides equal-Equilateral.
        //2.2 sides equal-isoceles.
        //3.no sides are equal- scalene.


        //Getting i/p from the user.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter side1, side2, side3: ");
        double side1=sc.nextInt();
        double side2=sc.nextInt();
        double side3=sc.nextInt();
// All sides should be same so we are using &&(AND) operator.
        if((side1==side2) && (side1==side3) && (side2==side3)){
            System.out.println("It's Equilateral Triangle");
            //Any 2 sides should be same, so we are using ||(OR) operator.
        } else if (((side1==side2) || (side1==side3) || (side2==side3))) {
            System.out.println("It's isoceles Triangle");
        } else  {
            System.out.println("It's Scalene Triangle");
        }
        sc.close();
    }
}
