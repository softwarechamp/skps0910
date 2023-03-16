import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("Menu\nchoose to print \'1\' or \'2\' ");
      System.out.println ("1.\nS = a - a/2! + a/3! - a/4! + ...... n terms");
      System.out.println ("2.\n0\n1 0\n2 1 0\n3 2 1 0\n4 3 2 1 0");
      System.out.print ("enter choice  ");
    short ch = sc.nextShort ();

    double sum = 0;
    long fac = 1;
    int i, j;

    switch (ch)
      {

      case 1:
	System.out.print ("enter your number \'a\'  ");
	long a = sc.nextLong ();
	  System.out.print ("enter number of terms \'n\'  ");
	long n = sc.nextLong ();

	for (i = 1; i <= n; i++)
	  {
	    fac = 1;
	    for (j = i; j > 0; j--)
	      fac *= j;
	    if (i % 2 == 0)
	      sum = sum - a / fac;
	    else
	      sum = sum + a / fac;
	  }
	System.out.print ("Sum  S= " + sum);
	break;

      case 2:
	for (i = 0; i < 5; i++)
	  {
	    for (j = i; j >= 0; j--)
	      System.out.print (j + " ");
	    System.out.println ();
	  }
	break;
      }
  }
}
