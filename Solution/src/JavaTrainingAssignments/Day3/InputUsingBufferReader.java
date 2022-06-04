package JavaTrainingAssignments.Day3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputUsingBufferReader {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your name : ");
        String name=br.readLine();
        System.out.print("Please enter your age : ");
        int age=Integer.parseInt(br.readLine());
        System.out.print("Please enter your salary : ");
        double salary =Double.parseDouble(br.readLine());

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
        br.close();
    }
}
