import java.util.Scanner;

public class Bball {

	int n;
	int ai,aj;
	int bi,bj;
	private static Scanner sc;
	
	public Bball()
	{
		n = 0;
		ai=0;aj=0;bi=0;bj=0;
	}
	
	public static void main(String args[])
	{
		sc = new Scanner(System.in);
		Bball b = new Bball();
		b.n=sc.nextInt(); 
		b.ai=sc.nextInt();
		b.aj=sc.nextInt();
		b.bi=sc.nextInt();
		b.bj=sc.nextInt();
		int[][] arr= new int[b.n][b.n];
		for(int i=0;i<b.n;i++)
		{
			for(int j=0;j<b.n;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		arr[b.ai][b.aj]=24;
		arr[b.bi][b.bj]=25;	
		//find possible path
		
	}
}
