package BasicDSA.Recursion;

public class IndirectRecursion {
    static void A(int n ){
        if(n>0){
            System.out.println("Value of n at Function A : "+n);
            B(n-1);
        }
    }

    static void B(int n){
        if(n>0){
            System.out.println("Value of n at Function B : "+n);
            A(n-1);
        }
    }

    public static void main(String[] args) {
        int x = 10;
        A(x);
    }
}
