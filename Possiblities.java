import java.util.Arrays;
import java.util.Scanner;

public class Possiblities {
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		int a=scan.nextInt();
		int b=scan.nextInt();
		if(b<a)
		{
			int temp=a;
			a=b;
			b=temp;
		}
		int p=(int)Math.pow(2, n);
		int k=0;
		StringBuffer str[]=new StringBuffer[p];
		for(int i=1;i<p;i++)
		{
			int ta[]=d2b(i,n);
			int count=0;
			for(int j=0;j<n;j++)
			{
					if(ta[j]==1)
						count++;
			}
			if(a<=count && count<=b)
			{
				//System.out.println();
				for(int j=0;j<n;j++)
					if(ta[j]==1)
					//System.out.print(arr[j]+" ");
						if(str[k]!=null)
							str[k].append(" "+String.valueOf(arr[j]));
						else
						{
							String s=String.valueOf(arr[j]);
							str[k]=new StringBuffer(s);
						}
				k++;
			}
		}
		String st[]=new String[k];
		for(int i=0;i<k;i++)
			st[i]=str[i].toString();
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (st[i].compareTo(st[j])>0) 
                {
                    String temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
            }
        }
		for(int i=0;i<k;i++)
			System.out.println(st[i]);
 		scan.close();
	}
	private static int[] d2b(int i,int size)
	{
		int a[]=new int[size];
		for(int j=size-1;i>0;j--)
		{
			a[j]=i%2;
			i=i/2;
		}
		return a;
	}

}
