package Java.PracticeQuestions.HackerRank;

import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input1=scanner.nextLine();
        String input2=scanner.nextLine();
        input1=input1.toLowerCase();
        input2=input2.toLowerCase();

        if(input1.length()!=input2.length()){
            System.out.println("Not Anagrams");
        }
        else {
            char ch1[] = input1.toCharArray();
            char ch2[] = input2.toCharArray();

            for(int i=0;i<input1.length()-1;i++){
                for(int j=i+1;j<input1.length();j++) {
                    if ((int) ch1[i] > (int) ch1[j]) {
                        char temp = ch1[i];
                        ch1[i] = ch1[j];
                        ch1[j] = temp;
                    }
                }
            }
            for(int i=0;i<input1.length()-1;i++){
                for(int j=i+1;j<input1.length();j++) {
                    if ((int) ch2[i] > (int) ch2[j]) {
                        char temp = ch2[i];
                        ch2[i] = ch2[j];
                        ch2[j] = temp;
                    }
                }
            }
            String sortedString1=new String(ch1);
            String sortedString2=new String(ch2);

            if(sortedString2.equals(sortedString1)){
                System.out.println("Anagrams");
            }
            else{
                System.out.println("Not Anagrams");
            }

        }
    }
}
