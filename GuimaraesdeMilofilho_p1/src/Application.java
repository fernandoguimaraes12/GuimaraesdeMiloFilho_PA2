import java.util.Scanner;

public class Application
{
	public static void main(String[] args)
	{
		Scanner input =  new Scanner(System.in);
		
		System.out.println("Welcome, type '1' to encrypt or '2' to decrypt: ");
		int num = input.nextInt();
		
		if(num == 1)
		{
			Encrypter.main(args);
		}
		
		if(num == 2)
		{
			Decrypter.main(args);
		}
		
		
	}
}