package BasicDSA.Recursion.PracticeQuestions;

import java.util.Scanner;

public class FibonacciSeries {
    static void getFiboSeries(int firstNumber,int secondNumber,int n){
        if(n>0){
            System.out.print(firstNumber+" ");
            getFiboSeries(secondNumber,firstNumber+secondNumber,n-1);
        }

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter how many number of the series you want: ");
        int number=scanner.nextInt();
        int firstNumber=0;
        int secondNumber=1;
        getFiboSeries(firstNumber,secondNumber,number);
        scanner.close();
    }
}
