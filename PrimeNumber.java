import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the Number:-");
		int n=s.nextInt();
		
		boolean f=true;
		
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				f=false;
				break;
			}
			
		}
		
		if(f && n>1)
		{
			System.out.println(n+" IS Prime");
		}
		else
		{
			System.out.println(n+" IS Not Prime");
		}

	}

}
