package Java.PracticeQuestions;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter how many number of the series you want: ");
        int number=scanner.nextInt();
        int firstNumber=0;
        int secondNumber=1;
        for(int i=0;i<number;i++){
            System.out.print(firstNumber + " ");
            int temp=firstNumber;
            firstNumber=secondNumber;
            secondNumber=temp+firstNumber;
        }
        scanner.close();
    }
}
