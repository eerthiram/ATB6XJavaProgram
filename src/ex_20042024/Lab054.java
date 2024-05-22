package ex_20042024;

public class Lab054 {
    public static void main(String[] args) {

        //Types of funtions that can be used in strings
        String s1="Cat";
        String s2=s1.concat("Kitten");//concat
        System.out.println(s2);
        System.out.println(s1==s2);//to check whether stored in same reference.
        System.out.println(s1.equals(s2));//to check whether both var has same value.
        char d=s2.charAt(7);
        System.out.println(d);//charAt
        boolean b=s1.contains("f");
        System.out.println(b);//contains
    }
}
