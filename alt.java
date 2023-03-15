public class alt{

public static void main(String args[]){

	int adds=0;
	for (int i=2;i<=20;i+=4){
		adds=adds+i;
	}
	int minus=0;
	for (int i=4;i<=20;i+=4){
		minus= minus+i;
	}
	int total = adds-minus;
	System.out.println("Total: "+total);
}
}
