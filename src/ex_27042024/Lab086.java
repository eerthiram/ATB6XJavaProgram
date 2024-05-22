package ex_27042024;

public class Lab086 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Even");
                continue;//Meaning of continue means it goes back to for loop again.
            }
            System.out.println("Odd");
        }
    }
}
