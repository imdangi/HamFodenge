package JavaTrainingAssignments.Day4.Assignment4;

public class FullTimeEmployee extends Employee{
    public FullTimeEmployee(String fullName,String phoneNumber,String companyName,double salary,String role){

        super(fullName, phoneNumber,companyName,salary,role);
        setFullTime(true);
        setRemainingHolidays(2);
    }

    @Override
    void calculateBonus(){
        System.out.println("---------- Bonus ------------------");
        System.out.println("Hola! You are eligible for bonus... ");
        System.out.println("You earned Rs. "+(this.getSalary()*0.50)+ " during this month." );
    }

    @Override
    void attendance(){
        System.out.println("------------- Attendance -----------------");
        System.out.println("You are working 5 days a week.\n You have "+this.getRemainingHolidays()+" free holidays remaining.");
    }
    @Override
    void printDetails(){
        super.printDetails();
    }


}
