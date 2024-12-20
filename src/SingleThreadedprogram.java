import java.util.Scanner;

public class SingleThreadedprogram {

	public static void main(String[] args)throws InterruptedException
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Task 1:addition operator started");
		System.out.println("enter the first number:");
		int num1=sc.nextInt();
		System.out.println("enter the second number3");
		int num2=sc.nextInt();
		System.out.println("Result is:+ res");
		System.out.println("Task 1:Adding operation completed");
		System.out.println("Task 2:printing opertator started");
		for(int i=0;i<5;i++)
		{
			System.out.println("VYSHU");
			Thread.sleep(2000);
		}
		System.out.println("Task 2:printing operator completed");
		System.out.println("Banking operator started");
		System.out.println("enter the account number:");
		int acc=sc.nextInt();
		System.out.println("enter the pin code:");
		int pin=sc.nextInt();
		System.out.println("Account details recorded");
		System.out.println("Task 3:Banking operation completed");
		
		}

	}


