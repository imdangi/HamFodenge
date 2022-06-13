package JavaTrainingAssignments.Day4.Assignment4;

abstract public class Person {
    private String fullName;
    private String phoneNumber;


    public Person(String fullName,String phoneNumber){
        this.fullName=fullName;
        this.phoneNumber=phoneNumber;
    }

    void printDetails(){
        System.out.println("Name : "+this.fullName);
        System.out.println("Phone Number : "+phoneNumber);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
