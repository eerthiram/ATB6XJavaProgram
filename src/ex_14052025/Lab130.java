package ex_14052025;

public class Lab130 {
    public static void main(String[] args) {
        //creating obj for the class that is created.
        ATB6 atb6=new ATB6();
        //ATB6->class name
        //atb6-> obj ref
        //new ATB6()-> keyword+class name-> object.

        //When u want to create an obj without 'new' keyword, then it becomes calling a function.
        //ATB6 atb6= ATB6();

        System.out.println(atb6.course_name);//When there is no values to return, by default it returns "null"
    }

}
