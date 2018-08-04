import java.util.Scanner;

public class Chakra {
	int row,column;
	int matx[][];
	public Chakra(int a,int b)
	{
		row = a;
		column = b;
		matx=new int[a][b];
	}

	public void print()
	{
		int i,j;
		//sprint();
		System.out.println("Rows:"+row+" Column:"+column);
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				
				System.out.print(matx[i][j]+"\t");
			}
			System.out.println();
		}
	}
	public void sprint()
	{
		for(int i =0;i<row;i++)
		{
			System.out.println();
			for(int j = 0; j<column; j++)
			{
				
				System.out.print(matx[i][j]+"\t");
			}
		}
	}
	public int[][] fillmatrix()
	{
		
		int arr[][]=new int[row*column /2][2];
		int i=0,j=0,temp=1,k=0;
		int i1 = i;
		int j1 = j;
		int r = row;
		int c = column;
		int x = row * column ;
		int ct =0;
		System.out.println("\n\n");
		while(r>i1 && c>j1)
		{
			for(j=j1;j<c;j++)
				if(ct++ < x) 
					{
					matx[i][j]=temp++;
					if(matx[i][j]%11==0)
					{
						arr[k][0]=i;
						arr[k][1]=j;
						k++;
					}
					}
			i1++;j--;
			for(i=i1;i<r;i++)
				if(ct++ < x)
					{
					matx[i][j]=temp++;
					if(matx[i][j]%11==0)
					{
						arr[k][0]=i;
						arr[k][1]=j;
						k++;
					}
					}
			c--;i--;
			for(j=c-1;j>=j1;j--)
				if(ct++ < x)
					{
					matx[i][j]=temp++;
					if(matx[i][j]%11==0)
					{
						arr[k][0]=i;
						arr[k][1]=j;
						k++;
					}
					}
			r--;j++;
			for(i=r-1;i>=i1;i--)
				if(ct++ < x) {
					matx[i][j]=temp++;
					if(matx[i][j]%11==0)
					{
						arr[k][0]=i;
						arr[k][1]=j;
						k++;
					}
				}
			j1++;i++;
		}
		return arr;
	}
	public static void main(String ar[])
	{
		Scanner scan;
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		Chakra var = new Chakra(a,b);
		
		int arr[][]=var.fillmatrix();
		var.print();
		int p=((a*b) /11);
		System.out.println("Total Power Points Gained is:"+(p+1));
		for(int i=0;i<=p;i++)
		{
			if(i!=0)
				System.out.println("("+arr[i-1][0]+","+arr[i-1][1]+")");
			else
				System.out.println("(0,0)");
		}
		scan.close();
		
	}
}
