package Java.PracticeQuestions.HackerRank;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String reversedString="";
        for(int i=input.length()-1;i>=0;i--){
            char ch=input.charAt(i);
            reversedString+=ch;
        }
        if(input.equals(reversedString)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
//        System.out.println("Original String : "+input);
//        System.out.println("Reversed String : "+reversedString);
    }
}
