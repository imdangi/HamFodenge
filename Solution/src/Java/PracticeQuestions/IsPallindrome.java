package Java.PracticeQuestions;

import java.util.Scanner;

public class IsPallindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        int originalNumber=number;
        int reversedNumber=0;
        while(number!=0){
            int lastDigit=number%10;
            reversedNumber=reversedNumber*10+lastDigit;
            number/=10;
        }

        if(reversedNumber==originalNumber){
            System.out.println("Yes , it is a palindrome");
        }
        else{
            System.out.println("No, not a palindrome");
        }
        scanner.close();
    }
}
