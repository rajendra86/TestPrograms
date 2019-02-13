package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class TryPriorityQueue implements TryCollections {

	@Override
	public void doOperations() {
		//natural ordering example of priority queue        
		Queue<Integer> integerPriorityQueue = new PriorityQueue<Integer>(7);
        Random rand = new Random();
        for(int i=0;i<7;i++){
            integerPriorityQueue.add(new Integer(rand.nextInt(100)));
        }
        for(int i=0;i<7;i++){
            Integer in = integerPriorityQueue.poll();
            System.out.println("Processing Integer:"+in);
        }
         
        //PriorityQueue example with Comparator
        Queue<Customer> customerPriorityQueue = new PriorityQueue<Customer>(7, idComparator);
        addDataToQueue(customerPriorityQueue);
        pollDataFromQueue(customerPriorityQueue);

	}
	//Comparator anonymous class implementation
    Comparator<Customer> idComparator = new Comparator<Customer>() {   
        @Override
        public int compare(Customer c1, Customer c2) {
            return (int) (c1.getId() - c2.getId());        	
        }
    };

    //utility method to add random data to Queue
    private void addDataToQueue(Queue<Customer> customerPriorityQueue) {
        Random rand = new Random();
        for(int i=0; i<7; i++) {
            int id = rand.nextInt(100);
            System.out.println("Id--> " + id);
            customerPriorityQueue.add(new Customer(id, "Raj " + id));
        }                   
        System.out.println(customerPriorityQueue);
    }

    //utility method to poll data from queue
    private void pollDataFromQueue(Queue<Customer> customerPriorityQueue) {
    	System.out.println(customerPriorityQueue);
        while(true){
            Customer cust = customerPriorityQueue.poll();
            if(cust == null) break;
            System.out.println("Processing Customer with ID="+cust.getId());
        }
    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TryPriorityQueue().doOperations();

	}

	public class Customer {
	     
	    private int id;
	    private String name;
	     
	    public Customer(int i, String n){
	        this.id=i;
	        this.name=n;
	    }
	 
	    public int getId() {
	        return id;
	    }
	 
	    public String getName() {
	        return name;
	    }
	    
	    public String toString() {
			return "ID--> " + id;
	    	
	    }
	     
	}
}
