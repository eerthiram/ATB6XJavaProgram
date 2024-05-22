package ex_20042024;

public class Lab048 {
    public static void main(String[] args) {
        String s3="The Testing Academy";
        s3 = s3.toUpperCase();
        System.out.println(s3);
        //Strings are immutable.
        // If you need to change the values of the string regularly, don't use string class but use string buffer/string builder

        String s4 = s3.substring(2,5);//In the string from the starting of the string is printed but end value isn't printed.
        System.out.println(s4);

        System.out.println(s3.indexOf("T"));
    }
}
