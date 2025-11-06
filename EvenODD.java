import java.util.Scanner;

public class EvenODD {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter the number:-");
		int n=s.nextInt();
		
		if(n % 2==0)
		{
			System.out.println(n+" IS Even");
		}
		else{
			System.out.println(n+" IS ODD");
		}
		

	}

}
