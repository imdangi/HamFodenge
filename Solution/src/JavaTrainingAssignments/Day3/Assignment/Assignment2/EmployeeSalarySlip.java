package JavaTrainingAssignments.Day3.Assignment.Assignment2;


import JavaTrainingAssignments.Day3.Assignment.Assignment1.ToTitleCase;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class EmployeeSalarySlip {

    //Declaration
    final private float HRA=0.30f;
    final private float DA=0.10f;
    final private float TA=0.20f;
    final private float MA=0.15f;
    final private float PF=0.10f;
    private double calHRA;
    private double calDA;
    private double calTA;
    private double calMA;
    private double calPF;
    private double calTax;
    private double totalSalary;
    private double netSalary;
    private String employeeId;
    private String company;
    private double basicSalary;
    private String employeeName;
    EmployeeSalarySlip(){
        this.company="ABC Ltd";
    }
    EmployeeSalarySlip(String employeeId,String employeeName,double basicSalary){
        this();
        this.basicSalary=basicSalary;
        this.employeeName=employeeName;
        this.employeeId=employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getCalHRA() {
        setCalHRA();
        return calHRA;
    }

    public void setCalHRA() {
        this.calHRA = HRA*basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getCalDA() {
        setCalDA();
        return calDA;
    }

    public void setCalDA() {
        this.calDA = basicSalary*DA;
    }

    public double getCalTA() {
        setCalTA();
        return calTA;
    }

    public void setCalTA() {
        this.calTA = basicSalary*TA;
    }

    public double getCalMA() {
        setCalMA();
        return calMA;
    }

    public void setCalMA() {
        this.calMA = basicSalary*MA;
    }

    public double getCalPF() {
        setCalPF();
        return calPF;
    }

    public void setCalPF() {
        this.calPF = basicSalary*calPF;
    }
    public double getCalTax(){
        setCalTax();
        return calTax;
    }

    public void setCalTax() {
        if(getTotalSalary()*12<500000){
            calTax=0;
        }
        else if(getTotalSalary()*12>=500000 && getTotalSalary()*12<750000){
            calTax=getTotalSalary()*0.10;
        }
        else if(getTotalSalary()*12>=750000 && getTotalSalary()*12<1000000){
            calTax=getTotalSalary()*0.20;
        }
        else{
            calTax=getTotalSalary()*0.30;
        }
    }

    public double getTotalSalary() {
        setTotalSalary();
        return totalSalary;
    }

    public void setTotalSalary(){
        this.totalSalary=basicSalary+getCalDA()+getCalMA()+getCalHRA()+getCalTA()-getCalPF();
    }


    public double getNetSalary() {
        setNetSalary();
        return netSalary;
    }

    public void setNetSalary() {
        this.netSalary = getTotalSalary()-getCalTax();
    }



    public void printSalarySlip(){
        Locale locale=new Locale("en","in");
        NumberFormat nf=NumberFormat.getCurrencyInstance(locale);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yy");
        String date=sdf.format(new Date());

        System.out.println("*************************************************************");
        System.out.println("----------------------- Salary Slip -------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Employee Name : "+ ToTitleCase.toTitleCase(getEmployeeName())+" |");
        System.out.println("| Date : "+date);
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Earnings :                ||           Deductions (-)      |");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Salary : "+nf.format(getBasicSalary()));
        System.out.println("-------------------------------------------------------------");
        System.out.println("| HRA : "+nf.format(getCalHRA()));
        System.out.println("-------------------------------------------------------------");
        System.out.println("| DA : "+nf.format(getCalDA()));
        System.out.println("-------------------------------------------------------------");
        System.out.println("| TA : "+nf.format(getCalTA()));
        System.out.println("-------------------------------------------------------------");
        System.out.println("| MA : "+nf.format(getCalMA()));
        System.out.println("-------------------------------------------------------------");
        System.out.println("|                                       PF : "+nf.format(getCalMA()));
        System.out.println("-------------------------------------------------------------");
        System.out.println("*************************************************************");
        System.out.println("| Total Salary (Before Deducting tax ) = "+nf.format(getTotalSalary()));
        System.out.println("| Total Tax = "+nf.format(getCalTax()));
        System.out.println("| Net Salary (After Deducting tax) = "+nf.format(getNetSalary()));
        System.out.println("*************************************************************");
    }


}
