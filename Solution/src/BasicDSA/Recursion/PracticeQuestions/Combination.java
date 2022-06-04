package BasicDSA.Recursion.PracticeQuestions;

import java.util.Scanner;

public class Combination {
    static int nCr(int n,int r){
        if(r==0 || n==r){
            return 1;
        }
        else{
            return nCr(n-1,r-1)+nCr(n-1,r);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value fo n to calculate nCr");
        int n=scanner.nextInt();
        System.out.println("Enter the value fo r to calculate nCr");
        int r=scanner.nextInt();
        System.out.println("Result of "+n+"C"+r+" = "+nCr(n,r));

    }
}
