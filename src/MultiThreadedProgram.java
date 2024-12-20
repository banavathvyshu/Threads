

public class MultiThreadedProgram {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadDemo1 t1=new ThreadDemo1();
		ThreadDemo1 t2=new ThreadDemo1();
		ThreadDemo1 t3=new ThreadDemo1();
		
	
		
		t1.setName("add");
		t2.setName("print");
		t3.setName("Bank");
		
		t1.start();
		t2.start();
		t3.start();
	}
	}
