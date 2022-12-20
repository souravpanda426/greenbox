package mypackage;



import java.util.Comparator;

import java.util.TreeSet;

@SuppressWarnings("rawtypes")
public class MyComparator implements Comparator {
	
	public static void main(String[] args) {
		
		@SuppressWarnings("unchecked")
		TreeSet<Integer> t = new TreeSet<Integer>(new MyComparator());
		t.add(12);
		t.add(120);
		t.add(23);
		t.add(9);
		System.out.println(t);
		
		
		
		
			
		}

	@Override
	public int compare(Object o1, Object o2) {
		
		
		Integer i1 = (Integer) o1;
		
		Integer i2 = (Integer) o2;
		
		
		
		if(i1<i2) {
			
			return +1;
		}
		
		else if(i1>i2) {
			
			return -1;
			
		}
		
		else {
			return 0;
		}
	}
	}


