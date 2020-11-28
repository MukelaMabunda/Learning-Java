
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
	}
}
