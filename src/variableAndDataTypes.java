
public class variableAndDataTypes 
{
	static int count = 0; 
	
	public void increment()
	{
		count++;
	}
	
	public static void main(String[] args) 
	{
		variableAndDataTypes obj1 = new variableAndDataTypes();
		variableAndDataTypes obj2 = new variableAndDataTypes();
		
		obj1.increment();
		obj2.increment();
		
		System.out.println("Obj1 count = "+obj1.count);
		System.out.println("Obj2 count = "+obj2.count);
	}
}
