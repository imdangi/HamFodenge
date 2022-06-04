/**
 * Salary Calculator Assignment Day 2
 * Problem :
 *          Enter Basic Salary
 *          HRA = 30% of BS
 *          DA = 10% of BS
 *          TA = 20% of BS
 *          MA = 15% of BS
 *          PF = 10% of BS
 * Task : Generate Salary Slip
 *
 * @author Manoj Kumar
 */

package JavaTrainingAssignments.Day2;

import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class SalarySlip {

    public static void main(String[] args) {

        //Declaration
        final float HRA=0.30f;
        final float DA=0.10f;
        final float TA=0.20f;
        final float MA=0.15f;
        final float PF=0.10f;
        double calHRA,calDA,calTA,calMA,calPF,calTax;
        double totalSalary,netSalary;

        //Taking Input
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your Basic Salary : ");
        double basicSalary=scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter your full name : ");
        String employeeFullName=scanner.nextLine();

        //Calculation
        calHRA=basicSalary*HRA;
        calDA=basicSalary*DA;
        calTA=basicSalary*TA;
        calMA=basicSalary*MA;
        calPF=basicSalary*PF;

        totalSalary=basicSalary+calHRA+calDA+calTA+calMA-calPF;

        if(totalSalary*12<500000){
            calTax=0;
        }
        else if(totalSalary*12>=500000 && totalSalary*12<750000){
            calTax=totalSalary*0.10;
        }
        else if(totalSalary*12>=750000 && totalSalary*12<1000000){
            calTax=totalSalary*0.20;
        }
        else{
            calTax=totalSalary*0.30;
        }

        netSalary=totalSalary-calTax;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime date = LocalDateTime.now();


        //Salary Slip formatting
        System.out.println("*************************************************************");
        System.out.println("----------------------- Salary Slip -------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Employee Name : "+employeeFullName+" |");
        System.out.println("| Date : "+dtf.format((date)));
        System.out.println("-------------------------------------------------------------");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Earnings :                ||           Deductions (-)      |");
        System.out.println("-------------------------------------------------------------");
        System.out.println("| Salary : "+basicSalary);
        System.out.println("-------------------------------------------------------------");
        System.out.println("| HRA : "+calHRA);
        System.out.println("-------------------------------------------------------------");
        System.out.println("| DA : "+calDA);
        System.out.println("-------------------------------------------------------------");
        System.out.println("| TA : "+calTA);
        System.out.println("-------------------------------------------------------------");
        System.out.println("| MA : "+calMA);
        System.out.println("-------------------------------------------------------------");
        System.out.println("|                                       PF : "+calPF);
        System.out.println("-------------------------------------------------------------");
        System.out.println("*************************************************************");
        System.out.println("| Total Salary (Before Deducting tax ) : "+totalSalary);
        System.out.println("| Total Tax : "+calTax);
        System.out.println("| Net Salary   (After Deducting tax) = "+netSalary);
        System.out.println("*************************************************************");

        scanner.close();
    }
}






















