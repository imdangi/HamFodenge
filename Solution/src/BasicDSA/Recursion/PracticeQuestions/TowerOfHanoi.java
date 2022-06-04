package BasicDSA.Recursion.PracticeQuestions;

import java.util.Scanner;

public class TowerOfHanoi {
    static void TOH(int size, char sourcePeg,char destinationPeg,char auxiliaryPeg){
        if(size>0) {
            TOH(size - 1, sourcePeg, auxiliaryPeg, destinationPeg);
            System.out.println("Move disk " + size + " from " + sourcePeg + " to " + destinationPeg );
            TOH(size - 1, auxiliaryPeg, destinationPeg, sourcePeg);
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number of disks : ");
        int size=scanner.nextInt();
        TOH(size,'A','C','B');
    }
}
