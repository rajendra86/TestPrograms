package instance_of_operator;

public class Employee extends ParentEmployee {

	public static void main(String[] args) {
		Employee emp = new Employee();
		ParentEmployee parentEmp = new ParentEmployee();

		System.out.println(emp instanceof Employee);
		System.out.println(parentEmp instanceof Employee);
		System.out.println(emp instanceof ParentEmployee);

		System.out.println(emp.getClass() == parentEmp.getClass());
		System.out.println(emp.getClass().toString());
		System.out.println(parentEmp.getClass().toString());

	}
}
