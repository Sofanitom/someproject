package Daytwopractis;

import java.util.Scanner;

public class EmployeeInfo2 {
// TODO Auto-generated ,ethod stub
	
	public static void main(String[] args) {
		
	
	Scanner sc = new Scanner(System.in);	
	System.out.println("Craft knowledge");
	
	
		System.out.println("please enter your full name:");
	String empName = sc.next();
	
	System.out.println("please enter your age:");
	int empAge = sc.nextInt();
	
	System.out.println("please enter your salary:");
	double empSalary = sc.nextDouble();
	
	System.out.println("please enter your bonus");
	double empBonus = sc.nextDouble();
	
	System.out.println("pls enter the empgender");
	String str=sc.next();
	char ch=str.charAt(0);
	double totalSalary = empSalary + empBonus;
	
	// To print out the result on the console we will use this commands
	
	System.out.println("Employee Name: " + empName);
	System.out.println("Employee Age: " + empAge);
	System.out.println("Employee Salary: " + empSalary);
	System.out.println("Employee Bonus: " + empBonus);
	System.out.println("Employee Total Salary: " + totalSalary);
    System.out.println("Employe Gender:"+ ch);

   
}}
