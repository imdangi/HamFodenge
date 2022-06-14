package JavaTrainingAssignments.Day5.Assignment5;

public class TestCaller {
    public static void main(String[] args) {
        Caller caller1=new Caller(new SilverClass());
        Caller caller2=new Caller(new GoldCard());
        Caller caller3=new Caller(new DiamondCard());
    }
}
