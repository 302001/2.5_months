

import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int m=scn.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scn.nextInt();
        int result=0;
        if(n==0||m==0)
            result=0;
        Arrays.sort(arr);
        if(n<m)
            result=-1;
        
        int minDiff=Integer.MAX_VALUE;
        
        for(int i=0;i+m-1<n;i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < minDiff)
                minDiff = diff;
        }
        result=minDiff;
        System.out.println(result);
	}
}
