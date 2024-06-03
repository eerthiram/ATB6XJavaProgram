package ex_02052024arrays;

public class Lab108 {
    public static void main(String[] args) {
        //2D arrays
        //i->rows
        //j->columns
        //For finding no of rows->in for loop use array_name.length in the condition area.
        //For finding no of columns-> in for loop use array_name[i].length in the condition area.

        //declaring and defining 2D array
        int[][] array1={{24,34,44},
                {35,36,37},
                {38,39,30}
        };
        //int[][] array2=new array2[3][3];

        //For printing the array of elements.
        for(int i=0;i< array1.length;i++){//Shows no of rows in an array.
            for(int j=0;j< array1[i].length;j++){//Shows no of columns in an array.
                System.out.println("Printing array:");
                System.out.println("array1[i][j]:"+array1[i][j]);
            }
        }


    }
}
