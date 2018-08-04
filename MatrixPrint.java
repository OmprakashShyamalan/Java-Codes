import java.util.Scanner;

public class MatrixPrint {
	int row,column;
	int matx[][] = new int[10][10];
	public MatrixPrint(int a,int b)
	{
		row = a;
		column = b;
	}

	public void fillmatrix()
	{
		int temp = 1,i,j;
		System.out.println(row+" "+column);
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				System.out.print(matx[i][j]+" ");
				temp ++;
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
	public void print()
	{
		int i=0,j=0;
		int i1 = i;
		int j1 = j;
		int r = row;
		int c = column;
		int x = row * column ;
		int ct =0;
		int temp=1;
		System.out.println("\n\n");
		while(r>i1 && c>j1)
		{
			for(j=j1;j<c;j++)
				if(ct++ < x)matx[i][j]=temp++;
			i1++;j--;
			for(i=i1;i<r;i++)
				if(ct++ < x)matx[i][j]=temp++;
			c--;i--;
			for(j=c-1;j>=j1;j--)
				if(ct++ < x)matx[i][j]=temp++;
			r--;j++;
			for(i=r-1;i>=i1;i--)
				if(ct++ < x)matx[i][j]=temp++;
			j1++;i++;
		}
	}
	public static void main(String ar[])
	{
		Scanner scan;
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		MatrixPrint var = new MatrixPrint(a,b);
		var.print();
		var.fillmatrix();
		
		scan.close();
		
	}
}
