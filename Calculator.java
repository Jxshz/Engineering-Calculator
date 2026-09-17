import java.util.*;

public class Calculator
{
	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the value of voltage : ");
	double voltage = sc.nextDouble();
	System.out.println("Enter the value of resistance : ");
	double resistance = sc.nextDouble();
	    if ( resistance !=0 )
	    {
	        double current = voltage/resistance;
	        double power = voltage * current;
	        System.out.println("Current : " + current + "A");
	        System.out.println("Power : " + power + "W");
	    }
	    else 
	    {
        System.out.println("Resistance must be greater than 0 Ω.");
        }
	}
}