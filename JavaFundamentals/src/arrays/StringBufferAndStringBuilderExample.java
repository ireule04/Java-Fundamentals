package arrays;

public class StringBufferAndStringBuilderExample {
	
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		
		//StringBuffer
		StringBuffer buffer = new StringBuffer("Hello ");
		System.out.println(buffer.capacity());
//		buffer.append("World");
//		System.out.println(buffer);
		for(int i=0;i<10000;i++) {
			buffer.append("World");
		}
		System.out.println("Time Takes By StringBuffer: "+ (System.currentTimeMillis()-startTime));
		
		
		//StringBuilder
		StringBuilder builder = new StringBuilder("Hello ");
		System.out.println(builder.capacity());
//		builder.append("World");
//		System.out.println(builder);
		
		for(int i=0;i<10000;i++) {
			buffer.append("World");
		}
		
		System.out.println("Time Takes By StringBuilder: "+ (System.currentTimeMillis()-startTime));

		
		
		
	}

}


