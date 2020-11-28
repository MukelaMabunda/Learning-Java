
public class loops
{
	public static void main(String[] args)
	{
		int a = 0;
		System.out.println("The Changing value of 'a' during execution :");
		while (a < 20)
		{
			System.out.println("a : " + a);
			a++;
		}

		a = 0;
		System.out.println("\nThe Changing value of 'a' during execution :");
		do
		{
			System.out.println(" a : " + a);
			a++;
		} while (a < 10);

		for (a = 10; a < 20; a += 1)
		{
			System.out.println("value of a : " + a);
		}

		int[] array = { 10, 20, 30, 40, 50 };
		for (int b : array)
		{
			System.out.print(b);
			System.out.print(",");
		}
		
		System.out.print("\n");
		
		String[] list = { "Fayaz", "Khan", "joy", "jeff" };
		for (String li : list)
		{
			System.out.print(li);
			System.out.print(",");
		}
	}
}
