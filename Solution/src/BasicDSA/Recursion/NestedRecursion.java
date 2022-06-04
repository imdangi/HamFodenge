package BasicDSA.Recursion;

public class NestedRecursion {

    static int function(int n){
        if(n>100){
            return(n-10);
        }
        else{
            return(function(function(n+11)));
        }
    }
    public static void main(String[] args) {
        int x=95;
        System.out.println("Last value returned by function : "+function(x));
    }
}
