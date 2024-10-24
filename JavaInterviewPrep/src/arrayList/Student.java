package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {

	private int studentRollNumber;
	private String studentFirstName;
	private String studentLastName;
	private String studentDateOfBirth;
	private String studentAddress;

	public Student() {
		super();
	}

	public Student(int studentRollNumber, String studentFirstName, String studentLastName, String studentDateOfBirth,
			String studentAddress) {
		super();
		this.studentRollNumber = studentRollNumber;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentDateOfBirth = studentDateOfBirth;
		this.studentAddress = studentAddress;
	}

	public int getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentDateOfBirth() {
		return studentDateOfBirth;
	}

	public void setStudentDateOfBirth(String studentDateOfBirth) {
		this.studentDateOfBirth = studentDateOfBirth;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	@Override
	public String toString() {
		return "StudentRollNumber = " + studentRollNumber + " " + "studentFirstName =" + " " + studentFirstName + " "
				+ "StudentLastName = " + " " + studentLastName + " " + "StudentDOB = " + " " + studentDateOfBirth + " "
				+ "StudentAddress = " + " " + studentAddress;
	}

	public static void main(String[] args) {
		Student student1 = new Student(1, "G", "H", "01 / 02 / 2001", "Andhra Pradesh");
		Student student2 = new Student(2, "A", "B", "01 / 02 / 2002", "Karnataka");
		Student student3 = new Student(3, "C", "D", "01 / 02 / 2003", "Kerala");
		Student student4 = new Student(4, "E", "F", "01 / 02 / 2004", "TamilNadu");
		// creating arrayList of Student Object
		ArrayList<Student> studentsdata = new ArrayList<>();
		// Adding student data into arrayList
		studentsdata.add(student1);
		studentsdata.add(student2);
		studentsdata.add(student3);
		studentsdata.add(student4);
		// find the length of the Student Data
		System.out.println(studentsdata); // 4
		// Retrivel of Student data using iterator
		Iterator<Student> itr = studentsdata.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		// Removing 1st index Student from the Student Data
		System.out.println("------Before Removing------");
		System.out.println(studentsdata);
		System.out.println("------After Removing------");
		studentsdata.remove(2);
		System.out.println(studentsdata);
		// Update the Student's LastName ="XY" present at index 1st
		int FirstststudentRollNumner = 1;
		for (Student std : studentsdata) {
			if (std.getStudentRollNumber() == FirstststudentRollNumner) {
				std.setStudentLastName("XY");
			}
		}
		System.out.println(
				"\nAfter updating the 1st index Student Last Name = " + studentsdata.get(0).getStudentLastName());
		// Search a Student FirstName contains A and update his/her date to today sysdate.
		String sFNContainsA = "A";
		for(Student s : studentsdata) {
			if(sFNContainsA.equalsIgnoreCase(s.getStudentFirstName())) {
				s.setStudentDateOfBirth("10/24/2024");
			}
		}
		studentsdata.clear();
		System.out.println(studentsdata.size());
		
	}
}
