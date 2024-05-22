package ex_25042024switch_case;

public class Lab077 {
    public static void main(String[] args) {
        int itemCode = 003;

        //Another way for writing the switch case statements. In this format there is no need for break.
        switch (itemCode) {
            case 001, 002, 003 -> System.out.println("Done");
            case 004, 005, 006 -> System.out.println("NOT DONE");
            default -> System.out.println("OK");
        }
    }
}
