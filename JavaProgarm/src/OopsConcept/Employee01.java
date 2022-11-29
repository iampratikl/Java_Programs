package OopsConcept;

public class Employee01 {

	String Name;
	int empid;

	Employee01(String Name, int empid) {
		this.Name = Name;
		this.empid = empid;

	}

	public static void main(String[] args) {
		Employee01 e1 = new Employee01("Ram J", 151);
		Employee01 e2 = new Employee01("Shyam", 152);
		System.out.println("Employee 1"+e1.Name+" "+e1.empid);
	}

}
