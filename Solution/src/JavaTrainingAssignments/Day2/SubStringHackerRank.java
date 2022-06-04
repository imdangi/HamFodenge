package JavaTrainingAssignments.Day2;

import java.util.Scanner;

public class SubStringHackerRank {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        int start=scanner.nextInt();
        int end=scanner.nextInt();
        String res="";

        for(int i=start;i<end;i++){
            res=res+input.charAt(i);
        }
        System.out.println(res);

        scanner.close();

    }
}
