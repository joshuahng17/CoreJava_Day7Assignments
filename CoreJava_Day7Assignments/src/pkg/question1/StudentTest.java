package pkg.question1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class StudentTest {
	
	private ArrayList<Student> names;
	Scanner sc = new Scanner(System.in);
	
	public StudentTest() {
		names = new ArrayList();
	}
	
	public void setNames() {
		try {
			System.out.println("Enter the roll #");
			int id = sc.nextInt();
			System.out.println("Enter the name");
			String name = sc.next();
			System.out.println("Enter the age");
			int age = sc.nextInt();
			System.out.println("Enter the address");
			String address = sc.next();
			Student newStudent = new Student(id,name,age,address);
			names.add(newStudent);
		} catch (InputMismatchException e) {
			System.out.println("Bad input. Start over");
		}
	}
	
	public void searchName(String name) {
		Iterator<Student> itr = names.iterator();
		while(itr.hasNext()) {
			Student current = itr.next();
			if(current.getName().equals(name)) {
				System.out.println("ID: "+current.getRollNo());
				System.out.println("Name: "+current.getName());
				System.out.println("Age: "+current.getAge());
				System.out.println("Address: "+current.getAddress());
				return;
			}
		}
		System.out.println("Index not found");
	}
	
	public void searchName(int index) {
		if(names.size()>index) {
			System.out.println("ID: "+(names.get(index)).getRollNo());
			System.out.println("Name: "+(names.get(index)).getName());
			System.out.println("Age: "+(names.get(index)).getAge());
			System.out.println("Address: "+(names.get(index)).getAddress());
		}
		else {
			System.out.println("Index not found");
		}
	}
	
	public void printNames() {
		Iterator<Student> itr = names.iterator();
		while(itr.hasNext()) {
			Student current = itr.next();
			System.out.println("ID: "+current.getRollNo());
			System.out.println("Name: "+current.getName());
			System.out.println("Age: "+current.getAge());
			System.out.println("Address: "+current.getAddress());
		}
	}
	
	public void removeName(String stuName) {
		Iterator<Student> itr = names.iterator();
		while(itr.hasNext()) {
			Student current = itr.next();
			if(current.getName().equals(stuName)) {
				names.remove(names.indexOf(current));
				System.out.println("Name Removed");
				return;
			}
		}
		System.out.println("Name not found");
	}
	
	
}
