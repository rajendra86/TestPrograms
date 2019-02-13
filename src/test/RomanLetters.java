package test;

public class RomanLetters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isCorrectRoamNumber(1, "I",true);
		isCorrectRoamNumber(2,"II", true);
		isCorrectRoamNumber(50,"L", true);
		isCorrectRoamNumber(100,"C", false);
		
		
	
	}

	public static void isCorrectRoamNumber(int num, String roman,boolean result){
		boolean actual=false;
		switch(num){
		case 1:
			if( roman.equals("I")){
				actual = true;
			};
			case 2:
				if( roman.equals("II")){
					actual = true;
				};
			case 50:
				if( roman.equals("L")){
					actual = true;
				};
			case 100:
				if( roman.equals("C")){
					actual = true;
				};
				}
		if(actual == result){
		System.out.println("Test case is passed");
		} else {
			System.out.println("Test case failed");
		}
		
	}
}
