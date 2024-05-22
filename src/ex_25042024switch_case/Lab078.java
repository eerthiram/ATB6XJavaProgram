package ex_25042024switch_case;

public class Lab078 {
    public static void main(String[] args) {

        //Another way for writing the switch case statements. In this format there is no need for break.
        char a1 = 'A';
        switch (a1) {
            case 'A', 'B','C' -> System.out.println("Vowel");
            default -> System.out.println("Consonent");
        }
    }
}
