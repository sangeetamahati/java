package collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeSet;
public abstract class Collections implements Collection {
	public static void main(String args[]){
	ArrayList<Integer> list = new ArrayList<>();
	System.out.println("---------------Arraylist------------");
	list.add(1);
	list.add(2);
	list.add(3);
	System.out.println("After insertion");
	list.forEach(System.out::print);
	
	list.remove(1);
	System.out.println();
	System.out.println("After deletion");
	list.forEach(System.out::print);
	
	
	//1. Create TreeSet
	TreeSet<String> TreeSet = new TreeSet<>();
	 
	//2. Add elements to TreeSet 
	TreeSet.add("A");
	TreeSet.add("B");
	TreeSet.add("C");
	TreeSet.add("D");
	TreeSet.add("E");
	System.out.println("-----------Tree-set----------");
	System.out.println(TreeSet);
	 
	System.out.println("Check if element exists");
	boolean found = TreeSet.contains("A");        //true
	System.out.println(found);
	 
	System.out.println(" Remove an element");
	TreeSet.remove("D");
	 
	//5. Iterate over values
	Iterator<String> itr = TreeSet.iterator();
	 
	while(itr.hasNext()) 
	{
	    String value = itr.next();
	     
	    System.out.println("Value: " + value);
	}

	System.out.println("-------------HashSet---------------");
	HashSet<String> hashSet = new HashSet<>();
	 
	//2. Add elements to HashSet 
	hashSet.add("AB");
	hashSet.add("BC");
	hashSet.add("CD");
	hashSet.add("DE");
	hashSet.add("EF");
	 
	System.out.println(hashSet);
	 
	System.out.println ("if element exists");
	boolean found1 = hashSet.contains("A");        //true
	System.out.println(found1);
	 
	System.out.println(" Remove an element");
	hashSet.remove("AB");
	 
	System.out.println("Iterate over values");
	Iterator<String> itr1 = hashSet.iterator();
	 
	while(itr1.hasNext()) 
	{
	    String value = itr1.next();
	     
	    System.out.println("Value: " + value);
	}

	System.out.println("----------Hash Map--------------");
	 HashMap<Integer, String> map = new HashMap<>();
     
     map.put(1,  "A");
     map.put(2,  "B");
     map.put(3,  "C");
      
     System.out.println(map);
     System.out.println("------------Queue---------");
     Queue<Integer> q = new LinkedList<>(); 
     
     // Adds elements {0, 1, 2, 3, 4} to queue 
     for (int i=0; i<5; i++) 
      q.add(i); 
   
     // Display contents of the queue. 
     System.out.println("Elements of queue-"+q); 
   
     // To remove the head of queue. 
     int removedele = q.remove(); 
     System.out.println("removed element-" + removedele); 
   
     System.out.println(q); 
   
     // To view the head of queue 
     int head = q.peek(); 
     System.out.println("head of queue-" + head); 
   
     // Rest all methods of collection interface, 
     // Like size and contains can be used with this 
     // implementation. 
     int size = q.size(); 
     System.out.println("Size of queue-" + size); 
  

 }
}
