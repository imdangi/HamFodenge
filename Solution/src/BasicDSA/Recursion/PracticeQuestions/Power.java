package BasicDSA.Recursion.PracticeQuestions;

import java.util.Scanner;

public class Power {

    static int getPower(int base,int exponent){
        if(exponent<1){
            return 1;
        }
        return base*getPower(base,exponent-1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number whose factorial is needed : ");
        int base=scanner.nextInt();
        System.out.print("Enter number whose factorial is needed : ");
        int exponent=scanner.nextInt();

        int power=getPower(base,exponent);
        System.out.println("Power of "+base+"^"+exponent+" = "+power);
        scanner.close();
    }
}
