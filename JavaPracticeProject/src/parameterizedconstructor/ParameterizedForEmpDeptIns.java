package parameterizedconstructor;
class Employees
{
	int EmpID;
	String EmpName;
	int EmpPhone;
	int EmpSalary;
	Employees(int Eid,String Ena, int Eno,int Esl)
	{
		System.out.println("EMPLOYEE DETAILS:");
		System.out.println("------------------------");
		EmpID = Eid;
		System.out.println("Employee ID: "+EmpID);
		EmpName = Ena;
		System.out.println("Employee Name: "+EmpName);
		EmpPhone = Eno;
		System.out.println("Employee Phone: "+EmpPhone);
		EmpSalary = Esl;
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
	Department(int Did,String Dna, String Dln, String Dfr)
	{
		System.out.println("DEPARTMENT DETAILS:");
		System.out.println("------------------------");
		DeptID = Did;
		System.out.println("Department ID: "+DeptID);
		DeptName = Dna;
		System.out.println("Department Name: "+DeptName);
		DeptLocation = Dln;
		System.out.println("Department Location: "+DeptLocation);
		DeptFloor = Dfr;
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
	Insurance(int Isn, String Ist,int Isy, int Isa)
	{
		System.out.println("INSURANCE DETAILS:");
		System.out.println("------------------------");
		InsNo = Isn;
		System.out.println("Insurance Number: "+InsNo);
		InsType = Ist;
		System.out.println("Insurance Type: "+InsType);
		InsYear = Isy;
		System.out.println("Insurance Date: "+InsYear);
		InsAmt = Isa;
		System.out.println("Insurance Amount: "+InsAmt);
		System.out.println("************************");
	}
}

public class ParameterizedForEmpDeptIns {

	public static void main(String[] args) {
		// Object class For Employee Department Insurance
		new Employees(50181,"Ganesh N",77607914,75000);
		new Department(11,"Compurt Science","Shimoga","First Floor");
		new Insurance(265,"LIC",2016,5000);

	}

}


