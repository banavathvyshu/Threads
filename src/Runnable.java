
public class Runnable {

	public static void main(String[] args) {
		RunnableInterface r1=new RunnableInterface();
		RunnableInterface r2=new RunnableInterface();
		RunnableInterface r3=new RunnableInterface();
		

		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.setName("add");
		t1.setName("print");
		t1.setName("bank");
		
		t1.start();
		t2.start();
	    t3.start();
		

	

	}

}
