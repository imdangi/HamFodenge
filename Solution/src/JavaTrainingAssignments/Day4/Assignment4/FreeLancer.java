package JavaTrainingAssignments.Day4.Assignment4;

public class FreeLancer extends Employee{

    private int duration;
    private String project;


    public FreeLancer(String fullName, String phoneNumber,String companyName,double salary,String role,String project,int duration){
        super(fullName, phoneNumber,companyName,salary,role);
        this.duration=duration;
        this.project=project;
    }

    void projectDetails(){
        System.out.println("You are working on the project : "+this.project);
        System.out.println("This project will end in "+this.duration+" days.");
        System.out.println("We wish you a very good luck for your project.");
    }

    @Override
    void calculateBonus(){
        System.out.println("OOPs ! FreeLancer employees are not eligible for bonus....");
    }

    @Override
    void attendance(){
        System.out.println("You are working for duration of "+this.duration+" days.");
    }

    @Override
    void printDetails(){
        super.printDetails();
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }
}
