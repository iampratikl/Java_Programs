package Inheritance;

public class Cat extends Dog {
	public void drink() {
		System.out.println("Cat is drinking Milk");
	}

	public void follow() {
		System.out.println("Cat is Following a mouse");
	}

	public static void main(String[] args) {
		Cat obj = new Cat();
		obj.eat();
		obj.sleep();
		obj.wonder();
		obj.bark();
		obj.bite();
		obj.drink();
		obj.follow();
	}

}
