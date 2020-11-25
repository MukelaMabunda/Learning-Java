
public class variableAndDataTypes3
{
	public String instantVar = "Instant Var";
	
	public void demoFunction()
	{
		String instantVar = "Local Var";
		System.out.println(instantVar);
	}
	
	public static void main(String[] args)
	{
		variableAndDataTypes3 obj = new variableAndDataTypes3();
		System.out.println("Call function");
		obj.demoFunction();
		System.out.println(obj.instantVar);
	}
}
