import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DNA_String {
    public static int compare(String s1,String s2)
    {
        char ch1[],ch2[];
        int flag=-1;
        ch1=s1.toCharArray();
        ch2=s2.toCharArray();
        for(int i=0;i<s1.length() && i<s2.length();i++)
        {
            if(ch1[i]!=ch2[i])
            {
                return ch1[i]-ch2[i];
            }
            flag=0;
        }
        return flag;
        	
    }

    public static int[] solve(int f,int l,String s,int n,String[] genes,int max,int[] health,int result[])
    {
        int temp=0;
        int len=s.length();
        for(int i=0;i<=len;i++)
        {
           for(int j=i;j<=len && j<=i+max;j++)
           {
               String sub=s.substring(i,j);
               for(int k=f;k<=l;k++)
               {
            	   int t=compare(sub,genes[k]);
                   if(t==0) {
                	   temp+=health[k];
                	   System.out.println("compared Strings are "+sub+" , "+genes[k]+" added health is "+health[k]+" and temp is "+temp);
                   } 
                   else if(t>0)
                	   break;
                   else
                	   System.out.println("compared Strings are "+sub+" , "+genes[k]);
               }
               
           }
        }
        System.out.println(s+" health is "+temp);
        if(temp<result[0] || result[0]==-1)
            result[0]=temp;
        if(temp>result[1] || result[1]==-1)
            result[1]=temp;
        return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max=0;
        String[] genes = new String[n];
        for(int genes_i = 0; genes_i < n; genes_i++){
            genes[genes_i] = in.next();
            if(max<genes[genes_i].length())
                max=genes[genes_i].length();
        }
        int[] health = new int[n];
        for(int health_i = 0; health_i < n; health_i++){
            health[health_i] = in.nextInt();
        }
        int s=in.nextInt();
        int[] result=new int[2];
        result[0]=-1;
        result[1]=-1;
        for(int a0 = 0; a0 < s; a0++){
           int  first = in.nextInt();
           int last= in.nextInt();
           String d = in.next();
            result=solve(first,last,d,n,genes,max,health,result);
        }
        System.out.print(result[0]+" "+result[1]);
        in.close();
    }

	public static void sort(String[] genes, int[] health, int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(compare(genes[i],genes[j])>0)
				{
					String temp=genes[i];
					genes[i]=genes[j];
					genes[j]=temp;
					int temp_int=health[i];
					health[i]=health[j];
					health[j]=temp_int;
				}
			}
		}
	}
}
