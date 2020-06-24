import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElementUsingHashmap {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		
		HashMap<Integer, Integer> hm = new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(array[i]))
			{
				int count = hm.get(array[i])+1;
				if(count>n/2)
				{
					System.out.println("the majority element is "+array[i]);
					break;
				}
				else
				{
					hm.put(array[i], count);
				}
				
			}
			else
			{
				hm.put(array[i], 1);
			}
		}
}
}
