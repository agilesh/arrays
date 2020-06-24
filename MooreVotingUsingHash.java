//max occuring element 

import java.util.Scanner;

public class MooreVotingUsingHash {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		
		int[] hashArray = new int[n+1];
	    for(int i=0;i<n+1;i++)
	    {
	    	hashArray[i]=0;
	    }
	   
	    for(int i=0;i<n;i++)
	    {
	        hashArray[array[i]]++;
	    }
	    
		int max=0;
		for(int i=0;i<n;i++)
		{
			if(hashArray[i]>max)
			{
				max=i;
			}
		}
		System.out.println("max element is "+max);
	}
}
