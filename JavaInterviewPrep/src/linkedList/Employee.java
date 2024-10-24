package linkedList;

import java.util.LinkedList;

public class Employee {
	private int id;
	private String name;
	private String department;

	public Employee(int id, String name, String department) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", department=" + department;
	}

	public static void main(String[] args) {
		// Creating an Object for employees
		Employee emp1 = new Employee(1, "Shiva", "HR");
		Employee emp2 = new Employee(2, "Akira", "IT");
		Employee emp3 = new Employee(3, "John", "BUSINESS");
		Employee emp4 = new Employee(4, "Mark", "DELIVERY");
		// Create a LinkedList to store the Employee Objects
		LinkedList<Employee> employees = new LinkedList<>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		// Displaying the Employees
		displayEmployees(employees);
		// Removing an employee from the LinkedList
		employees.remove(1);
		System.out.println(employees);// [id=1, name=Shiva, department=HR, id=3, name=John, department=BUSINESS, id=4,
										// name=Mark, department=DELIVERY]
		// adding an employee at the start of the List
		employees.addFirst(new Employee(2, "Akira", "IT"));
		displayEmployees(employees);

		// adding an employee at the start of the List
		employees.addLast(new Employee(5, "Cena", "SECURITY"));
		displayEmployees(employees);
	}

	private static void displayEmployees(LinkedList<Employee> employees) {
		for (Employee emp : employees) {
			System.out.println(emp);
		}
	}
}
