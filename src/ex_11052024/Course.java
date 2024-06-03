package ex_11052024;

public class Course {
    private String language;
    private String name;

    public static void main(String[] args) {
        //Mini Project 1
        //Create 3 classes like Course,Student & Payment with attributes and behaviours inside it.
        //Create obj of 3 students and assign the values.
        System.out.println("Hello printing the real world entities");
        Course testing=new Course();//created a class and object.
        //Attributes.
        testing.name = "Selenium_java";
        System.out.println(testing.name);
        testing.language = "Java";
        System.out.println(testing.language);


    }
}

