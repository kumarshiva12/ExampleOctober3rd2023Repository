package Encapsulation;
class Student
{
	int StdNo;
	String StdName;
	int StdDYear;
}

class Library
{
	int LibID;
	String BookName;
	String IssueM;
}

class Sports
{
	int SptID;
	String SptType;
	String SptName;
}

class CSDepartment
{
	int CSDeptNo;
	String CSDeptName;
	String CSDeptDay;
}

public class studentlibrarysports {

	public static void main(String[] args) {
		// Order Class For Student Library Sports CSDepartment
		Student obj1 = new Student();
		System.out.println("STUDENT DETAILS:");
		System.out.println("------------------------");
		obj1.StdNo = 1;
		System.out.println("Student No: "+obj1.StdNo);
		obj1.StdName = "Anand";
		System.out.println("Student Name: "+obj1.StdName);
		obj1.StdDYear = 2000;
		System.out.println("Student Birth Year: "+obj1.StdDYear);
		System.out.println("************************");
		obj1.StdNo = 2;
		System.out.println("Student No: "+obj1.StdNo);
		obj1.StdName = "Nagaraj";
		System.out.println("Student Name: "+obj1.StdName);
		obj1.StdDYear = 2000;
		System.out.println("Student Birth Year: "+obj1.StdDYear);
		System.out.println("************************");
		obj1.StdNo = 3;
		System.out.println("Student No: "+obj1.StdNo);
		obj1.StdName = "Praveen";
		System.out.println("Student Name: "+obj1.StdName);
		obj1.StdDYear = 2001;
		System.out.println("Student Birth Year: "+obj1.StdDYear);
		System.out.println("************************");
		obj1.StdNo = 4;
		System.out.println("Student No: "+obj1.StdNo);
		obj1.StdName = "Prakash";
		System.out.println("Student Name: "+obj1.StdName);
		obj1.StdDYear = 2002;
		System.out.println("Student Birth Year: "+obj1.StdDYear);
		System.out.println("************************");
		Library obj2 = new Library();
		System.out.println("LIBRARY DETAILS:");
		System.out.println("------------------------");
		obj2.LibID = 21;
		System.out.println("Library ID: "+obj2.LibID);
		obj2.BookName = "Core Java";
		System.out.println("Book Name: "+obj2.BookName);
		obj2.IssueM = "Nov";
		System.out.println("Issueed Month: "+obj2.IssueM);
		System.out.println("************************");
		obj2.LibID = 22;
		System.out.println("Library ID: "+obj2.LibID);
		obj2.BookName = "SQL";
		System.out.println("Book Name: "+obj2.BookName);
		obj2.IssueM = "Nov";
		System.out.println("Issueed Month: "+obj2.IssueM);
		System.out.println("************************");
		obj2.LibID = 23;
		System.out.println("Library ID: "+obj2.LibID);
		obj2.BookName = "Python";
		System.out.println("Book Name: "+obj2.BookName);
		obj2.IssueM = "Nov";
		System.out.println("Issueed Month: "+obj2.IssueM);
		System.out.println("************************");
		obj2.LibID = 24;
		System.out.println("Library ID: "+obj2.LibID);
		obj2.BookName = "Selinium";
		System.out.println("Book Name: "+obj2.BookName);
		obj2.IssueM = "Nov";
		System.out.println("Issueed Month: "+obj2.IssueM);
		System.out.println("************************");
		Sports obj3 = new Sports();
		System.out.println("SPORTS DETAILS:");
		System.out.println("------------------------");
		obj3.SptID = 51;
		System.out.println("Sports ID: "+obj3.SptID);
		obj3.SptType = "Indore";
		System.out.println("Sports Type: "+obj3.SptType);
		obj3.SptName = "Chess";
		System.out.println("Sports Name: "+obj3.SptName);
		System.out.println("************************");
		obj3.SptID = 52;
		System.out.println("Sports ID: "+obj3.SptID);
		obj3.SptType = "Indore";
		System.out.println("Sports Type: "+obj3.SptType);
		obj3.SptName = "Ludo";
		System.out.println("Sports Name: "+obj3.SptName);
		System.out.println("************************");
		obj3.SptID = 53;
		System.out.println("Sports ID: "+obj3.SptID);
		obj3.SptType = "Outdoor";
		System.out.println("Sports Type: "+obj3.SptType);
		obj3.SptName = "Hokey";
		System.out.println("Sports Name: "+obj3.SptName);
		System.out.println("************************");
		obj3.SptID = 54;
		System.out.println("Sports ID: "+obj3.SptID);
		obj3.SptType = "Outdoor";
		System.out.println("Sports Type: "+obj3.SptType);
		obj3.SptName = "Basket Ball";
		System.out.println("Sports Name: "+obj3.SptName);
		System.out.println("************************");
		CSDepartment obj4 = new CSDepartment();
		System.out.println("CS Department DETAILS:");
		System.out.println("------------------------");
		obj4.CSDeptNo = 11;
		System.out.println("CS Department ID: "+obj4.CSDeptNo);
		obj4.CSDeptName = "Java Lab";
		System.out.println("CS Department Name: "+obj4.CSDeptName);
		obj4.CSDeptDay = "Mon";
		System.out.println("Sports Name: "+obj4.CSDeptDay);
		System.out.println("************************");
		obj4.CSDeptNo = 1;
		System.out.println("CS Department ID: "+obj4.CSDeptNo);
		obj4.CSDeptName = "Python Lab";
		System.out.println("CS Department Name: "+obj4.CSDeptName);
		obj4.CSDeptDay = "Fri";
		System.out.println("Sports Name: "+obj4.CSDeptDay);
		System.out.println("************************");
		obj4.CSDeptNo = 13;
		System.out.println("CS Department ID: "+obj4.CSDeptNo);
		obj4.CSDeptName = "C++ Lab";
		System.out.println("CS Department Name: "+obj4.CSDeptName);
		obj4.CSDeptDay = "Wed";
		System.out.println("Sports Name: "+obj4.CSDeptDay);
		System.out.println("************************");
		obj4.CSDeptNo = 14;
		System.out.println("CS Department ID: "+obj4.CSDeptNo);
		obj4.CSDeptName = "Hacking";
		System.out.println("CS Department Name: "+obj4.CSDeptName);
		obj4.CSDeptDay = "Tue";
		System.out.println("Sports Name: "+obj4.CSDeptDay);
		System.out.println("************************");
	}
}


