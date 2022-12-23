import java.util.Scanner;
class Main
{
	double celsius(double f)
	{	
	    return (f-32)*5/9;
	}
	public static void main(String arg[])	
	{
	double a,c;
    Scanner sc=new Scanner(System.in);	   	 
    System.out.println("Enter  Fahrenheit temperature");
               a=sc.nextDouble();
    Main fah=new Main();
    double result=fah.celsius(a);	
    System.out.println("Celsius temperature is = "+result);	     
	} 	
}
