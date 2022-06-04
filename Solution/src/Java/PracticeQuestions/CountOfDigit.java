package Java.PracticeQuestions;

import java.util.Scanner;

public class CountOfDigit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        int count=0;
        while(number!=0){
            count++;
            number/=10;
        }
        System.out.println("No of digits = "+count);
        scanner.close();
    }
}
