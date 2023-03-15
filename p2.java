import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      System.out.println ("enter 2 numbers \'m\' and \'n\' such that m<n");
      System.out.print ("m= ");
    long m = sc.nextLong ();
      System.out.print ("n= ");
    long n = sc.nextLong ();

    boolean bo = false;
    long j;

    if (m < n)
      {
	System.out.println ("Numbers between " + m + " and " + n +
			    " without any zeroes are --");
	for (; m < n;)
	  {
	    j = ++m;

	    for (; j > 0; j = j / 10)
	      {
		if (j % 10 != 0)
		  {
		    bo = true;
		  }
		else
		  {
		    bo = false;
		    break;
		  }
	      }
	    if (bo == true)
	      System.out.print (m + " ");
	  }

      }
    else
      System.out.println ("incorrect input");
  }
}
