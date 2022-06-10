package JavaTrainingAssignments.Day4.PropertiesFiles;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class GreetUser {
    public static void main(String[] args) throws Exception {
        Locale locale=new Locale("hi","IN");
        ResourceBundle rb=ResourceBundle.getBundle("message",locale);
        Scanner scanner=new Scanner(System.in);

        final String COMPANY_NAME="Brain-Mentors";
        System.out.print("Enter your name : ");
        String name= scanner.nextLine();
        System.out.print("Enter training day : ");
        byte day=scanner.nextByte();

        System.out.println(rb.getString("welcome"));
        System.out.println(rb.getString("companyNameMessage")+ " "+COMPANY_NAME);
        System.out.println(rb.getString("nameMessage")+" "+name);
        System.out.println(rb.getString("trainingDayMessage")+ " "+day);
        System.out.println(rb.getString("thanksMessage"));
        scanner.close();

    }
}
