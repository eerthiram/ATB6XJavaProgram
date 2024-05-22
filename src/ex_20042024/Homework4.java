package ex_20042024;

public class Homework4 {
    public static void main(String[] args) {

        //a^2 + b^2 + |c|
        double a=20, b=30, c=20.5;
        double d=Math.pow(20,2);
        System.out.println(d);
        double e=Math.pow(30,2);
        System.out.println(e);
        System.out.println(Math.cbrt(d+e+c));
    }
}
