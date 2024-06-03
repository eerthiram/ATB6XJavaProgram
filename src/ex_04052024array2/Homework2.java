package ex_04052024array2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //Java code  to check if given element exsist in the 2D array or not(element:8 O/P:True)
        //intialising array
        int[][] a={{1,2,3},{4,5,6},{7,8,9}};
        int element=8;//intialising to find this element in array.//The reason to assign the value as false is max of the time we'll no find the search element in the first attempt.
        // for Loop to search the element.
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(element==a[i][j]){
                    System.out.println(element+"Found ");
                    break;
                }else{
                    System.out.println("Not found");
                }
            }
        }



    }
}
