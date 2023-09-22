package accessModifier;

public class Child {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Base obj = new Base();
		
		//Default modifier
		
		System.out.println(obj.hours);
		System.out.println(	obj.mins);
		
		// Public Modifier
		
		System.out.println(obj.name);
		System.out.println(obj.tool);
		
		//Private Modifier
		// we can't call this because variable in this is private in class
			
		//protected modifier
		
		System.out.println(obj.x);
		System.out.println(obj.z);


	}

}
