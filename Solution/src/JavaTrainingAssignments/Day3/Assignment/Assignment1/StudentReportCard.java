package JavaTrainingAssignments.Day3.Assignment.Assignment1;

import java.util.Scanner;

public class StudentReportCard {
    private String school;
    private String name;
    private String rollno;
    private byte age;
    private String phoneNumber;
    private float marksInMath;
    private float marksInScience;
    private float marksInEnglish;
    private float totalMarks;
    private float percentage;
    private char grade;

    public StudentReportCard() {
        school = "ABC Public School";
    }

    public StudentReportCard(String name, String rollno) {
        this();
        this.name = name;
        this.rollno = rollno;
        inputDetails();
    }

    public void inputDetails() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome please enter additional detials : ");
        System.out.print("Enter your age : ");
        age = scanner.nextByte();
        System.out.print("Enter your phone number : ");
        phoneNumber = scanner.next();
        System.out.print("Enter your marks in Math : ");
        marksInMath = scanner.nextFloat();
        System.out.print("Enter your marks in Science : ");
        marksInScience = scanner.nextFloat();
        System.out.print("Enter your marks in English : ");
        marksInEnglish = scanner.nextFloat();
        scanner.close();

    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public float getMarksInMath() {
        return marksInMath;
    }

    public void setMarksInMath(float marksInMath) {
        this.marksInMath = marksInMath;
    }

    public float getMarksInScience() {
        return marksInScience;
    }

    public void setMarksInScience(float marksInScience) {
        this.marksInScience = marksInScience;
    }

    public float getMarksInEnglish() {
        return marksInEnglish;
    }

    public void setMarksInEnglish(float marksInEnglish) {
        this.marksInEnglish = marksInEnglish;
    }

    public String getRollno() {
        return rollno;
    }

    public float getTotalMarks() {
        totalMarks = getMarksInMath() + getMarksInEnglish() + getMarksInScience();
        return totalMarks;
    }

    public float getPercentage() {
        percentage = getTotalMarks() / 3;
        return percentage;
    }

    public char getGrade() {
        if (getTotalMarks() >= 90) {
            grade = 'A';
        } else if (getTotalMarks() >= 70 && getTotalMarks() < 90) {
            grade = 'B';
        } else if (getTotalMarks() > 60) {
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }

    public void printReportCard() {

        System.out.println("******************************************************");

        System.out.println("| Name : " + ToTitleCase.toTitleCase(getName()));

        System.out.println("| Roll no : "+getRollno());

        System.out.println("| Age : " + getAge());

        System.out.println("| Phone Number : " + getPhoneNumber());

        System.out.println("| --------------------- Marks -----------------------");
        System.out.println("| Math : " + getMarksInMath());
        System.out.println("| Science : " + getMarksInScience());
        System.out.println("| English : " + getMarksInEnglish());
        System.out.println("| ---------------------------------------------------");
        System.out.println("| Total Marks : " + getTotalMarks() + "/300");
        System.out.println("| Percentage  : " + getPercentage());
        System.out.println("| Grade : " + getGrade());

        System.out.println("******************************************************");

    }

}
