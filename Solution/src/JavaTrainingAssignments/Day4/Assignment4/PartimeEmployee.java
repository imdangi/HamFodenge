package JavaTrainingAssignments.Day4.Assignment4;

public class PartimeEmployee extends Employee{
        private int noOfHours;


        public PartimeEmployee(String fullName, String phoneNumber,String companyName,double salary,String role,int noOfHours){
                super(fullName, phoneNumber,companyName,salary,role);
                this.noOfHours=noOfHours;
        }

        @Override
        void calculateBonus(){
                System.out.println("--------------- Bonus ------------------");
                System.out.println("OOPs ! Partime employees are not eligible for bonus....");
                System.out.println("We are waiting to see you full time employee soon ..");
        }

        @Override
        void attendance(){
                System.out.println("------------- Attendance ---------------");
                System.out.println("You are working "+noOfHours+"hours per week");
        }


        @Override
        void printDetails(){
                super.printDetails();

        }

        public int getNoOfHours() {
                return noOfHours;
        }

        public void setNoOfHours(int noOfHours) {
                this.noOfHours = noOfHours;
        }

}
