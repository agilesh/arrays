//a sorted array whose element occured more than n/2 times
import java.util.Scanner;


public class MajorityElement {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt
				
				
				();
		int array[] = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		
		for(int i=0;i<n/2;i++)
		{
			if(array[i]==array[i+(n/2)])
			{
				System.out.println("The majority element is "+array[i]);
				break;
			}
		}
	}
}

