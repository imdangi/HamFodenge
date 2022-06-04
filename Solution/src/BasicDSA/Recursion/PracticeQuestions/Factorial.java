package BasicDSA.Recursion.PracticeQuestions;

import java.util.Scanner;

public class Factorial {
    static int fact(int num){
        if(num<=1){
            return 1;
        }
        return fact(num-1)*num;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number whose factorial is needed : ");
        int number=scanner.nextInt();
        int fact=fact(number);
        System.out.println("Factorial of "+number+"! = "+fact);
        scanner.close();
    }
}
