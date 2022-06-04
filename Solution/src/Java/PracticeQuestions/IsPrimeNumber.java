package Java.PracticeQuestions;

import java.util.Scanner;

public class IsPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number : ");
        int number=scanner.nextInt();
        boolean flag=true;

        for(int i=2;i*i<=number;i++){
            if(number%i==0){
                flag=false;
                break;
            }
        }

        if(number<1){
            System.out.println("Invalid Number -> Please enter positive number greater than 0");
        }
        else{
            if(flag){
                System.out.println("Prime number.");
            }
            else{
                System.out.println("Not Prime number.");
            }
        }

        scanner.close();
    }
}
