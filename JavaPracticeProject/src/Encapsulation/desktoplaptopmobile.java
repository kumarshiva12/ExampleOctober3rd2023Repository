package Encapsulation;
class Desktop
{
	int DetpID;
	String MfrName;
	String DetpType;
	int DetpPrice;
}

class Laptop
{
	int LapID;
	String MfrName;
	String Madein;
	int LapPrice;
}

class Mobile
{
	int MblNo;
	String MfrName;
	int MfrYear;
	int MblPrice;
}

public class desktoplaptopmobile {

	 
	
		public static void main(String[] args) {
			// Object Class For Desktop Laptop Mobile
			Desktop obj1 = new Desktop();
			System.out.println("DESKTOP DETAILS:");
			System.out.println("------------------------");
			obj1.DetpID = 111;
			System.out.println("Desktop ID: "+obj1.DetpID);
			obj1.MfrName = "HP";
			System.out.println("Desktop Name: "+obj1.MfrName);
			obj1.DetpType = "Home";
			System.out.println("Desktop Type: "+obj1.DetpType);
			obj1.DetpPrice = 25000;
			System.out.println("Desktop Price: "+obj1.DetpPrice);
			System.out.println("************************");
			obj1.DetpID = 112;
			System.out.println("Desktop ID: "+obj1.DetpID);
			obj1.MfrName = "Dell";
			System.out.println("Desktop Name: "+obj1.MfrName);
			obj1.DetpType = "Office";
			System.out.println("Desktop Type: "+obj1.DetpType);
			obj1.DetpPrice = 28000;
			System.out.println("Desktop Price: "+obj1.DetpPrice);
			System.out.println("************************");
			obj1.DetpID = 113;
			System.out.println("Desktop ID: "+obj1.DetpID);
			obj1.MfrName = "Lenovo";
			System.out.println("Desktop Name: "+obj1.MfrName);
			obj1.DetpType = "Gaming";
			System.out.println("Desktop Type: "+obj1.DetpType);
			obj1.DetpPrice = 40000;
			System.out.println("Desktop Price: "+obj1.DetpPrice);
			System.out.println("************************");
			obj1.DetpID = 114;
			System.out.println("Desktop ID: "+obj1.DetpID);
			obj1.MfrName = "MSI";
			System.out.println("Desktop Name: "+obj1.MfrName);
			obj1.DetpType = "Home";
			System.out.println("Desktop Type: "+obj1.DetpType);
			obj1.DetpPrice = 35000;
			System.out.println("Desktop Price: "+obj1.DetpPrice);
			System.out.println("************************");
			
			Laptop obj2 = new Laptop();
			System.out.println("LAPTOP DETAILS:");
			System.out.println("------------------------");
			obj2.LapID = 121;
			System.out.println("Laptop ID: "+obj2.LapID);
			obj2.MfrName = "Lenovo";
			System.out.println("Manufactured Name: "+obj2.MfrName);
			obj2.Madein = "JAPAN";
			System.out.println("Made in: "+obj2.Madein);
			obj2.LapPrice = 25000;
			System.out.println("Laptop Price: "+obj2.LapPrice);
			System.out.println("************************");
			obj2.LapID = 122;
			System.out.println("Laptop ID: "+obj2.LapID);
			obj2.MfrName = "HP";
			System.out.println("Manufactured Name: "+obj2.MfrName);
			obj2.Madein = "UK";
			System.out.println("Made in: "+obj2.Madein);
			obj2.LapPrice = 30000;
			System.out.println("Laptop Price: "+obj2.LapPrice);
			System.out.println("************************");
			obj2.LapID = 123;
			System.out.println("Laptop ID: "+obj2.LapID);
			obj2.MfrName = "Aser";
			System.out.println("Manufactured Name: "+obj2.MfrName);
			obj2.Madein = "USA";
			System.out.println("Made in: "+obj2.Madein);
			obj2.LapPrice = 38000;
			System.out.println("Laptop Price: "+obj2.LapPrice);
			System.out.println("************************");
			obj2.LapID = 124;
			System.out.println("Laptop ID: "+obj2.LapID);
			obj2.MfrName = "Dell";
			System.out.println("Manufactured Name: "+obj2.MfrName);
			obj2.Madein = "India";
			System.out.println("Made in: "+obj2.Madein);
			obj2.LapPrice = 40000;
			System.out.println("Laptop Price: "+obj2.LapPrice);
			System.out.println("************************");
			
			Mobile obj3 = new Mobile();
			System.out.println("MOBILE DETAILS:");
			System.out.println("------------------------");
			obj3.MblNo = 952158622;
			System.out.println("Mobile No: "+obj3.MblNo);
			obj3.MfrName = "Lenovo";
			System.out.println("Manufactured Name: "+obj3.MfrName);
			obj3.MfrYear = 2018;
			System.out.println("Manufactured Year: "+obj3.MfrYear);
			obj3.MblPrice = 25000;
			System.out.println("Mobile Price: "+obj3.MblPrice);
			System.out.println("************************");
			obj3.MblNo = 952123522;
			System.out.println("Mobile No: "+obj3.MblNo);
			obj3.MfrName = "One Plus";
			System.out.println("Manufactured Name: "+obj3.MfrName);
			obj3.MfrYear = 2019;
			System.out.println("Manufactured Year: "+obj3.MfrYear);
			obj3.MblPrice = 22000;
			System.out.println("Mobile Price: "+obj3.MblPrice);
			System.out.println("************************");
			obj3.MblNo = 952248622;
			System.out.println("Mobile No: "+obj3.MblNo);
			obj3.MfrName = "Mi";
			System.out.println("Manufactured Name: "+obj3.MfrName);
			obj3.MfrYear = 2021;
			System.out.println("Manufactured Year: "+obj3.MfrYear);
			obj3.MblPrice = 20000;
			System.out.println("Mobile Price: "+obj3.MblPrice);
			System.out.println("************************");
			obj3.MblNo = 952137622;
			System.out.println("Mobile No: "+obj3.MblNo);
			obj3.MfrName = "IPhone";
			System.out.println("Manufactured Name: "+obj3.MfrName);
			obj3.MfrYear = 2020;
			System.out.println("Manufactured Year: "+obj3.MfrYear);
			obj3.MblPrice = 49000;
			System.out.println("Mobile Price: "+obj3.MblPrice);
			System.out.println("************************");
		}
	}
