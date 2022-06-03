package JavaTrainingAssignments.Day1;
import java.io.File;
import java.io.PrintStream;

/**
 * Task : Get the output in file instead of console
 *
 * @author Manoj Kumar
 * @Date 3 June 2021
 */

public class Output {

    public static void main(String[] args) throws Exception{
        PrintStream myOutput=new PrintStream(new File("E:/Java-VsCode/Files/output.txt"));
        System.setOut(myOutput);

        //Creating a program to print all even numbers from 0 to 100 and getting output in file

        for(int i=0;i<=200;i++){
            System.out.println(" Even number : "+i);
        }
    }

}

