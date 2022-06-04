package Java.PracticeQuestions;

import java.util.Scanner;

public class IsArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        int originalNumber=number;
        int sumOfDigits=0;
        while(number!=0){
            int lastDigit=number%10;
            sumOfDigits+=lastDigit*lastDigit*lastDigit;
            number/=10;
        }

        if(sumOfDigits==originalNumber){
            System.out.println("Yes , it is a armstrong number");
        }
        else{
            System.out.println("No, not a armstrong number");
        }
        scanner.close();
    }
}
