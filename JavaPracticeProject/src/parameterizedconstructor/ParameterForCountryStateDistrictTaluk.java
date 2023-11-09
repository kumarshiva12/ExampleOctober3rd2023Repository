package parameterizedconstructor;
class Country
{
	int CtyNo;
	String ContinentName;
	String CtyName;
	Country(int Cn,String Cname,String Cne)
	{
		System.out.println("COUNTRY DETAILS:");
		System.out.println("------------------------");
		CtyNo = Cn;
		System.out.println("Continent Number: "+CtyNo);
		ContinentName = Cname;
		System.out.println("Continent Name: "+ContinentName);
		CtyName = Cne;
		System.out.println("Country Name: "+CtyName);
		System.out.println("************************");
	}
}

class State
{
	int StateNo;
	String StateName;
	String StateCapital;
	State(int Sno, String Sna, String Sca)
	{
		System.out.println("STATE DETAILS:");
		System.out.println("------------------------");
		StateNo = Sno;
		System.out.println("State Number: "+StateNo);
		StateName = Sna;
		System.out.println("State Name: "+StateName);
		StateCapital = Sca;
		System.out.println("State Capital: "+StateCapital);
		System.out.println("************************");
	}
}

class District
{
	int DistNo;
	String DistName;
	String DistStateName;
	District(int Dno, String Dna, String Dsn)
	{
		System.out.println("DISTRICT DETAILS:");
		System.out.println("------------------------");
		DistNo = Dno;
		System.out.println("District Number: "+DistNo);
		DistName = Dna;
		System.out.println("District Name: "+DistName);
		DistStateName = Dsn;
		System.out.println("District State Name: "+DistStateName);
		System.out.println("************************");
	}
}

class Taluk
{
	int TlkNo;
	String TalukName;
	String DistName;
	Taluk(int Tno,String Tna,String Tdn)
	{
		System.out.println("TALUK DETAILS:");
		System.out.println("------------------------");
		TlkNo = Tno;
		System.out.println("Taluk Number: "+TlkNo);
		TalukName = Tna;
		System.out.println("Taluk Name: "+TalukName);
		DistName = Tdn;
		System.out.println("Taluk District Name: "+DistName);
		System.out.println("************************");
	}
}

public class ParameterForCountryStateDistrictTaluk {

	public static void main(String[] args) {
		// Object Class For Country State District Taluk
		new Country(21,"Asia","India");
		new State(71, "Karnataka","Bangalaore" );
		new District(25,"Shimoga","Karnataka");
		new Taluk(212,"Channagiri","Davanagere");

	}

}




