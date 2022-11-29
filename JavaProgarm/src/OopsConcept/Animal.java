package OopsConcept;

public class Animal {
	public void eat() {
		System.out.println("I am eating");
	}

	public void run() {
		System.out.println("I am Running");
	}

	public static void main(String[] args) {
		Animal obj = new Animal();
		obj.eat();
		obj.run();

		bird sp = new bird();
		sp.fly();
		sp.sleep();

	}

	public class bird {
		public void fly() {
			System.out.println("Birds can Fly");
		}

		public void sleep() {
			System.out.println("Birds can Sleep");
		}

	}
}
