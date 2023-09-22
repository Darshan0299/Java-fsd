package exception;

public class TryAndCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 9;
		int j = 0;
		
		String name = null;
			
		try {
			
			System.out.println("Result" + i/j);
			
		}
		catch(ArithmeticException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("please donot give 0 as value of j");
		}
		
		
		System.out.println("Result" + i+j);
		System.out.println("Result" + (i-j));
		System.out.println("Result" + i*j);
		
		
		
		System.out.println(name.length());


	}

}
