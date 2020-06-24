
//get max difference such that left element should be lower than that of right

import java.util.Scanner;


public class getMaxDifference 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		
		int maxDifference = getmaxDifference(array,n);
		System.out.println(maxDifference);

}

	private static int getmaxDifference(int[] array, int n)
	{
		int min_element_so_far = array[0];
		int max_diff_so_far = array[1]-array[0];
		int curr_diff = array[1]-array[0];
		int index;
		for(index=1;index<n;index++)
		{
			if(array[index]<min_element_so_far)
			{
				min_element_so_far=array[index];
			}
			else
			{
				curr_diff = array[index]- min_element_so_far;
				if(curr_diff > max_diff_so_far)
				{
					max_diff_so_far=curr_diff;
				}
			}
		}
		return max_diff_so_far;
			
	} 
}