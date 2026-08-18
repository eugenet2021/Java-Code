package Assignments;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
/*Assignment 183- write a program on List Interface for ListIterator() of 
 * forward Iteration and Backward Iteration and Iterator() also.
 *Assignment 184 - Write a difference between 3 types of cursor
 1.Enumeration  2.Iterator 3.ListIterator*/
public class Collection_A183 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Object> l1 = new ArrayList<>();
		l1.add(101);
		l1.add(201);
		l1.add(501);
		l1.add(801);
		l1.add(601.025);
		System.out.println("Your List is  " + l1);
		Iterator<Object> i1 = l1.iterator();
	//iterating -forward
		System.out.println("Forward Iteration using Iterator");
		while(i1.hasNext()) {
		System.out.println(i1.next()); // now cursor is at the last index
		}
	// Backward Iteratiion
		System.out.println("Backward Iteration using ListIterator");
		ListIterator<Object> i2 = l1.listIterator(l1.size());// here we create new object; so 
		                                                     //	size() will move the control to the last index 
		while(i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
//Enumeration
		System.out.println("Iteration usng Enumeration");
	Vector<Object>  v1 = new Vector <>();
	v1.add("Pink City");
	v1.add("Orange City");
	v1.add("City of Lights");
	v1.add("City of Colors");
	Enumeration <Object>e = v1.elements();
	while (e.hasMoreElements()) {
		System.out.println(e.nextElement());
	}
	
	
	}

}
