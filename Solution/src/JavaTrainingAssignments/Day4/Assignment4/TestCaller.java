package JavaTrainingAssignments.Day4.Assignment4;

public class TestCaller {
    public static void main(String[] args) {
        Caller caller1=new Caller(new Admin("Manoj Kumar","9805420108","IT"));
        Caller caller2=new Caller(new Customer("Manoj Kumar","9805444444",true));
        Caller caller3=new Caller(new FullTimeEmployee("Rohit Chauhan","8989989889","Infoys Ltd",102020,"Java Developer"));
        Caller caller4=new Caller(new PartimeEmployee("Rajveer Kaur","78778787889","TCS Ltd",102020,"Jr Developer",25));
        Caller caller5=new Caller(new FreeLancer("Khush Shaswat","9989899889","Google Ltd",102020,"Lead Manager","Sales Marketing",25));
    }
}
