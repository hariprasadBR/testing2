package selniumlogic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class comaprer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
	
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","C","D","E"));
		
		
		
		
	Collections.sort(l1);
	Collections.sort(l2);
	System.out.println(l1.equals(l2));
	System.out.println(l1.equals(l3));//it checks index position as well as values also
	
	}

}
