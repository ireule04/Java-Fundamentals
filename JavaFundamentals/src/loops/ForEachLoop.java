package loops;

import java.util.Iterator;

public class ForEachLoop {
	
	public static void main(String[] args) {
		
		String names[] = {"King","Kohar","Sarah","Bowling"};
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);			
		}		
		for(String name : names) {
			System.out.println(name);			
		}
		
		
	}

}
