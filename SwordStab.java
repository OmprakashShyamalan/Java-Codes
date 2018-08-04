import java.util.Scanner;

public class SwordStab {
	
	private static Scanner scan;
	public int startStab(int x)
	{
		//int x;
		//Scanner scan = new Scanner(System.in);
		//x=scan.nextInt();
		int a[] = new int[x+1];
		for(int i=1;i<=x;i++)
			a[i]=i;
		int term=x;
		int count=0;
		int i;
		while(term!=1)
		{
			for(i=1;i<=x;i++)
			{
				if(a[i]!=0)
				{
					if(count==1)
					{
						System.out.print("Stabbed "+a[i]);
						a[i]=0;
						count = 0;
						term--;
						
					}
					else
					{
						if(term!=x && term!=1)
							System.out.println(" And gave the Sword to "+a[i]);
						if(term!=1)
							System.out.print(+a[i]+" ");
						count=1;
					}
										
				}
			}
			
		}
	for(i=1;i<=x;i++)
		if(a[i]!=0)
			{
			System.out.println("\nThe Unkilled Person is "+a[i]);
			return a[i];
			}
		
		return 0;
	}
	public static void main(String ar[])
	{
		SwordStab s = new SwordStab();
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		//int f = scan.nextInt();
		//int i =0;
		//for(i=1;i<=a;i++)
		{
			s = new SwordStab();
			System.out.println(a+" people in the queue and surviour is "+s.startStab(a));
		}
	}
}
