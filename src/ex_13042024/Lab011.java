package ex_13042024;

public class Lab011 {
    public static void main(String[] args) {
        //data_type var_name(identifier)= value(literal)

        //var 3 types
        //1.local = declared inside main method
        //2.instance= declared inside the class but outside the method
        //3.class= var are declared as static, can't be a local var

        //byte -128 to 127
        //int a=10; //local variable
        //byte a1=-128;// possible to store
        int a2=200; // isn't posible to store 200 as its size is -128 to 127
        a2=a2+1;//
        System.out.println(a2); //200+1=201 no t possible to store

        //short -32768 t0 32767
        int b=400000000;
        System.out.println(b);//isn't posible to store 32769 as size is -32768 t0 32767
    }
}
