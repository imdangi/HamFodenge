package JavaTrainingAssignments.Day4.Assignment4;

abstract class Employee extends Person{
    private String companyName;
    private double salary;
    private String role;
    private boolean fullTime;
    private int remainingHolidays;


    public Employee(String fullName, String phoneNumber, String companyName, double salary, String role){
        super(fullName,phoneNumber);
        this.salary=salary;
        this.role=role;
        this.companyName=companyName;
    }

    abstract void calculateBonus();
    abstract void attendance();
    @Override
    void printDetails(){
        super.printDetails();
        System.out.println("Company Name : "+this.companyName);
        System.out.println("Salary : "+this.salary);
        System.out.println("Role : "+this.role);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public int getRemainingHolidays() {
        return remainingHolidays;
    }

    public void setRemainingHolidays(int remainingHolidays) {
        this.remainingHolidays = remainingHolidays;
    }
}
