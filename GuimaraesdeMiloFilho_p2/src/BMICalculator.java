import java.util.Scanner;

public class BMICalculator
{


	private int readImperialData()
	{
		return 0;
	}
	
	private int readMetricData()
	{
		return 0;
	
	}
	
	private int readMeasurementData()
	{
		return 0;
	}
	
	
	private int readUnitType()
	{	
		return 0;
	}
	
	public void readUserData(int readUnitType, int readMeasurementData)
	{
		
	}
	
	public static double calculateBmi(double Weight, double Height)
	{
		double BMI = (703 * Weight)/ Height; 
		System.out.printf("Your BMI is: %f", BMI);	
		return BMI;
	}
	
	private void calculateBmiCategory()
	{
		
	}
	
	public static void displayBmi(double BMI)
	{

		System.out.printf("Your BMI is: %f", BMI);	
	}
	
	public static double getWeight()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is you weight?");
		double weight = input.nextDouble();
		return weight;
	}
	
	private static int setWeight()
	{
		getWeight();
		return 0;
	}
	
	public static double getHeight()
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is you height?");
		double height = input.nextDouble();
		
		return height;
	}
	
	private static double setHeight()
	{
		getHeight();
		return 0;
	}
	
	public int getBMI()
	{
		return 0;
	}
	
	public int BmiCategory()
	{
		return 0;
	}
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Press 1 to use Pounds and Inches, press 2 to use Kilograms and Meters");
		int selection = input.nextInt();
		
		if(selection == 1)
		{
			
			calculateBmi(setWeight(), setHeight());
			
		}
		
	}
	

	
}
