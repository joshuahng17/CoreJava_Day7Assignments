package pkg.question1;

public class Main {
	
	public static void main(String[] args) {
		StudentTest roster = new StudentTest();
		
		roster.setNames();
		roster.setNames();
		roster.setNames();
		roster.setNames();
		roster.setNames();
		roster.searchName("Joshua");
		roster.searchName(3);
		roster.printNames();
		roster.removeName("Jonathan");
	}
}
