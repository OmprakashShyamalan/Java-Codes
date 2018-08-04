import java.util.Scanner;

public class ConcatPrime {

	private static Scanner scan;
	public static void main(String args[])
	{
		scan = new Scanner(System.in);
		int n = scan.nextInt();
		int j=0,count=0;
		int arr[]=new int[n];
		for(int i=2;i<=n;i++)
		{
			if(isprime(i))
			{
				arr[j]=i;
				System.out.println(i);
			    j++;
			}
		}System.out.println("end");
		for(int i =0;i<j;i++)
		{
			for(int k=0;k<j;k++)
				{
				int temp = concat(arr[i],arr[k]);
				if(isprime(temp))
				{
					System.out.println(temp);
					count++;
				}
				}
				
					
		}
		System.out.println(count);
		
	}

	private static boolean isprime(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	private static int concat(int x, int y) {
	    int temp = y;
	    while (y != 0) {
	        x *= 10;
	        y /= 10;
	    }
	    return x + temp;
	}
}
