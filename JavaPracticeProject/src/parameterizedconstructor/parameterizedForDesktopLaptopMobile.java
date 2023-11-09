package parameterizedconstructor;
class Desktop
{
	int DetpID;
	String MfrName;
	String DetpType;
	int DetpPrice;
	Desktop(int DstId, String Mfn, String Dst,int Dstp)
	{
		System.out.println("DESKTOP DETAILS:");
		System.out.println("------------------------");
		DetpID = DstId;
		System.out.println("Desktop ID: "+DetpID);
		MfrName = Mfn;
		System.out.println("Desktop Name: "+MfrName);
		DetpType = Dst;
		System.out.println("Desktop Type: "+DetpType);
		DetpPrice = Dstp;
		System.out.println("Desktop Price: "+DetpPrice);
		System.out.println("************************");
	}
}

class Laptop
{
	int LapID;
	String MfrName;
	String Madein;
	int LapPrice;
	Laptop(int LpID,String Mfrn, String Mdn,int Lpr)
	{
		System.out.println("LAPTOP DETAILS:");
		System.out.println("------------------------");
		LapID = LpID;
		System.out.println("Laptop ID: "+LapID);
		MfrName = Mfrn;
		System.out.println("Manufactured Name: "+MfrName);
		Madein = Mdn;
		System.out.println("Made in: "+Madein);
		LapPrice = Lpr;
		System.out.println("Laptop Price: "+LapPrice);
		System.out.println("************************");
	}
}

class Mobile
{
	int MblNo;
	String MfrName;
	int MfrYear;
	int MblPrice;
	Mobile(int Mbn,String Mfn,int Mfy,int Mbp)
	{
		System.out.println("MOBILE DETAILS:");
		System.out.println("------------------------");
		MblNo = Mbn;
		System.out.println("Mobile No: "+MblNo);
		MfrName = Mfn;
		System.out.println("Manufactured Name: "+MfrName);
		MfrYear = Mfy;
		System.out.println("Manufactured Year: "+MfrYear);
		MblPrice = Mbp;
		System.out.println("Mobile Price: "+MblPrice);
		System.out.println("************************");
	}
}

public class parameterizedForDesktopLaptopMobile {

	public static void main(String[] args) {
		// Object Class For Desktop Laptop Mobile
		new Desktop(1277,"HP","HomeUse",35000);
		new Laptop(181,"Sony","Japan",95000);
		new Mobile(77607914,"Iphone",2018,60000);

	}

}



