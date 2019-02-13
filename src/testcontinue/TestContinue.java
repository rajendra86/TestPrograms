package testcontinue;

public class TestContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int i=0;
		int cnt=0;
		int j=2;
		while(i<3){
			i++;
			if(cnt<j) {
				cnt++;
				System.out.println("Hi!!!");
				continue;
			}
			System.out.println("Hello!!!");
		}

	}

}
