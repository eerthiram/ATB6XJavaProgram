package ex_04052024array2;

public class Homework4 {
    public static void main(String[] args) {
        //Find the min number in 2D array.
        //int[][] array1={{1,2,3},
        //      {4,5,6},
        //    {7,8,9}};
        int[][] array1={{1,2,3},{4,5,6},{7,8,9}};
        int min_value=Integer.MAX_VALUE;
        for(int i=0;i<array1.length;i++){
            for(int j=0;j<array1[i].length;j++){
                if(array1[i][j]<min_value){
                    min_value=array1[i][j];
                }
            }
        }
        System.out.println("The min value of arr1[i][j]: "+min_value);
    }
}
