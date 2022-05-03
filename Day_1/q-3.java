import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scn=new Scanner(System.in);
	    int n=scn.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=scn.nextInt();
	    }
	    
	    int curr=0;
	    int maxTill=Integer.MIN_VALUE;
	    
	    for(int i=0;i<n;i++)
	    {
	        curr+=arr[i];
	        if(curr>maxTill)
	            maxTill=curr;
	       if(curr<0)
	            curr=0;

	    }
	    System.out.println(maxTill);
	
	}
}
