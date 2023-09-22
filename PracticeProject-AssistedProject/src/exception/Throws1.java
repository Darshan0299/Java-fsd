package exception;

public class Throws1 {
	
	
	public void div(int a, int b) throws ArithmeticException
	{
		if(b==0)
		{
			throw new ArithmeticException();
		}
		else {
		int c = a/b;
		System.out.println("The division of 2 numbers is : " + c);
		}
	}

	public static void main(String[] args) {
		
		Throws1 obj = new Throws1();
		try {
		obj.div(12, 0);
		}
		
		catch(Exception e) {
		System.out.println("Further code Execution");
		}

		
		
	
	}

}
