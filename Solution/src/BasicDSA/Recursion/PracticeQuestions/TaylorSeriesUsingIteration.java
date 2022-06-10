package BasicDSA.Recursion.PracticeQuestions;

public class TaylorSeriesUsingIteration {
    static double e(int x,int n){
        double sum=1;
        while(n>0){
            sum=1+((sum*x)/n);
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {
        int x=3;
        int n=10;
        System.out.println("Result : "+e(x,n));

    }
}
