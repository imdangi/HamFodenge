package JavaTrainingAssignments.Day1;

import java.text.NumberFormat;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        double salary = 9000;
        Locale locale = new Locale("hi","IN");
        //  Date date = new date();

        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String formattedSalary = nf.format(salary);
        System.out.println(formattedSalary);
    }
}
