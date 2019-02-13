package utility;

public class Test {
	
	public static void main(String[] args) {
		System.out.println("Output");
		System.out.println(xyz(100));
	}
	
	
	public static int xyz(int num) {
		if(num == 1) return 1;
		else return(xyz(num-1)+ num);
	}
}
