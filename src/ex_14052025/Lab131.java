package ex_14052025;

public class Lab131 {
    public static void main(String[] args) {
        ATB6 objref1=new ATB6();
        ATB6 objref2=new ATB6();
        ATB6 objref3=null;//The obj isn't created as no new operator is used and null is assigned to the obj_ref

        //For a class, diff obj can be created.(eg: objref1,objref2)
        //For a class, only one constructor is created as the constructor name is same name as that of class name, JVM throws error.
    }

}
