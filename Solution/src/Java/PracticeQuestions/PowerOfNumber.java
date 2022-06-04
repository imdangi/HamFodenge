package Java.PracticeQuestions;

import java.util.Scanner;

public class PowerOfNumber {

    static int power(int base,int expo){
        int res=base;
        for(int i=1;i<expo;i++){
            res*=base;
        }
        return res;

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base=scanner.nextInt();
        System.out.print("Enter Exponent: ");
        int exponent=scanner.nextInt();

        System.out.println("Power of "+base+"^"+exponent+" = "+power(base,exponent));
        scanner.close();
    }
}
