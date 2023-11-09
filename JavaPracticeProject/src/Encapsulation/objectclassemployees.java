package Encapsulation;
class Employees
{
	int EmpID;
	String EmpName;
	int EmpPhone;
	int EmpSalary;
}

class Department
{
	int DeptID;
	String DeptName;
	String DeptLocation;
	String DeptFloor;
}

class Insurance
{
	int InsNo;
	String InsType;
	int InsYear;
	int InsAmt;
}

public class objectclassemployees {

	public static void main(String[] args) {
		Employees obj1 = new Employees();
		System.out.println("EMPLOYEE DETAILS:");
		System.out.println("------------------------");
		obj1.EmpID = 111;
		System.out.println("Employee ID: "+obj1.EmpID);
		obj1.EmpName = "Prakash M";
		System.out.println("Employee Name: "+obj1.EmpName);
		obj1.EmpPhone = 958746213;
		System.out.println("Employee Phone: "+obj1.EmpPhone);
		obj1.EmpSalary = 25000;
		System.out.println("Employee Salary: "+obj1.EmpSalary);
		System.out.println("************************");
		obj1.EmpID = 112;
		System.out.println("Employee ID: "+obj1.EmpID);
		obj1.EmpName = "Praveen D";
		System.out.println("Employee Name: "+obj1.EmpName);
		obj1.EmpPhone = 958725213;
		System.out.println("Employee Phone: "+obj1.EmpPhone);
		obj1.EmpSalary = 28000;
		System.out.println("Employee Salary: "+obj1.EmpSalary);
		System.out.println("************************");
		obj1.EmpID = 113;
		System.out.println("Employee ID: "+obj1.EmpID);
		obj1.EmpName = "Nagesh K";
		System.out.println("Employee Name: "+obj1.EmpName);
		obj1.EmpPhone = 958746228;
		System.out.println("Employee Phone: "+obj1.EmpPhone);
		obj1.EmpSalary = 22000;
		System.out.println("Employee Salary: "+obj1.EmpSalary);
		System.out.println("************************");
		obj1.EmpID = 114;
		System.out.println("Employee ID: "+obj1.EmpID);
		obj1.EmpName = "Prakash M";
		System.out.println("Employee Name: "+obj1.EmpName);
		obj1.EmpPhone = 958446213;
		System.out.println("Employee Phone: "+obj1.EmpPhone);
		obj1.EmpSalary = 30000;
		System.out.println("Employee Salary: "+obj1.EmpSalary);
		System.out.println("************************");
		Department obj2 = new Department();
		System.out.println("DEPARTMENT DETAILS:");
		System.out.println("------------------------");
		obj2.DeptID = 11;
		System.out.println("Department ID: "+obj2.DeptID);
		obj2.DeptName = "Computer";
		System.out.println("Department Name: "+obj2.DeptName);
		obj2.DeptLocation = "Bangalore";
		System.out.println("Department Location: "+obj2.DeptLocation);
		obj2.DeptFloor = "First Floor";
		System.out.println("Department Floor: "+obj2.DeptFloor);
		System.out.println("************************");
		obj2.DeptID = 12;
		System.out.println("Department ID: "+obj2.DeptID);
		obj2.DeptName = "Testing";
		System.out.println("Department Name: "+obj2.DeptName);
		obj2.DeptLocation = "Mysore";
		System.out.println("Department Location: "+obj2.DeptLocation);
		obj2.DeptFloor = "Second Floor";
		System.out.println("Department Floor: "+obj2.DeptFloor);
		System.out.println("************************");
		obj2.DeptID = 13;
		System.out.println("Department ID: "+obj2.DeptID);
		obj2.DeptName = "Mechanical";
		System.out.println("Department Name: "+obj2.DeptName);
		obj2.DeptLocation = "Bangalore";
		System.out.println("Department Location: "+obj2.DeptLocation);
		obj2.DeptFloor = "Second Floor";
		System.out.println("Department Floor: "+obj2.DeptFloor);
		System.out.println("************************");
		obj2.DeptID = 14;
		System.out.println("Department ID: "+obj2.DeptID);
		obj2.DeptName = "R and D";
		System.out.println("Department Name: "+obj2.DeptName);
		obj2.DeptLocation = "Bangalore";
		System.out.println("Department Location: "+obj2.DeptLocation);
		obj2.DeptFloor = "Third Floor";
		System.out.println("Department Floor: "+obj2.DeptFloor);
		System.out.println("************************");
		Insurance obj3 = new Insurance();
		System.out.println("INSURANCE DETAILS:");
		System.out.println("------------------------");
		obj3.InsNo = 21;
		System.out.println("Insurance Number: "+obj3.InsNo);
		obj3.InsType = "Life";
		System.out.println("Insurance Type: "+obj3.InsType);
		obj3.InsYear = 2022;
		System.out.println("Insurance Date: "+obj3.InsYear);
		obj3.InsAmt = 25000;
		System.out.println("Insurance Amount: "+obj3.InsAmt);
		System.out.println("************************");
		obj3.InsNo = 22;
		System.out.println("Insurance Number: "+obj3.InsNo);
		obj3.InsType = "Car";
		System.out.println("Insurance Type: "+obj3.InsType);
		obj3.InsYear = 2020;
		System.out.println("Insurance Date: "+obj3.InsYear);
		obj3.InsAmt = 28000;
		System.out.println("Insurance Amount: "+obj3.InsAmt);
		System.out.println("************************");
		obj3.InsNo = 23;
		System.out.println("Insurance Number: "+obj3.InsNo);
		obj3.InsType = "Life";
		System.out.println("Insurance Type: "+obj3.InsType);
		obj3.InsYear = 2018;
		System.out.println("Insurance Date: "+obj3.InsYear);
		obj3.InsAmt = 30000;
		System.out.println("Insurance Amount: "+obj3.InsAmt);
		System.out.println("************************");
		obj3.InsNo = 24;
		System.out.println("Insurance Number: "+obj3.InsNo);
		obj3.InsType = "Bike";
		System.out.println("Insurance Type: "+obj3.InsType);
		obj3.InsYear = 2023;
		System.out.println("Insurance Date: "+obj3.InsYear);
		obj3.InsAmt = 26000;
		System.out.println("Insurance Amount: "+obj3.InsAmt);
		System.out.println("************************");
	}
}