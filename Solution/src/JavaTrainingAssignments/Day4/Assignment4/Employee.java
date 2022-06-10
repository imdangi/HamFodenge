package JavaTrainingAssignments.Day4.Assignment4;

public class Employee extends Person{
    private String companyName;
    private double salary;
    private String role;
    private String experience;
    private double bonus;
    private boolean isFullTime;


    public Employee(String fullName,byte age,String phoneNumber,char gender,String email){
        super(fullName,age,phoneNumber,gender,email);
        companyName="TCS Ltd";
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("Company Name : "+this.companyName);
        System.out.println("Salary : "+this.salary);
        System.out.println("Role : "+this.role);
        System.out.println("Experience : "+this.experience);
        System.out.println("Bonus : "+this.bonus);

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

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }
}
