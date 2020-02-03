import java.util.Scanner;

public class Encrypter
{
	
	
	public static void main(String[] args)
	{
		Scanner input =  new Scanner(System.in);
	
		System.out.println("Enter the message: ");
		int num = input.nextInt();
			
				
		int a, b, c, d;
		     
		a = num / 1000;
		
		b = num / 100 % 10;

		c = num / 10 % 10;

	    d = num % 10;
	    
	    a = (a + 7)%10;
	    b = (b + 7)%10;
	    c = (c + 7)%10;
	    d = (d + 7)%10;
		
	    System.out.printf("%d%d%d%d", c,d,a,b);

	}
	
	
}