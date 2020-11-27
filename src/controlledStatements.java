import java.util.Scanner;
import static java.lang.System.out;

public class controlledStatements
{
	/*
	 * public static void main(String[] args) { int a = 200; int b = 100; if (a > b)
	 * { // if true,run the next command System.out.print("a is greater than b."); }
	 * }
	 */

	/*
	 * static int result = 0; static void test(int testval, int target) { if
	 * (testval > target) result = +1; else if (testval < target) result = -1; else
	 * result = 0; }
	 * 
	 * private static void print(int result2) { System.out.println(result2); }
	 * 
	 * public static void main(String[] args) { test(10, 5); print(result); test(5,
	 * 10); print(result); test(5, 5); print(result); }
	 */

	/*
	 * static boolean condition() { boolean result = Math.random() < 0.99;
	 * System.out.print(result + ", "); return result; }
	 * 
	 * public static void main(String[] args) { while (condition())
	 * System.out.println("Inside ‘while’");
	 * 
	 * System.out.println("Exited ‘while’"); }
	 */

	public static void main(String args[])
	{
		try (Scanner myScanner = new Scanner(System.in))
		{
			int hankees, socks;
			out.print("Hankees and Socks scores?");
			hankees = myScanner.nextInt();
			socks = myScanner.nextInt();
			out.println();
			if (hankees > socks)
			{
				out.println("Hankees win...");
				out.print("Hankees: ");
				out.println(hankees);
				out.print("Socks: ");
				out.println(socks);
			} else if (socks > hankees)
			{
				out.println("Socks win...");
				out.print("Socks: ");
				out.println(socks);
				out.print("Hankees: ");
				out.println(hankees);

			} else
			{
				out.println("It's a tie...");
				out.print("Hankees: ");
				out.println(hankees);
				out.print("Socks: ");
				out.println(socks);
			}
		}
	}
}
