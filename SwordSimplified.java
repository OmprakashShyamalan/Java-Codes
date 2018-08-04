import java.util.Scanner;
public class SwordSimplified {

	private static Scanner scan;
	public static void main(String ar[])
	{
		scan = new Scanner(System.in);
		int i = scan.nextInt();
		int x = 1;
		System.out.println("No.of People in queue\tSurvivor");
		for(int n=1;n<=i;n++)
		{
		int temp=(int)(Math.log(n)/Math.log(2));
		x=(int)Math.pow(2,temp);
		int t = 1 + (2 *(n-x));
		System.out.println(n+"\t\t\t"+t);
		}
	}
}
