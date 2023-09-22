package class_Object_Constructor;

public class Class {     // here Class is the class here
	
	
    

   public void displayDetails(String name,int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class obj = new Class();    // Here it is object and with the object we are calling the method 
		obj.displayDetails("Darshan", 22);
		

	}

}
