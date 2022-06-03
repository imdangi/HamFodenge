//package JavaTrainingAssignments.Day1;

/**
 * Find the sum of values inputted through command line argument
 *
 * @author Manoj Kumar
 * @Date 3 June 2022
 */

public class Sum {

    public static void main(String[] args) {
        int length=args.length;
        int sum=0;
        for(int i=0;i<length;i++){
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println("Sum = "+sum);
    }
}
