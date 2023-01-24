package pkg.question4;

public class Student implements Comparable<Student>{

	private int rollNo;
	private String name;
	
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
	
	public int compareTo(Student other) {
		return this.getName().compareTo(other.getName());
	};
	
}
