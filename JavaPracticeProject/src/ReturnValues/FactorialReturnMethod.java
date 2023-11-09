package ReturnValues;

class Demoq {
	int factDemo(int num) {
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		return fact;
	}
}

public class FactorialReturnMethod {

	public static void main(String[] args) {
		// Factorial value of given number using Return Method.
		Demoq O = new Demoq();
		int fvalue = O.factDemo(6);
		System.out.println("Factorial Value = " + fvalue);

	}
}
