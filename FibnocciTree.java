import java.util.Scanner;
public class FibnocciTree
{
    
    public int data;
    FibnocciTree root=null;
    FibnocciTree left=null,right=null;
    private static int count=0;
	private static Scanner scan;
    public FibnocciTree()
    {
    	this.data=0;
    }

    public FibnocciTree(int data)
    {
        
    	this.data=data;
    	this.root=null; 
    	this.left=null;
   	this.right=null;
    }

    public void printNode()
    {
        System.out.print(" "+data);
    }
    public void printpath()
    {
    	if(data!=0)
		printNode();
	if(this.root!=null)
    	{
    		this.root.printpath();    		
    	}
	
    }
    public void setleft(int n)
    {	
    	left = new FibnocciTree(n);
    	left.root=this;
    	left.findsub();
    }
    public void setright(int n)
    {	
    	right = new FibnocciTree(n);
    	right.root=this;
    	right.findsub();
    }
    public int findsub()
    {
    	if(data==0)
    	{
    		System.out.println();
    		System.out.print("G");
    		printpath();
    		count++;
    	}
    	else if(data==1)
    	{
 		setleft(data-1);
    	}
	else
	{
		setleft(data-1);
		setright(data-2);
	}
    	return count;
    }

    public static void main(String ar[])
    {
    	scan = new Scanner(System.in);
	System.out.print("Enter No. of Steps: ");
		int n = scan.nextInt();
    	FibnocciTree src = new FibnocciTree(n);
    	int t=src.findsub();
    	System.out.print("\n Total No. of Possible Ways For "+n+" Steps is "+t);
    }
}	