import java.util.Scanner;

public class MooreVoting {

	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		int majorityElement  = getMajorityElement(array,n);
	    int majorityConfirm  = isMajorityElement(array,n,majorityElement);
	    System.out.println("the majortiy element is "+majorityConfirm);
	}

	

	private static int getMajorityElement(int[] array, int n) {
		
		int majorityIndex = 0;
		int count = 1;
		for(int i=1;i<n;i++)
		{
			if(array[majorityIndex]==array[i])
			{
				count++;
			}
			else
			{
				count--;
			}
			if(count==0)
			{
				majorityIndex=i;
				count=1;
			}
		}
           return array[majorityIndex];
	}
	
	
private static int isMajorityElement(int[] array, int n, int majorityElement) {
	
	int count=0;
	for(int i=0;i<n;i++)
	{
		if(array[i]==majorityElement)
		{
			count++;
		}
	}
	if(count>n/2)
	{
		return majorityElement;
	}
	return 0;
		
	}
}
