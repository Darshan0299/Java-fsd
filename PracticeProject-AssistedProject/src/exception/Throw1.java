package exception;

public class Throw1 {
	
	public void div(int a, int b)
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
		// TODO Auto-generated method stub
		
		Throw1 obj = new Throw1();
		obj.div(12, 0);
		
		
		

	}

}
