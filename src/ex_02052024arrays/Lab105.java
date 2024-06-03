package ex_02052024arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Lab105 {
    public static void main(String[] args) {
        //Functions are pre-built utilities-Math.pow()
        //eg- ready made pizza base(pre-built)

        //taking input in array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        float[] marks= new float[5];
        System.out.println("1st mark: ");
        marks[0]= sc.nextFloat();
        System.out.println("2st mark: ");
        marks[1]= sc.nextFloat();
        System.out.println("3st mark: ");
        marks[2]= sc.nextFloat();
        System.out.println("4st mark: ");
        marks[3]= sc.nextFloat();
        System.out.println("5st mark: ");
        marks[4]= sc.nextFloat();


        //bad, good, average
        for(int i=0;i<marks.length;i++)
        {
            if(marks[i]<30){
                System.out.println("Fail");
            } else {
                System.out.println("Pass");
            }
        }
    }
}
