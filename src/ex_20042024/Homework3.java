package ex_20042024;

public class Homework3 {
    public static void main(String[] args) {
        //max among 3 nos with conditional operator.
        int a=20;
        int b=30;
        int c=25;

        // a,b
        //a,c
        //b,c
        System.out.println((a>b) ? (a>c)?a:c : (b>c)?b:c);

        int x=40;
        int y=20;
        int z=25;
        System.out.println((x>y) ? (x>z)?x:z : (y>z)?y:z );

        int d=1;
        int e=2;
        int f=3;
        System.out.println((d>e) ? (d>f)?d:f :(e>f)?e:f);

    }
}
