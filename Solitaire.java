import java.util.Scanner;

public class Solitaire {
	
	int count;
	String s[];
	private static Scanner s2;
	public String push(String t,String a)
	{
		t.concat(a);
		return t;
		
	}
	public static void main(String args[])
	{
		s2 = new Scanner (System.in);
		int a=s2.nextInt();
		String[] arr=new String[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=s2.next();
		}
		
	}

}
