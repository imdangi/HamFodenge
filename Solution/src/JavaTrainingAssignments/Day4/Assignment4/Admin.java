package JavaTrainingAssignments.Day4.Assignment4;

public class Admin extends Person{
    private String department;
    public Admin(String fullName, String phoneNumber,String department){
        super(fullName,phoneNumber);
        this.department=department;
    }

    @Override
    void printDetails(){
        super.printDetails();
        System.out.println("Admin Department : "+this.department);
    }
    void adminRoles(){
        System.out.println("Roles : \n 1. Manage the systems. \n 2. Manage the security. \n 3. Proper Monitoring.");
    }
    void adminRights(){
        System.out.println("Full Rights : \n 1. Can access all system. \n 2. Full authority to disable users if wrong doing was found.");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
