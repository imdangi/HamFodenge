package BasicDSA.Recursion.PracticeQuestions;

import java.util.Scanner;

public class TaylorSeries {

    static double pow=1;
    static double fact=1;
     static double e(int x,int n){
         double res;
        if(n==0){
            return 1;
        }
        else{
            res=e(x,n-1);
            pow=pow*x;
            fact=fact*n;
            return res+pow/fact;
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter number of terms : ");
        int n=scanner.nextInt();

        System.out.println("Final Result = : " +e(3,n));
        scanner.close();
    }
}
