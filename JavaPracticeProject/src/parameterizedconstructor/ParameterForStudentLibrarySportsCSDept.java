package parameterizedconstructor;
class Student
{
	int StdNo;
	String StdName;
	int StdDYear;
	Student(int Stno,String Stna,int Stdy)
	{
		System.out.println("STUDENT DETAILS:");
		System.out.println("------------------------");
		StdNo = Stno;
		System.out.println("Student No: "+StdNo);
		StdName = Stna;
		System.out.println("Student Name: "+StdName);
		StdDYear = Stdy;
		System.out.println("Student Birth Year: "+StdDYear);
		System.out.println("************************");
	}
}

class Library
{
	int LibID;
	String BookName;
	String IssueM;
	Library(int LID,String BN,String Im)
	{
		System.out.println("LIBRARY DETAILS:");
		System.out.println("------------------------");
		LibID = LID;
		System.out.println("Library ID: "+LibID);
		BookName = BN;
		System.out.println("Book Name: "+BookName);
		IssueM = Im;
		System.out.println("Issueed Month: "+IssueM);
		System.out.println("************************");
	}
}

class Sports
{
	int SptID;
	String SptType;
	String SptName;
	Sports(int Sid,String Stp,String Spn)
	{
		System.out.println("SPORTS DETAILS:");
		System.out.println("------------------------");
		SptID = Sid;
		System.out.println("Sports ID: "+SptID);
		SptType = Stp;
		System.out.println("Sports Type: "+SptType);
		SptName = Spn;
		System.out.println("Sports Name: "+SptName);
		System.out.println("************************");
	}
}

class CSDepartment
{
	int CSDeptNo;
	String CSDeptName;
	String CSDeptDay;
	CSDepartment(int Cdno,String Cdna,String Cdd)
	{
		System.out.println("CS Department DETAILS:");
		System.out.println("------------------------");
		CSDeptNo = Cdno;
		System.out.println("CS Department ID: "+CSDeptNo);
		CSDeptName = Cdna;
		System.out.println("CS Department Name: "+CSDeptName);
		CSDeptDay = Cdd;
		System.out.println("Sports Name: "+CSDeptDay);
		System.out.println("************************");
	}
}

public class ParameterForStudentLibrarySportsCSDept {

	public static void main(String[] args) {
		// Order Class For Student Library Sports CSDepartment
		new Student(17,"Ganesh",1986);
	    new Library(1263,"Core Java","Nov");
		new Sports(127,"Indoor","Chess");
		new CSDepartment(11,"JLab","monday");

	}

}


