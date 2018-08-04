import java.util.Scanner;

public class Accico2 {

	public static int[] data = new int[30];
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int flag=0;

	String input = sc.nextLine(); 
	String numbers[] = input.split(" ");
	for(int j = 0;j < numbers.length;j++){
	data[j] = Integer.parseInt(numbers[j]);
	}

	int N = numbers.length;
	System.out.println("length of data "+ N);
	int start=0;
	int end=data.length -1;
	int sum_start=data[start];
	int sum_end=data[end];
	while(start<end)
	{
		if(sum_start<sum_end)
		{
			start++;
			sum_start+=data[start];
		}
		else if(sum_start>sum_end)
		{
			end--;
			sum_end+=data[end];
		}
		else
		{
			int a=start+1;
			int b=end-1;
			int sum_mid=0;
			for(int a_i=a+1;a_i<b;a_i++)
			{
				sum_mid+=data[a_i];
			}
			if(sum_end==sum_mid)
			{
				System.out.print("Indices which form Equi pair");
				System.out.println("{"+a+","+b+"}");
				System.out.print("Slices are");
				System.out.println("{0,"+(a-1)+",{"+(a+1)+","+(b-1)+"},"+"{"+(b+1)+","+(N-1)+"}");
				flag=1;
				break;
			}
			else {
				start++;
				sum_start+=data[start];	
			}
		}
	}
	if(flag==0)
	{
		System.out.println("Array does not contain any Equi pair");
	}
	}
}
