package runtimeclass;

public class FindMemory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		System.out.println("Total Memory--> " + Runtime.getRuntime().totalMemory()/1048576+" MB");
		System.out.println("Free Memory --> " + Runtime.getRuntime().freeMemory()/1048576+" MB");		
		System.out.println("Max Memory  or Max Heap--> " + Runtime.getRuntime().maxMemory()/1048576+" MB");

	}

}
