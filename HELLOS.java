package mypackage;

import java.util.Arrays;

import java.util.List;

public class HELLO {
	
	
	public static void main(String[] args) {
		
		
		CHILD childone = new CHILD(2);
		CHILD childtwo = new CHILD(3);
		CHILD childthree = new CHILD(4);
		CHILD childfour = new CHILD(10);
		CHILD childfive = new CHILD(11);
		CHILD childsix = new CHILD(14);
		
		
		List<CHILD> childs = Arrays.asList(new CHILD[] {childone,childtwo,childthree,childfour,childfive,childsix});
		
		List<CHILD> filterChilds = ChildPredicates.filterChilds(childs,ChildPredicates.filterByAge(8));
		
		
		for (CHILD child : filterChilds) {
			
			System.out.println(child.getAge());
			
		}
		
		
	}
	

}
