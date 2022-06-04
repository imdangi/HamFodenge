package BasicDSA.Recursion;

public class HeadRecursion {

    static void fun(int n){
        if(n>0){
            fun(n-1);
            System.out.println("Value of n = "+n);
        }
    }

    public static void main(String[] args) {
        int x=5;
        fun(x);
    }
}
