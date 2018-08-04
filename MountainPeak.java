import java.util.Scanner;

public class MountainPeak
{
	private static int count=0;
	private static Scanner scan;
	public static void main(String[] args)
    {
        scan = new Scanner(System.in);
    	int a=scan.nextInt();

    	char[] arr = new char[a];
    	for(int i=0;i<a;i++)
    	{
    		arr[i] = (char)(i+49);
    	}
    	String str = String.valueOf(arr);
    	System.out.println("The String Formed:"+str+"\nThe Peak Sequences are\n ");
        int n = str.length();
        MountainPeak permutation = new MountainPeak();
        int t= permutation.permute(str, 0, n-1);
        System.out.println("\nThe Count:"+t);
    }

    
    public int permute(String str, int l, int r)
    {
	if (l == r)
        {
        	if(check(str))
		{
		System.out.println(str);
		count++;
		}
        }
        else
        {
            for (int i = l; i <= r; i++)
            {
                {
                	str = swap(str,l,i);
                	permute(str, l+1, r);
                	str = swap(str,l,i);
                }
            }
        }
    	return count;
    }

   
    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
	public static boolean check(String s)
	{
		int p=0,e=0,len=s.length(),i=0;
		while(i+1<len && s.charAt(i)<s.charAt(i+1))
			{i++;p++;}
		while(i+1<len && s.charAt(i)>s.charAt(i+1))
			{i++;e++;}
		if(i==len-1 && p!=0 && e!=0)
			return true;
		else
			return false;
	}

}








    