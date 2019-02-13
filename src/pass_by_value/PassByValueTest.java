package pass_by_value;

public class PassByValueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp = new Employee();
		Department dept = new Department();
		dept.setDept_name("HR");

		emp.setId("101");
		emp.setName("John");
		emp.setDept(dept);

		System.out.println(emp.getId() + " " + emp.getName() + " "
				+ emp.getDept().getDept_name());
		
		dept.setDept_name("Finance");
		
		System.out.println(emp.getId() + " " + emp.getName() + " "
				+ emp.getDept().getDept_name());

	}

}
