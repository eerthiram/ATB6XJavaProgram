package ex_04052024array2;

public class Homework3 {
    public static void main(String[] args) {
        //Code to transpose the 2D array(O/P: {1,4,7}{2,5,8}{3,6,9}
        //original matrix.
        int[][] org_matrix={{1,4,7},{2,5,8},{3,6,9}};
        //allocating space for transpose matrix.

        int[][] transpose=new int[3][3];

        //displaying original matrics without transpose.
        for(int i=0;i< org_matrix.length;i++){
            for(int j=0;j< org_matrix[i].length;j++){
                System.out.println(org_matrix[i][j]+" ");
            }
        }
        System.out.println("-----");

        //displaying the transpose matrix from original matrix.
        //Logic: In the original matrix the column values are shifted to rows so while printing we have write "org_matrix[j][i]".
        for(int i=0;i< transpose.length;i++){
            for(int j=0;j< transpose[i].length;j++){
                System.out.println(org_matrix[j][i]+" ");
            }
        }
    }
}
