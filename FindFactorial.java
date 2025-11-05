import java.util.Scanner;

public class FindFactorial {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number:-");
		int n=s.nextInt();
		
		long f=1;
		
		for(int i=1;i<=n;i++)
		{
			f *=i;
		}
		
		System.out.println("Factorial:- "+f);
		

	}

}
