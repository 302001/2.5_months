import java.util.*;
public class Main

{
    static class Pair
    {
        int min;
        int max;
    }
    public static Pair getMinMax(int[] arr,int n)
    
    {
        Pair minmax=new Pair();
        if(n==1)
        {
            minmax.min=arr[0];
            minmax.max=arr[0];
            return minmax;
        }
        if(arr[0]>arr[1])
        {
            minmax.min=arr[1];
            minmax.max=arr[0];
        }
        else
        {
            minmax.min=arr[0];
            minmax.max=arr[1];
        }
        for(int i=2;i<arr.length;i++)
        {
             if (arr[i] > minmax.max) {
                minmax.max = arr[i];
            } else if (arr[i] < minmax.min) {
                minmax.min = arr[i];
            }
        }
        return minmax;
    }
	public static void main(String[] args)
	{
	    Scanner scn=new Scanner(System.in);
	    int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=scn.nextInt();
		}
		Pair minmax=getMinMax(arr,n);
		System.out.println(minmax.min);
		System.out.println(minmax.max);
		
		
	}
}
