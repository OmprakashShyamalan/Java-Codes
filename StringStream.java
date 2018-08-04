import java.util.Scanner;

public class StringStream {
	
	private static Scanner scanner;

	public static void main(String ar[])
	{
		scanner = new Scanner(System.in);
		String s=scanner.nextLine();
		try {
		    int i=Integer.parseInt(s);
		    System.out.println(i);
		  } catch (NumberFormatException e) {
			  System.out.println("Terminated");
		  }
		
	}

}
