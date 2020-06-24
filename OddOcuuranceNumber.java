import java.util.Scanner;

//odd occurance number in an array

public class OddOcuuranceNumber {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
		long array[] = new long[n];
		for(int i=0;i<n;i++)
		{
			array[i] = sc.nextInt();
		}
		long res = 0;
		for(int i=0;i<n;i++)
		{
			res = res ^ array[i];
		}
System.out.println(res);
}
}