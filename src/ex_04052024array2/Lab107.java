package ex_04052024array2;

public class Lab107 {
    public static void main(String[] args) {
        //doubling the given array and storing it in the new array

        int[] a={10,30,40};
        int[] a1= new int[3];
        //doubling the values of a[]
        for(int i=0;i<a.length;i++){
            a1[i]=a[i]*2;
        }
        //System.out.println("Enter the doubled array:"+a1[i]);
        //For printing a number in an array you can print the no after coming out of the loop using print statement like the above statement.
        //but to print an array you have to aggain write a for loop for the new array that is to be printed.
        System.out.println("New array a1[]");
        for(int i=0; i<a1.length; i++){
            System.out.println(a1[i]);
        }
    }
}
