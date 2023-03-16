import java.util.*;

public class p3 {
	public static void main(String[] args) {
		// Scanner sc = new Scanner (System.in);

		int i = 10, j = 1, c = 0;

		for (i = 10; i < 1001; i++) {
			c = 0;
			// System.out.println("i" + i);
			for (j = 1; j <= i; j++) {
				// System.out.println ("j" + j);
				if (i % j == 0) {
					c++;
				}
			}
			if (c == 2) {
				// System.out.println("prime number: " + i);
				long d, num = 0, sum = 0;

				num = i;
				// System.out.println("num" + num);
				for (; num > 0;) {
					d = num % 10;
					// System.out.println ("d" + d);
					sum = sum * 10 + d;
					// System.out.println ("sum" + sum);
					num = num / 10;
					// System.out.println ("num" + num);
				}
				if (sum == i) {
					System.out.println("Prime and Palendrone: " + i);
				}
			}
		}
	}
}
