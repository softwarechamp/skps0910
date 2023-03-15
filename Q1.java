public class Q1{
public static void main (String [] args){

	float sum =0f;
	for (int i=1;i<20;i++){
		float temp = i/(i+1.0f);
		System.out.println("Temp: "+temp);
		 sum = sum + (i/(i+1.0f));
         System.out.println("inbetween sum: "+sum);
	}
	System.out.println(sum);

}
}
