package JavaTrainingAssignments.Day4.Assignment4;

public class Person {
    private String fullName;
    private byte age;
    private String phoneNumber;
    private char gender;
    private String email;

    public Person(String fullName,byte age,String phoneNumber,char gender,String email){
        this.age=age;
        this.fullName=fullName;
        this.phoneNumber=phoneNumber;
        this.gender=gender;
        this.email=email;
    }

    public void printDetails(){
        System.out.println("Name : "+this.fullName);
        System.out.println("Age : "+this.age);
        System.out.println("Phone Number : "+phoneNumber);
        System.out.println("Gender : "+this.gender);
        System.out.println("Email : "+this.email);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
