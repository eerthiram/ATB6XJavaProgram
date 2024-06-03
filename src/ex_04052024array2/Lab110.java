package ex_04052024array2;

public class Lab110 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++){  //0;0<3
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(""); //If i=1, j can be at max j=1.
            //i=2, j can run at max j=1,2
            //i=3, j can run at max j=1,2,3
        }
    }
}
