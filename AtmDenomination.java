import java.util.Scanner;

public class AtmDenomination {

	int x = 0;
	int y = 0;
	int z = 0;
	int a=10,b=10,c=10;
	int value = 0;
	private static Scanner scan;
	public AtmDenomination(int n)
	{
		value = n;
	}
	public void split()
	{
		int x1=0,y1=0,z1=0;
		x=0;y=0;z=0;
		if(x1==0 && value>=100 && a>=5)
		{
			value = value - 100;
			x1++;a--;
		}
		if(y1==0 && value>=500 && b>=2)
		{
			value = value - 500;
			y1++;b--;
		}
		while(value>=2000 && c!=0)
		{
			value = value - 2000;
			z1++;c--;
		}
		while(value>=500 && b!=0)
		{
			value = value - 500;
			y1++;b--;
		}
		while(value>=100 && a!=0)
		{
			value = value - 100;
			x1++;a--;
		}
		if(value == 0)
		{
			x=x1;y=y1;z=z1;
		}
		else
		{
			a=a+x1;
			b=b+y1;
			c=c+z1;
		}
	}
	public void print()
	{
		if(x!=0 || y!=0 || z!=0)
			System.out.println("\n"+x+" Hundreds\n"+y+" Five Hundreds\n"+z+" Thousands");
		else
			System.out.println("Invalid Amount");
	}
	public static void main(String ar[])
	{
		scan = new Scanner(System.in);
		int x = 0;
		AtmDenomination a = new AtmDenomination(0);
		while(true)
		{
			x = scan.nextInt();
			a.value = x;
			a.split();
			a.print();
			System.out.println("PRESS 1 TO CONTINUE");
			int c=scan.nextInt();
			if(c!=1)
				break;
		}
	}
}
