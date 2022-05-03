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
	    int first=0;
	    int last=n-1;
	    while(first<=last)
	    {
	        int temp=arr[first];
	        arr[first]=arr[last];
	        arr[last]=temp;
	        first++;
	        last--;
	    }
	    for(int i=0;i<n;i++)
	    System.out.print(arr[i]+"-");
	
	}
}
