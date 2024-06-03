package ex_02052024arrays;

public class Lab107 {
    public static void main(String[] args) {
        //lowest age
        int[] students_age={20,40,60,80,10,25};
        int min_age=Integer.MAX_VALUE;
        for(int i=0;i<students_age.length;i++)
        {
            if (students_age[i]<min_age){
                min_age = students_age[i];
            }
        }
        System.out.println("Min age: "+min_age);
    }
}

