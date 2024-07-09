package arrays;

public class MultiDimensionalArray {
	
	public static void main(String[] args) {
		
		int marks[][] = {
						{67,78,87,88,98},
						{76,77,56,77,88},
						{56,44,88,99,77},
						{45,65,85,78,96}};
		
		for(int i = 0; i<4; i++) {
			
			for(int j = 0; j<5; j++) {
				
				System.out.println(marks[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
