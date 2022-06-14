package JavaTrainingAssignments.Day5.Assignment5;

public class DiamondCard implements Card{
    final double MAX_CREDIT_LIMIT=5000000;
    final double MAX_WITHDRAWAL=10000000;
    final int GRACE_PERIOD=90;
    final byte MIN_AGE=(byte)25;
    final double MIN_SALARY=25000000;
    final double JOINING_FEES=5000;
    final double MAINTENANCE_FEES=5000;
    final double APR=30;
    final double APR_WITH=25;


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

    @Override
    public void EMI(){
        System.out.println("Yes EMI enabled with a limit of Rs 1000000");
    }
    @Override
    public void noCostEMI(){
        System.out.println("Yes no cost Emi also enabled on selected products.");
    }

    @Override
    public void easyEMI(){
        System.out.println("Yes easy EMI enabled.");
    }

    @Override
    public void protectionAgainstFraud(){
        System.out.println("Full Protection against fraud.");
    }
    @Override
    public void security(){
        System.out.println("New chip enabled card.");
    }

    @Override
    public void loanFacility(){
        System.out.println("Yes loan facility is enabled up to Rs 50000000");
    }

    @Override
    public void payLater(){
        System.out.println("Yes pay later is enabled on flipkart and amazon only");
    }
    @Override
    public void fuelWaiver(){
        System.out.println("Yes on minimum spent of Rs. 1000000");
    }
    @Override
    public void cardAddOn(){
        System.out.println("Yes you can enable a maximum of 5 cards.");
    }

    @Override
    public void airportLoungeAccessdefault (){
        System.out.println("Yes access in 18 airports world wide.");
    }

    @Override
    public void insuranceCoverage(){
        System.out.println("Insurance Coverage enabled.");
    }


}
