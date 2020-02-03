import java.util.Scanner;

public class Decrypter
{
	
	
	public static void main(String[] args)
	{
		Scanner input =  new Scanner(System.in);
	
		System.out.println("Enter the decrypt message: ");
		int num = input.nextInt();
			
				
		int a, b, c, d;
		     
		a = num / 1000;
		
		b = num / 100 % 10;

		c = num / 10 % 10;

	    d = num % 10;
	    
	    a = (a - 7 + 10)%10;
	    //System.out.printf("a = %d\n", a); testing numbers 
	    b = (b - 7 + 10)%10;
	    //System.out.printf("b = %d\n", b); testing numbers
	    c = (c - 7 + 10)%10;
	    //System.out.printf("c = %d\n", c); testing numbers
	    d = (d - 7 + 10)%10;
	    //System.out.printf("d = %d\n", d); testing numbers
		
	    System.out.printf("%d%d%d%d", c,d,a,b);

	}
	
	
}