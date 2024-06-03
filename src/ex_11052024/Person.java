package ex_11052024;

public class Person {

    //This class Person doesn't run as the obj for the class isn't created, the program is unable to run.
    //Attributes
    String name;
    int age;
    String address;
    double ph_no;
    double salary;

    //Funtionalities/behaviour
    void walk(){
        System.out.println("I can walk");
    }
    void talk(String msg){
        System.out.println("The message is:"+msg);
    }
    void sleep(){
        System.out.println("I can sleep");
    }
    void eat(String eatable){
        System.out.println("I ate :"+eatable);
    }
}
