package ex_20042024;

public class Lab046 {
    public static void main(String[] args) {
        //String can be created in two ways,
        String Student_name= "Enjoy"; //1. using assignment operator.
        //String Student_name1= new String("core"); //2. using "new" operator.
        //System.out.println(Student_name1);

        //3 different ways of printing a string.
        System.out.println(Student_name);
        System.out.println("Your name:" +Student_name);
        System.out.printf("Your name %s", Student_name);

        System.out.println("--------------------");
        //Non primitive datatype like string has extra functions listed in dark black that can be used within it.
        //leng

        System.out.println(Student_name.length());// length of the string
        System.out.println(Student_name.toLowerCase());//Converts the string to Lower case letters
        System.out.println(Student_name.toUpperCase());//Converts the string to Upper case letters

        //OOPS- Everything should be a class, Non-primitive datatype like string are class. Primitive datatype doesn't come under OOPS. Because of this reason Java isn't purely object oriented.





    }
}
