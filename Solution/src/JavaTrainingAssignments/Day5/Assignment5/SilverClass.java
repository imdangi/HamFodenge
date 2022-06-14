package JavaTrainingAssignments.Day5.Assignment5;

public class SilverClass implements Card{
    final double MAX_CREDIT_LIMIT=50000;
    final double MAX_WITHDRAWAL=100000;
    final int GRACE_PERIOD=40;
    final byte MIN_AGE=(byte)18;
    final double MIN_SALARY=250000;
    final double JOINING_FEES=100;
    final double MAINTENANCE_FEES=500;
    final double APR=40;
    final double APR_WITH=35;


    @Override
    public void joiningFees(){
        System.out.println("Joining fees = Rs "+this.JOINING_FEES);
    }

    @Override
    public void yearlyMaintainanceFees(){
        System.out.println("Yearly Maintenance Fees= Rs "+this.MAINTENANCE_FEES);
    }
    @Override
    public void withdrawalLimit(){
        System.out.println("MAX Withdrawal Limit = Rs "+this.MAX_WITHDRAWAL);
    }


    @Override
    public void cardCreditLimit(){
        System.out.println("MAX Limit = Rs "+this.MAX_CREDIT_LIMIT);
    }

    @Override
    public void rewards() {
        System.out.println("List of Rewards : ");
        System.out.println("1. 2.5 % cashback on all online spends.");
        System.out.println("2. Free amazon voucher coupons.");

    }

    @Override
    public void gracePeriod() {
        System.out.println("Grace Period = "+this.GRACE_PERIOD+"days");

    }

    @Override
    public void APR() {
        System.out.println(this.APR+"% CI after grace Period");
        System.out.println(this.APR_WITH+"% CI on withdrawal.");

    }

    @Override
    public void minimumAge() {
        System.out.println("Minimum Age is "+this.MIN_AGE+" years.");
    }

    @Override
    public void minimumIncome() {

        System.out.println("Minimum Income is Rs "+this.MIN_SALARY);

    }


}
