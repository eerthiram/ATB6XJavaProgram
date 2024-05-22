package ex_25042024switch_case;

public class Lab075 {
    public static void main(String[] args) {
        byte b=10;
        switch(b){
            case 5:
                System.out.println("Five");//As b=10, this case willn't execute.
                break;
            case 10:
                System.out.println("Ten");//As b=10, this case will execute.
                break;
            default:
                System.out.println("Done");// If both the above cases doesn't match the declared varthen default will get executed

        }

    }
}
