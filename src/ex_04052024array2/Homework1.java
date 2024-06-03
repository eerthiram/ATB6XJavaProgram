package ex_04052024array2;

public class Homework1{
    public static void main(String[] args) {
        //Find the max number in 2D array.
        //int[][] array1={{1,2,3},
        //      {4,5,6},
        //    {7,8,9}};
        int[][] array1={{1,2,3},{4,5,6},{7,8,9}};
        int max_value=Integer.MIN_VALUE;
        for(int i=0;i< array1.length;i++){
            for(int j=0;j< array1[i].length;j++){
                if(array1[i][j]>max_value){
                    max_value=array1[i][j];
                }
            }
        }
        System.out.println("The max_value in 2D array: "+max_value);
    }
}
