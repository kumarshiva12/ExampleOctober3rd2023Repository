package Inheritance;
class Four1 {
	Four1(String name) {
		System.out.println("Super Class name : " + name);
	}
}

class Four2 extends Four1{
	Four2(String name) {
		super(name);
		System.out.println("Child Class of parent class");
	}
}

class Four4 extends Four2 {
	Four4() {
		super("jaya");
		System.out.println("Child Class of child class 2 ");
	}


	public static void main(String[] args) {
		Four4 obj = new Four4();

	}
}

