package JavaTrainingAssignments.Day3;

public class SumOfArray {

    public static void main(String[] args) {
        int sum=0;
        int[][] arr = new int[2][3];
        int value=10;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=value;
                value+=value;
            }
        }
        System.out.println("Elements of array : ");
        for(int a[]:arr){
            for(int element:a){
                System.out.print(element+" ");
                sum+=element;
            }
            System.out.println();
        }
        System.out.println("Sum of array elements : "+sum);
    }
}
