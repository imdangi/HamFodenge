package Java.PracticeQuestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        int reversedNumber=0;
        while(number!=0){
            int lastDigit=number%10;
            reversedNumber=reversedNumber*10+lastDigit;
            number/=10;
        }
        System.out.println("Reversed Number = "+reversedNumber);
        scanner.close();
    }
}
