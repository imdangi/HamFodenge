package BasicDSA.Recursion;

public class TreeRecursion {
    static void fun(int n){
        if(n>0){
            System.out.println("Value of n at Calling time : "+n);
            fun(n-1);
            fun(n-1);
            System.out.println("Value of n at second function returning time = "+n);

        }
    }

    public static void main(String[] args) {
        int x=5;
        fun(x);
    }
}
