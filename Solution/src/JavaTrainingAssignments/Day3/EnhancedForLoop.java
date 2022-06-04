package JavaTrainingAssignments.Day3;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int arr[][]=new int[3][];
        arr[0]=new int[10];
        arr[1]=new int[15];
        arr[2]=new int[20];

        for(int a[]:arr){
            for(int element:a){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }
}
