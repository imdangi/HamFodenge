package JavaTrainingAssignments.Day4.Assignment4;

public class Customer extends Person{
    private boolean isVipMember;
    public Customer(String fullName, String phoneNumber, boolean isVip){
        super(fullName,phoneNumber);
        this.isVipMember=isVip;
    }
    void membershipStatus(){
        if(this.isVipMember){
            System.out.println("You are a Vip Member");
        }
        else{
            System.out.println("OOPs we can't wait to see you as a VIP member");
        }
    }

    @Override
    void printDetails(){
        super.printDetails();
    }

    public boolean isVipMember() {
        return isVipMember;
    }

    public void setVipMember(boolean vipMember) {

        isVipMember = vipMember;
    }

}
