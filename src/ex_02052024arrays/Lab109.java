package ex_02052024arrays;

public class Lab109 {
    public static void main(String[] args) {
        int[][] array1={{23,24},
                {25,26},
                {27,28}};

        for(int i=0; i< array1.length;i++){
            for(int j=0;j< array1[i].length;j++){
                System.out.println("array1: "+array1[i][j]);
            }
        }
    }
}
