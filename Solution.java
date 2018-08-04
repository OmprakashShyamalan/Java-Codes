import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
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
                  if(sub.compareTo(genes[k])==0) {
                	   temp+=health[k];	   
                   } 
               }  
           }
        }
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
}
