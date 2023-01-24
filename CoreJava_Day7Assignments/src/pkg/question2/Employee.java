package pkg.question2;

import java.util.*;

public class Employee {
	
	private HashMap<String, String> empNames;
	Scanner sc = new Scanner(System.in);
	
	public Employee() {
		empNames = new HashMap<>();
	}
	
	public void setNames() {
		System.out.println("Enter the Roll Number");
		String rollNo = sc.next();
		System.out.println("Enter the name");
		String name = sc.next();
		empNames.put(rollNo, name);
	}
	
	public void printNames() {
		Collection<String> names = empNames.values();
		System.out.println("Names are: "+names);
	}
	
	public void getName(String key) {
		System.out.println("Name is: "+empNames.get(key));
	}
	
	public void printNamesKeySet() {
		Set<String> keySet = empNames.keySet();
		for(String key:keySet) {
			System.out.println("Roll Number: "+key+" Name: "+empNames.get(key));
		}
	}
	
	public void printSize() {
		System.out.println("Size: "+empNames.size());
	}
	
	public void remove(String key) {
		System.out.println("Removed "+empNames.remove(key));
	}
}
