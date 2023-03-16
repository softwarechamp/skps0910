import java.util.Scanner;
public class p5
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 numbers \'a\' and \''b\'");
		System.out.print(" number \'a\'  ");
		double a=sc.nextDouble();
		System.out.print(" number \'b\'  ");
		double b=sc.nextDouble();
		double gcd=0,lcm=0;     int i;
		for ( i=1;i<=a&&i<=b;i++){
		    if (a%i==0 && b%i==0)
		    gcd=i;
		}
		lcm=a*b/gcd;
		System.out.println("greatest common divisor of "+a+" and "+b+" is  "+gcd);
		System.out.println("least common multiple of "+a+" and "+b+" is  "+lcm);
	}
}
