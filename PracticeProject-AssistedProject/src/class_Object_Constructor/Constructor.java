package class_Object_Constructor;

public class Constructor {
	
	public Constructor()
	{
		System.out.println("this is default Constructor");
	}
	
	public Constructor(int a)
	{
		System.out.println("this is parametrized Constructor");
		System.out.println("the value of  a is : " + a);
	}
	

	public Constructor(int a ,int b)
	{
		System.out.println("this is parametrized Constructor");
		System.out.println("the value of  a is : " + a);
		System.out.println("the value of  a is : " + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructor obj = new Constructor();
		Constructor obj1 = new Constructor(10); 
		Constructor obj2 = new Constructor(10,20);

	}

}
