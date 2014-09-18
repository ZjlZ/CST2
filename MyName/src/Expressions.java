
public class Expressions {
	public static void main(String[] args)
	{
	//1
	System.out.print("4.0 / 2 * 9 / 2 = ");
	System.out.println( 4.0 / 2 * 9 / 2 );
	//2
	System.out.print("12 / 7 * 4.4 * 2 / 4 = ");
	System.out.println( 12 / 7 * 4.4 * 2 / 4 );
	//3
	System.out.print("9 / 2.0 + 7 / 3 – 3.0 / 2 = ");
	System.out.println( 9 / 2.0 + 7 / 3 - 3.0 / 2 );
	//4
	System.out.print("53 / 5 / (0.6 + 1.4) / 2 + 13 / 2 = ");
	System.out.println( 53 / 5 / (0.6 + 1.4) / 2 + 13 / 2 );
	//5
	System.out.print("(238 % 11 + 3) % 7 = ");
	System.out.println( (238 % 11 + 3) % 7 );
	//6
	System.out.print("89 % 10 /  4 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2 = ");
	System.out.println( 89 % 10 /  4 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2 );
	//7explain
	System.out.print("2 + \"(int) 2.0\" + 2 * 2 + 2" + 2 + "(int) 2.0");
	System.out.println( 2 * 2 + 2 );
	//8explain
	/*
	 * 1, 4, and 7 are in "", which means
	 * 2, 4 and 8, 9 are added
	 * 5, 6 are multiplied
	 * 
	 */
	System.out.print("\"1\" + 2 + 4 + \"4\" + 5 * 6 + \"7\" + (8 + 9) = ");
	System.out.println(  "1" + 2 + 4 + "4" + 5 * 6 + "7" + (8 + 9)  );
	
	/*
		4.0 / 2 * 9 / 2
		12 / 7 * 4.4 * 2 / 4
		9 / 2.0 + 7 / 3 – 3.0 / 2
		53 / 5 / (0.6 + 1.4) / 2 + 13 / 2
		(238 % 11 + 3) % 7
		89 % 10 /  4 * 2.0 / 5 + (1.5 + 1.0 / 2) * 2
		2 + "(int) 2.0" + 2 * 2 + 2
		"1" + 2 + 4 + "4" + 5 * 6 + "7" + (8 + 9)
	*/
	
	}
}
