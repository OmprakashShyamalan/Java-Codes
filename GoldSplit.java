import java.util.Scanner;

public class GoldSplit {
	private static Scanner scan;

	public static void main(String ar[])
	{
		scan = new Scanner(System.in);
		int x = scan.nextInt();
		int i=0,a[]=new int[20];
		while(x!=0)
		{
			a[i]=(x+1)/2;
			x=x/2;
			System.out.print(+a[i]+"\t");
			i++;
			
		}
		System.out.println();
		int s=scan.nextInt();
		System.out.println();
		i=0;
		while(s!=0)
		{
			if(s>=a[i])
			{
				s=s-a[i];
				System.out.print(a[i]);
				if(s!=0)
					System.out.print(" + ");
			}
			i++;
		}
	}

}
