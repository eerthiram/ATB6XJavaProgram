package ex_18042024;

public class Lab044 {

    public static void main(String[] args) {
        int a=10;
        System.out.println(++a + a++ + a++);
        //Part A-> ++a=1+10=11, a=11
        //Part B->+
        //Part C->a++=11, Exp value is 11, but in next line a value is a=12.
        //Part D->+
        //Part E->a++=12
        //11+11+12=44.




        int b=20;
        System.out.println(b++ + ++b + b++);
        //Part A-> Exp val=b++=20, answer =21.
        //Part B-> Exp val=++b=1+21=22 answer=22
        //Part C-> Exp val=b++=22 //as it is the last expression there is only assignment and there is no increment in b value.
        //21+22+22=65
    }
}


