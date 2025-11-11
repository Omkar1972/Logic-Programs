import java.util.Scanner;

public class InvertedPyramid {
	
    public static void main(String[] args) {
    	
    	Scanner s=new Scanner(System.in);
    	
    	System.out.print("Enter number:-");
    	int r = s.nextInt();
    	
        for (int i = r; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
