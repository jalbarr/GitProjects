package jobalbarr.csci210;



public class Hello {
	static public void main(String[] arg) {
		int a = 7358;
		int b = 2389;
		int c = a + b;
		
		System.out.println("Hello Job! " + "\n" + (int)(7358+2389));
		System.out.println(a);
		System.out.println("The product of "+ a +" and " + b + " is " + (a * b) +".");
		System.out.printf("The sum of %d and %d is %d\n", a, b, c);
		System.out.printf("The difference of %d and %d is %d.\n", a, b, (a-b));
		System.out.printf("The product of %d and %d is %d.\n", a, b, (a*b));
		
		long al = 2145949008;
		long bl = 23497118;
		long cl = al + bl;
		
		System.out.printf("The sum of %d and %d is %d\n", al, bl, cl);
		System.out.printf("The difference of %d and %d is %d.\n", al, bl, (al-bl));
		System.out.printf("The product of %d and %d is %d.\n", al, bl, (al*bl));
		
		int i = 30;
		float f = 30;
		f = 125445.5654f;
		
		for(int j = 1;j <= 12;j++) {
			
			System.out.printf("%2d %9d %9d       %2.4f\n", j, (j*j), (j*j*j), Math.sqrt(j));
		}
		
	}
}