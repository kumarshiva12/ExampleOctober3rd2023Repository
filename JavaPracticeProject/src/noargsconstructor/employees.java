package noargsconstructor;
class Employees
{
	int EmpID;
	String EmpName;
	int EmpPhone;
	int EmpSalary;
	Employees()
	{
		System.out.println("EMPLOYEE DETAILS:");
		System.out.println("------------------------");
		EmpID = 111;
		System.out.println("Employee ID: "+EmpID);
		EmpName = "Prakash M";
		System.out.println("Employee Name: "+EmpName);
		EmpPhone = 958746213;
		System.out.println("Employee Phone: "+EmpPhone);
		EmpSalary = 25000;
		System.out.println("Employee Salary: "+EmpSalary);
		System.out.println("************************");
	}
}

class Department
{
	int DeptID;
	String DeptName;
	String DeptLocation;
	String DeptFloor;
	Department()
	{
		System.out.println("DEPARTMENT DETAILS:");
		System.out.println("------------------------");
		DeptID = 11;
		System.out.println("Department ID: "+DeptID);
		DeptName = "Computer";
		System.out.println("Department Name: "+DeptName);
		DeptLocation = "Bangalore";
		System.out.println("Department Location: "+DeptLocation);
		DeptFloor = "First Floor";
		System.out.println("Department Floor: "+DeptFloor);
		System.out.println("************************");
	}
}

class Insurance
{
	int InsNo;
	String InsType;
	int InsYear;
	int InsAmt;
	Insurance()
	{
		System.out.println("INSURANCE DETAILS:");
		System.out.println("------------------------");
		InsNo = 21;
		System.out.println("Insurance Number: "+InsNo);
		InsType = "Life";
		System.out.println("Insurance Type: "+InsType);
		InsYear = 2022;
		System.out.println("Insurance Date: "+InsYear);
		InsAmt = 25000;
		System.out.println("Insurance Amount: "+InsAmt);
		System.out.println("************************");
	}
	public static void main(String[] args) {
		// Object class For Employee Department Insurance
		Employees obj1 = new Employees();
		Department obj2 = new Department();
		Insurance obj3 = new Insurance();
	}
}


	