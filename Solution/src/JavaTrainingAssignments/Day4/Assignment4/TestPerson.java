package JavaTrainingAssignments.Day4.Assignment4;

public class TestPerson {
    public static void main(String[] args) {
        Employee emp=new Employee("Manoj Kumar", (byte) 21,"9805420108",'M',"manoj8894421801@gmail.com");
        emp.setSalary(100000);
        emp.printDetails();
    }
}
