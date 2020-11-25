import java.util.*;

public class hello2 
{
	public static void main(String[] args)
	{		
		Scanner userInputScanner = new Scanner(System.in);
		System.out.print("Input name: ");
		String nameOfUser = userInputScanner.nextLine();
		System.out.print("Hello "+ nameOfUser+ "!!");	
	}
}
