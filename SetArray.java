import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.*;
public class SetArray {

	int count=0;
	NumberSet n[] = new NumberSet[20];
	private static Scanner scan2;
	private static PrintWriter writer;
	
	public SetArray(int x)
	{
		count = x;
		for(int i=0;i<x;i++)
		{
			scan2 = new Scanner(System.in);
			int a = scan2.nextInt();
			int b = scan2.nextInt();
			n[i] = new NumberSet(a,b);
		}
	}
	public void sort()
	{
		for(int i=0;i<count;i++)
		{
			for(int j=i+1;j<count;j++)
			{
				if(n[i].x>n[j].x)
				{
					int temp=n[i].x;
					n[i].x=n[j].x;
					n[j].x=temp;
					
					temp=n[i].y;
					n[i].y=n[j].y;
					n[j].y=temp;
				}
					
			}
		}
	}
	public void compare()
	{
		for(int i=0;i<count-1;i++)
		{
			if(n[i].y>=n[i+1].x)
			{
				n[i+1].x = n[i].x;
				if(n[i].y>n[i+1].y)
					n[i+1].y = n[i].y;
				else
					n[i].y = n[i+1].y;
				
				n[i].x = 0;
				n[i].y = 0;
			}
		}
	}
	public void print()
	{
		for(int i=0;i<count;i++)
			if(n[i].x!=0 || n[i].y!=0)
			System.out.println("("+n[i].x+","+n[i].y+")");
	}
	
	
	public static void main(String ar[]) throws FileNotFoundException, UnsupportedEncodingException
	{
		scan2 = new Scanner(System.in);
		int x = scan2.nextInt();
		SetArray v = new SetArray(x);
		System.out.println("Number of Sets are "+x);
		v.print();
		v.sort();
		
		v.compare();
		writer = new PrintWriter("Output.txt","UTF-8");
		System.out.println("\nTHE Sorted Set is\n");
		v.print();
		writer.close();
		
	}

	
}
