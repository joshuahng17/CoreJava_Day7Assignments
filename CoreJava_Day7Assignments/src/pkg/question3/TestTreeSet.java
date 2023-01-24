package pkg.question3;

import java.util.Iterator;
import java.util.TreeSet;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		TreeSet<String> products = new TreeSet<>();
		
		products.add("Coca Cola");
		products.add("Sprite");
		products.add("Ginger Ale");
		products.add("Dr. Pepper");
		products.add("Fanta");
		products.add("Ginger Ale");
		products.add("Root Beer");
		
		Iterator<String> itr = products.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("First Element: "+products.first());
		System.out.println("Last Element: "+products.last());
		
		System.out.println("Size: "+products.size());
		
		products.remove("Dr. Pepper");
		
		System.out.println("New Size: "+products.size());
		
	}
	
}
