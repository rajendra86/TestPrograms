package generics;

public class Box<T> {

	private T t; // T stands for "Type"

	public void add(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
	
	public <U extends Number> void inspect(U u){
        System.out.println("T: " + t.getClass().getName());
        System.out.println("U: " + u.getClass().getName());
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add(new Integer(10));
        // error: this is still String!
        //integerBox.inspect("some text");
    }
}
