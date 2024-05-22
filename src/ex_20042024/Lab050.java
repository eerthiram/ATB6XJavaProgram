package ex_20042024;

public class Lab050 {
    public static void main(String[] args) {
        String s="ram";
        String s1="Keerthi";
        String s2= new String("ram");
        //to check the values of s & s1 are same without using (==) operator, use String_name1.equals(String_name2), this returns boolean value (True/False) according to the condition.
        System.out.println(s.equals(s2)); //equals refers to the values, if they are same returns 'true', else 'false'.
        System.out.println(s == s2);// == operator refers to the reference(location), if they are same returns 'true', else 'false'.
    }
}
