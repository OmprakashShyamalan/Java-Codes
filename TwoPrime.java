import java.util.Scanner;

public class TwoPrime {
	private static Scanner scan;
public static void main(String ar[]) {
	scan=new Scanner(System.in);
	int t=scan.nextInt();
	int n=0;
	for(int i=0;i<t;i++) {
		n=n+2;
		int temp=2;
		while(temp!=n)
		{
			if(isprime(temp) && isprime(n-temp))
			{
					System.out.println(n+"->"+temp+" "+(n-temp));
					break;
			}
			else
				temp++;
			if(temp==n)
				System.out.println("NO PRIME PAIR POSSIBLE");
				
		}
		scan.close();
	}
}

private static boolean isprime(int n) {
	for(int i=2;i<=n/2;i++)
		if(n%i==0)
			return false;
	return true;
}
}
