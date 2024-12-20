
public class Launch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		(new Producer(q)).start();
		(new Consumer(q)).start();

	}

}
