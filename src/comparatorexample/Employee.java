package comparatorexample;

import java.util.Date;

public class Employee implements Comparable<Employee> {
	private int id;
	private String name;
	private int salary;
	private int age;
	private Date dateOfJoining;

	public Employee(int id, String name, int salary, int age, Date dateOfJoining) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.dateOfJoining = dateOfJoining;
	}

	@Override
	public String toString() {
		return "Employee{" + "id=" + id + ", name=" + name + ", salary="
				+ salary + ", age=" + age + ", dateOfJoining=" + dateOfJoining
				+ '}';
	}

	@Override
	public int compareTo(Employee o) {
		// return this.id - o.id;
		return this.age - o.age;
		// return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final Employee other = (Employee) obj;
		if (this.id != other.id) {
			return false;
		}
		if ((this.name == null) ? (other.name != null) : !this.name
				.equals(other.name)) {
			return false;
		}
		if (this.salary != other.salary) {
			return false;
		}
		if (this.age != other.age) {
			return false;
		}
		if (this.dateOfJoining != other.dateOfJoining
				&& (this.dateOfJoining == null || !this.dateOfJoining
						.equals(other.dateOfJoining))) {

			return false;
		}
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 5;
		hash = 47 * hash + this.id;
		hash = 47 * hash + (this.name != null ? this.name.hashCode() : 0);
		hash = 47 * hash + this.salary;
		hash = 47 * hash + this.age;
		hash = 47
				* hash
				+ (this.dateOfJoining != null ? this.dateOfJoining.hashCode()
						: 0);
		return hash;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary
	 *            the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the dateOfJoining
	 */
	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	/**
	 * @param dateOfJoining
	 *            the dateOfJoining to set
	 */
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
