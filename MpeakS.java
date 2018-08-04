import java.util.Scanner;

public class MpeakS {

	private static Scanner scan;
	public static void main(String args[])
	{
		scan = new Scanner(System.in);
    	int j=scan.nextInt();
    	long t=0;
    	t=(int)Math.pow(2,j-1)-2;
        	System.out.println(j+"  "+t);
    	
   	}
}
