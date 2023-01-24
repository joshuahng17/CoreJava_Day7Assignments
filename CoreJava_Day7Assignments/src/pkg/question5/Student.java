package pkg.question5;

import java.util.Comparator;

public class Student implements Comparator<Student>{

	private int rollNo;
	private String name;
	
	public Student() {
		
	}
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "ID: "+this.getRollNo()+" Name: "+this.getName();
	}
	
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	};
	
}
