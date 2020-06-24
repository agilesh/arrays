//all pairs in an array whose sum in array is x

import java.util.Scanner;




public class Pairs {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		int targetSum = sc.nextInt();
		
		int[] hashArray = new int[n+1];
		for(int i=0;i<n+1;i++)
		{
			hashArray[i]=0;
		}
		
		
		for(int i=0;i<n;i++)
		{
			int temp = targetSum - array[i];
			if(temp >=0 && hashArray[temp]==1)
			{
				System.out.println("The pairs for "+targetSum+" is "+temp+" "+"and "+array[i]);
			}
			hashArray[array[i]]=1;
			
		}
	}

}
