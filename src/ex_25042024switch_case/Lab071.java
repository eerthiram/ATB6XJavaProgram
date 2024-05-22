package ex_25042024switch_case;

import java.util.Scanner;

public class Lab071 {
    public static void main(String[] args) {
        //switch will be used in web automation.
        //While asking the user in which browser the code has to be executed.
        //browser like chrome, firefox, edge etc

        //Getting output from  the user.
        Scanner sc=new Scanner(System.in);
        System.out.println("Web automation demo using switch ");
        String browser_name=sc.next();

        //switch case
        switch(browser_name){
            case "chrome":
                System.out.println("Starting chrome browser");
                //Here the selenium code is written to run the respective browser
                //WebDriver driver=new Chrome();  //Selenium code
                break;
            case "firefox":
                System.out.println("Starting firefox browser");
                //Here the selenium code is written to run the respective browser.
                //WebDriver driver=new firefox();  //Selenium code
                break;
            default:
                System.out.println("Doesn't support");
        }
        }


}
