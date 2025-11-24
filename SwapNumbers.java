import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter number a:-");
		int a = s.nextInt();
		System.out.println("Enter number a:-");
		int b = s.nextInt();
		
		
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swaping the numbers:- "+"a = " + a + ", b = " + b);

	}

}
