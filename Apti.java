import java.util.Scanner;

public class Apti {
	int row,column;
	int matx[][];
	public Apti(int a,int b)
	{
		row = a;
		column = b;
		matx=new int[a][b];
	}

	public void print()
	{
		int i,j;
		//sprint();
		//System.out.println("Rows:"+row+" Column:"+column);
		for(i=0;i<row;i++)
		{
			for(j=0;j<column;j++)
			{
				if(matx[i][j]==(row*column))
					System.out.println((i+1)+"\t"+(j+1));
				//System.out.print(matx[i][j]+"\t");
			}
			//System.out.println();
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
	public int fillmatrix()
	{
		
		int arr=0;
		int i=0,j=0,temp=1,k=0;
		int i1 = i;
		int j1 = j;
		int r = row;
		int c = column;
		int x = row * column ;
		int ct =0;
		//System.out.println("\n\n");
		while(r>i1 && c>j1)
		{
			for(j=j1;j<c;j++)
				if(ct++ < x) 
					{
					matx[i][j]=temp++;
					}
			i1++;j--;
			for(i=i1;i<r;i++)
				if(ct++ < x)
					{
					matx[i][j]=temp++;
					}
			c--;i--;
			for(j=c-1;j>=j1;j--)
				if(ct++ < x)
					{
					matx[i][j]=temp++;
					}
			r--;j++;
			for(i=r-1;i>=i1;i--)
				if(ct++ < x) {
					matx[i][j]=temp++;
				}
			j1++;i++;
			arr++;
		}
		return arr;
	}
	public static void main(String ar[])
	{
		Scanner scan;
		scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int i,j;
		System.out.println("\tRound\tRow\tColumn\tEnd Row\tEnd Column");
		for(i=1,j=1;i<a||j<=b;j++)
		{
		
		Apti var = new Apti(i,j);
		
		int arr=var.fillmatrix();
		System.out.print("\t"+arr+"\t"+i+"\t"+j+"\t");
		var.print();
		//System.out.println();
		if(i<a)
			i++;
		}
		int p=((a*b) /11);
		//System.out.println("Total Power Points Gained is:"+(p+1));
		/*for(int i=0;i<=p;i++)
		{
			if(i!=0)
				System.out.println("("+arr[i-1][0]+","+arr[i-1][1]+")");
			else
				System.out.println("(0,0)");
		}*/
		scan.close();
		
	}
}
