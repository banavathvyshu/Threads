import java.util.InputMismatchException;
import java.util.Scanner;

public class ThreadDemo1 extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("add")) {
			add();
		}
		else if(Thread.currentThread().getName().equals("print")) {
			print();
		}
		else {
			Bank();
		}
		
	}

	public void add() {
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.println("Task 1:addition operator started");
			System.out.println("enter the first number:");
			int num1=sc.nextInt();
			System.out.println("enter the second number:");
			int num2=sc.nextInt();
			int res=num1+num2;
			System.out.println("Result is:"+res);
			System.out.println("Task 1:Addition operation completed");
		}
		catch(ArithmeticException e1)
		{
			e1.printStackTrace();
		}
		catch(InputMismatchException e2)
		{
			e2.printStackTrace();
		}
	}
	public void print() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Task 2:printing operation started");
			for(int i=0;i<5;i++)
			{
				System.out.println("GTEC JAINx BANGALORE");
				Thread.sleep(2000);
			}
			System.out.println("Task 2:printing operation completed");
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();	}
	}
	public void Bank()
	{
		try (Scanner Scanner = new Scanner(System.in)) {
		System.out.println("Task 3:Banking operation stated");
		System.out.println("enter the account number:");
		@SuppressWarnings("unused")
		int acc=Scanner.nextInt();
		System.out.println("enter the pin code:");
		@SuppressWarnings("unused")
		int pin=Scanner.nextInt();
		System.out.println(" account details recorted");
		System.out.println("Task 3:Banking operation completed");
		}
		catch(ArithmeticException e1)
		{
			e1.printStackTrace();
		}
		catch(InputMismatchException e2) {
			e2.printStackTrace();
		}
	}
}
		