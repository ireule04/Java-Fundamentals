package arrays;

public class StringBufferAndStringBuilder {
	
	public static void main(String[] args) {
		
		
		long startTime= System.currentTimeMillis() ;
		
		StringBuffer buffer = new StringBuffer("Hello ");
		
		System.out.println(buffer.capacity());
//		buffer.append("World");
//		buffer.delete(0, 3);
//		System.out.println(buffer);
		
		for(int i=0;i<10000;i++) {
			buffer.append("World");
		}
		
		System.out.println("Time taken by String Buffer: "+(System.currentTimeMillis()-startTime));
		System.out.println("---------------------------------");
		
		StringBuilder builder = new StringBuilder("Hello ");
		System.out.println(builder.capacity());
//		builder.append("World");
//		System.out.println(builder);
		
		for(int i=0;i<10000;i++) {
			buffer.append("World");
		}
		System.out.println("Time taken by String Builder: "+(System.currentTimeMillis()-startTime));

		
		
		
		
	}

}
