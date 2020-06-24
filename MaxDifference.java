 import java.util.Scanner;
//o(n2)
public class MaxDifference {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++)
			
			
			   
		{
			array[i] = sc.nextInt();
		}
		int max=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				if(array[i]<array[j])
				{
					int currmax = array[j]-array[i];
					if(currmax>max)
					{
						max=currmax;
					}
				}
				
			}
		}
		System.out.println(max);
}
}