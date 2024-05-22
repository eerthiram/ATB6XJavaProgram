package ex_25042024switch_case;

public class Lab076 {
    public static void main(String[] args) {
        //itemcode can be executed in JDK>13 devoces
        // A new feature where in a single case more values can be added.

        int itemcode=002;
        switch(itemcode){
            case 001,002,003:
                System.out.println("Done");
                break;
            case 004,005,006:
                System.out.println("NOT DONE");
                break;
            default:
                System.out.println("OK");
        }
    }
}
