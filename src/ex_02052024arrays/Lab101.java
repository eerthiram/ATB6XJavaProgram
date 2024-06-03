package ex_02052024arrays;

public class Lab101 {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        System.out.println(arr1==arr2); //The location(reference) isn't same. Object always see for same reference, only after thet ir returens true.//This is from Obj.java class-ref

        //In strings str1==str2 refers to the same contents/values stored in it, then it returns true. //string.java class-content
        String name1= "Keerthi";
        String name2= "Keerthi";
        System.out.println(name1.equals(name2));
    }
}
