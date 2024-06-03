package ex_02052024arrays;

import java.util.Arrays;

public class Lab104 {
    public static void main(String[] args) {
        int[] salary = {30, 25, 24, 13, 40};
        //max of salaries
        for (int i = 0; i < salary.length; i++) {
            System.out.println(Arrays.stream(salary).max());
        }
    }
}
