package BasicDSA.Recursion.PracticeQuestions;

public class TaylorSeriesUsingHornerRule {

    static double Sum=1;

    static double e(int x,int n){
        if(n==0){
            return Sum;
        }
        Sum=1+((x*Sum)/n);
        return e(x,n-1);
    }

    public static void main(String[] args) {
        int x=3;
        int n=10;
        System.out.println("Result = : "+e(x,n));
    }
}
