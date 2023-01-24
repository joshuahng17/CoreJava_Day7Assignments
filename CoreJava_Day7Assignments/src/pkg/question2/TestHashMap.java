package pkg.question2;

public class TestHashMap {

	public static void main(String[] args) {
		Employee roster = new Employee();
		
		roster.setNames();
		roster.setNames();
		roster.setNames();
		
		roster.printNames();
		roster.getName("7745");
		roster.printNamesKeySet();
		roster.printSize();
		roster.remove("5332");
	}
}
