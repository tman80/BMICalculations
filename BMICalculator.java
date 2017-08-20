import java.util.Scanner;

public class BMICalculator {
	
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		
		double kilograms_per_pound =  0.45359237;
	    double metres_per_inch = 0.0254;
		
		// prompt user to enter their weight in pounds
		System.out.print( "Your weight in pounds: " ) ;
		double weight = keyboard.nextDouble();
		
		//prompt user to enter their height in inches
		System.out.print( "Your height in inches: " );
		double height = keyboard.nextDouble();
		
		//convert weight to kilograms
		weight = weight * kilograms_per_pound;
		
		//convert height to metres
		height = height * metres_per_inch;
		
		//calculating BMI
		double bmi = weight / Math.pow(height, 2);
		
		
	    System.out.println( "Your BMI is " + bmi );
	}
}