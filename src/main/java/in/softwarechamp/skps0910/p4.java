import java.util.*;
public class p4
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter \'a\' or \'b\' to choose to print one of the below series");
		System.out.println("a.  S= 1 / 1+2  +  1*2 / 1+2+3  +  1*2*3 / 1+2+3+4  +  ...... n terms");
		System.out.println("b.  1 2 3 4 5\n    2 3 4 5 1\n    3 4 5 1 2\n    4 5 1 2 3\n    5 1 2 3 4 ");
		char ch=sc.next().charAt(0);
		switch (ch){
		    
		    case 'a':
		    System.out.print("enter number of terms  ");
		    double n=sc.nextDouble();
		    double sum=0, num=1,den=0;
		    for(;n>0;--n){
		        for(int i=1;i<n+1;i++)
		        num*=i;
		        for(int j=1;j<=n+1;j++)
		        den+=j;
		        sum=sum+num/den;
		    }
		    System.out.println("S= "+sum);
		    break;
		    case 'b':
		        for (int i=1;i<=5;i++){
		            for(int j=i;j<=5;j++)
		            System.out.print(j+" ");
		            for (int k=1;k<i;k++)
		            System.out.print(k+" ");
		            System.out.println();
		        }
		    
		    break;
		    default: System.out.println("incorrect input");
		    
		}
	}
}
