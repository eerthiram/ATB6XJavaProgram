package ex_02052024arrays;

public class Lab106 {
    public static void main(String[] args) {
        //highest age.
        int[] students_age={20,40,60,80,10,25};//declaring and defining array with arguments.
        int max_age=Integer.MIN_VALUE;
        for(int i=0;i< students_age.length; i++)
        {
            if(students_age[i]>max_age){
                max_age=students_age[i];
            }
        }
        System.out.println("Max age: "+max_age);
    }
}
