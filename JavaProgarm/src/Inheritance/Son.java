package Inheritance;

public class Son extends Father {
	public void car() {
		System.out.println("Son's Car");

	}

	public void Mobile() {
		System.out.println("Son's mobile");
	}

	public static void main(String[] args) {
		Son s = new Son();

		s.car();
		s.Mobile();

		s.land();
		s.gold();
		s.money();
	}

}
