package Encapsulation;

class Country
{
	int CtyNo;
	String ContinentName;
	String CtyName;
}

class State
{
	int StateNo;
	String StateName;
	String StateCapital;
}

class District
{
	int DistNo;
	String DistName;
	String DistStateName;
}

class Taluk
{
	int TlkNo;
	String TalukName;
	String DistName;
}

public class ObjectClassForCountry {

	public static void main(String[] args) {
		// Object Class For Country State District Taluk
		Country obj1 = new Country();
		System.out.println("COUNTRY DETAILS:");
		System.out.println("------------------------");
		obj1.CtyNo = 1;
		System.out.println("Continent Number: "+obj1.CtyNo);
		obj1.ContinentName = "Asia";
		System.out.println("Continent Name: "+obj1.ContinentName);
		obj1.CtyName = "India";
		System.out.println("Country Name: "+obj1.CtyName);
		System.out.println("************************");
		State obj2 = new State();
		System.out.println("STATE DETAILS:");
		System.out.println("------------------------");
		obj2.StateNo = 11;
		System.out.println("State Number: "+obj2.StateNo);
		obj2.StateName = "Karnataka";
		System.out.println("State Name: "+obj2.StateName);
		obj2.StateCapital = "Bangalore";
		System.out.println("State Capital: "+obj2.StateCapital);
		System.out.println("************************");
		District obj3 = new District();
		System.out.println("DISTRICT DETAILS:");
		System.out.println("------------------------");
		obj3.DistNo = 21;
		System.out.println("District Number: "+obj3.DistNo);
		obj3.DistName = "Gulbarga";
		System.out.println("District Name: "+obj3.DistName);
		obj3.DistStateName = "Karnataka";
		System.out.println("District State Name: "+obj3.DistStateName);
		System.out.println("************************");
		Taluk obj4 = new Taluk();
		System.out.println("TALUK DETAILS:");
		System.out.println("------------------------");
		obj4.TlkNo = 101;
		System.out.println("Taluk Number: "+obj4.TlkNo);
		obj4.TalukName = "Humnabad";
		System.out.println("Taluk Name: "+obj4.TalukName);
		obj4.DistName = "Bidar";
		System.out.println("Taluk District Name: "+obj4.DistName);
		System.out.println("************************");
	}

}