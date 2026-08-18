package Assignments;

import java.util.ArrayList;
import java.util.List;

/* WAP on collection concept with the help of Upcasting on Different Data types 
 * (Int, Char, Double, string etc.) with different methods like Add, Remove, Contains.*/
public class Collection_A171 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> l1 = new ArrayList<>();
		l1.add(963);
		l1.add(856);
		l1.add(72);
		l1.add(1025);
		l1.add(785);
		l1.add(652);
		System.out.println(l1);
		System.out.println(l1.contains(652));
		
		List <Object> l2 = new ArrayList<>();
		l2.add("Eugene");
		l2.add(912334434);
		l2.add("Kerala");
		l2.add("QA Engineer");
		l2.add('T');
		l2.add(452.024);
		System.out.println("Your list l2 contains- " + l2);
		l2.remove(2);
		System.out.println(l2);
		System.out.println(l2.containsAll(l1));
		
		
		//Adding two lists
		System.out.println("----Adding both the lists---");
		l1.addAll(l2);
		boolean result = l1.addAll(l2);
		System.out.println(l1);
		System.out.println(result);
		
		// Checking
		System.out.println(l1.equals(l2));
		System.out.println(l1.containsAll(l2));
		System.out.println(l2.contains(1025));
	}

}
