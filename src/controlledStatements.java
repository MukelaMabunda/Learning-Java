
public class controlledStatements
{
	/*public static void main(String[] args)
	{
		int a = 200;
		int b = 100;
		if (a > b)
		{ // if true,run the next command
			System.out.print("a is greater than b.");
		}
	}*/

	static int result = 0;
	static void test(int testval, int target)
	{
		if (testval > target)
			result = +1;
		else if (testval < target)
			result = -1;
		else
			result = 0;
	}
	
	private static void print(int result2)
	{
		System.out.println(result2);
	}
	
	public static void main(String[] args)
	{
		test(10, 5);
		print(result);
		test(5, 10);
		print(result);
		test(5, 5);
		print(result);
	}
}
