package BasicDSA.Recursion.PracticeQuestions;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    static int getSum(int num){
        if(num<=1){
            return 1;
        }
        return num+getSum(num-1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to get sum : ");
        int number=scanner.nextInt();
        int sum=getSum(number);
        System.out.println("Sum of n natural numbers up to "+number+" = "+sum);

        scanner.close();
    }
}
