package OopsConcept;

public class Employee {
	String Name;
	String Add;
	int Id;

	public static void main(String[] args) {
		Employee obj = new Employee();
		obj.Name = "Ram T";
		obj.Add = "Gondia";
		obj.Id = 123456;

		System.out.println(obj.Name);
		System.out.println(obj.Add);
		System.out.println(obj.Id);

	}

}
