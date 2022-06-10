package Java.PracticeQuestions.HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BigInteger a=new BigInteger("1234");
        BigInteger b=new BigInteger("1234");
        BigInteger sum=a.add(b);
        BigInteger mult=a.multiply(b);
        System.out.println("Value of a = "+sum);
        System.out.println("Value of a = "+mult);

    }
}
