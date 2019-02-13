package overriding;


public class Child_ParentInterface implements ParentInterface {

	@Override
	public void parentMethod() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		System.out.println(new Child_ParentInterface().getClass());
	}
	
}
