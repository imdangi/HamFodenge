package JavaTrainingAssignments.Day2;

import java.util.Locale;
import java.util.Scanner;

public class JavaStrings {
    static String toTitleCase(String inputString){
        String res="";
        for(int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);
            if(i==0){
                res=res+Character.toUpperCase(ch);
            }

            else {
                res = res + Character.toLowerCase(ch);
            }
        }
        return res;
    }

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        String A=scanner.nextLine();
        String B=scanner.nextLine();
        System.out.println(A.length()+B.length());
        int len=A.length();
        if(A.length()>B.length()){
            len=B.length();
        }

        boolean flag=true;

        for(int i=0;i<len;i++){

            if(A.charAt(i)==B.charAt(i)){
                continue;
            }
            else if(A.charAt(i)>B.charAt(i)){
                flag=false;
                System.out.println("Yes");
                break;
            }
            else {
                flag=false;
                System.out.println("No");
                break;
            }
        }
        if(flag==true){
            System.out.println("No");
        }

        System.out.println(toTitleCase(A)+" "+toTitleCase(B));
    }
}
