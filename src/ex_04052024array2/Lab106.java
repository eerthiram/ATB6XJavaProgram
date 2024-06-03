package ex_04052024array2;

public class Lab106 {
    public static void main(String[] args) {
        //intialising the array to print the highest age
        int age[]={30,40,50,10,12,5,-1};
        //assigning max val=int.min value because if there are negative values present in an array we have to compare the max value with all the no in array
        int max_age=Integer.MIN_VALUE;
        for (int i=0; i<age.length; i++){
            if (age[i]>max_age){
                max_age=age[i];
            }
        }//Always printing the max valueshould be outside the loop
        System.out.println("Highest age :" +max_age);
    }
}
