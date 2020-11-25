
public class variableAndDataTypes2
{
	String instantVar = "Instant Variable";
	
	public static void main(String[] args)
	{
		variableAndDataTypes2 obj1 = new variableAndDataTypes2();
		variableAndDataTypes2 obj2 = new variableAndDataTypes2();
		variableAndDataTypes2 obj3 = new variableAndDataTypes2();
		
		System.out.println(obj1.instantVar);
		System.out.println(obj2.instantVar);
		System.out.println(obj3.instantVar);
		
		obj1.instantVar = "WE HAVE CHANGED HERE";
		obj2.instantVar = "we have changed here";
		
		System.out.println(obj1.instantVar);
		System.out.println(obj2.instantVar);
		System.out.println(obj3.instantVar);
	}
}
