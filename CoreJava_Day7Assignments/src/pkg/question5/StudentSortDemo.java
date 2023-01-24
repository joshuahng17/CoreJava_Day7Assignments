package pkg.question5;

import java.util.*;

public class StudentSortDemo {

	public static void main(String[] args) {
		List<Student> roster = new ArrayList<>();
		
		roster.add(new Student(7745,"Joshua"));
		roster.add(new Student(0145,"Jonathan"));
		roster.add(new Student(2159,"Caleb"));
		roster.add(new Student(5332,"Frank"));
		roster.add(new Student(5521,"Leah"));
		
		System.out.println(roster);
		Collections.sort(roster, new Student());
		System.out.println(roster);
	}
}
