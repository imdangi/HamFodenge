package BasicDSA.Recursion;

public class TailRecursion {
    static void fun(int n){
        if(n>0){
            System.out.println("Value of n = "+n);
            fun(n-1);
        }
    }

    public static void main(String[] args) {
        int x=5;
        fun(x);
    }
}
