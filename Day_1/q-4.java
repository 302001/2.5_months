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
	    
	    boolean flag=false;
	    Arrays.sort(arr);
	    for(int i=1;i<n;i++)
	    {
	        if(arr[i]==arr[i-1])
	            flag=true;
	       
	    }
	    if(flag)
	        System.out.println("true");
	    else 
	        System.out.println("false");
	
	}
}
