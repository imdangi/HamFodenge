package Java.PracticeQuestions;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact*=i;
        }

        System.out.println("Factorial of "+number+"! = "+fact);
        scanner.close();
    }
}
