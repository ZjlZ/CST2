/**
 * @author larsozac000
 * @since 2014-11-10
 */

public class Both {
	
	public static void main(String[] args) {
		//Task One
		drawZ();
		drawJ();
		drawL();
		//Task Two
		vertical();
	}
	
	public static void vertical() {
		  //End of Z and J lines have two extra spaces
		  //Allows extra space between letters
		  //First Line
		  System.out.print("ZZZZZZZZZ  ");
		  System.out.print("JJJJJJJJJ  ");
		  System.out.println("LL        ");
		  //Second
		  System.out.print("ZZZZZZZZZ  ");
		  System.out.print("JJJJJJJJJ  ");
		  System.out.println("LL        ");
		  //Third
		  System.out.print("       ZZ  ");
		  System.out.print("     JJ    ");
		  System.out.println("LL        ");
		  //Fourth
		  System.out.print("     ZZ    ");
		  System.out.print("     JJ    ");
		  System.out.println("LL        ");
		  //Fifth
		  System.out.print("   ZZ      ");
		  System.out.print("     JJ    ");
		  System.out.println("LL        ");
		  //Sixth
		  System.out.print(" ZZ        ");
		  System.out.print("     JJ    ");
		  System.out.println("LL       ");
		  //Seventh
		  System.out.print("ZZ         ");
		  System.out.print("     JJ    ");
		  System.out.println("LL        ");
		  //Eighth
		  System.out.print("ZZZZZZZZZ  ");
		  System.out.print("JJJJJJJ    ");
		  System.out.println("LLLLLLLL  ");
		  //Ninth!
		  System.out.print("ZZZZZZZZZ  ");
		  System.out.print("JJJJJJJ    ");
		  System.out.println("LLLLLLLL  ");
		  System.out.println(); 
	}
	
	public static void drawZ() {
		System.out.println("ZZZZZZZZZ");
		System.out.println("ZZZZZZZZZ");
		System.out.println("       ZZ");
		System.out.println("     ZZ  ");
		System.out.println("   ZZ    ");
		System.out.println(" ZZ      ");
		System.out.println("ZZ       ");
		System.out.println("ZZZZZZZZZ");
		System.out.println("ZZZZZZZZZ");
		System.out.println();
	}
	
	public static void drawJ() {
		System.out.println("JJJJJJJJJ");
		System.out.println("JJJJJJJJJ");
		System.out.println("     JJ  ");
		System.out.println("     JJ  ");
		System.out.println("     JJ  ");
		System.out.println("     JJ  ");
		System.out.println("JJ   JJ  ");
		System.out.println("JJJJJJJ  ");
		System.out.println("JJJJJJJ  ");
		System.out.println();
	}
	
	public static void drawL() {
		System.out.println("LL       ");
		System.out.println("LL       ");
		System.out.println("LL       ");
		System.out.println("LL       ");
		System.out.println("LL       ");
		System.out.println("LL       ");
		System.out.println("LL       ");
		System.out.println("LLLLLLLLL");
		System.out.println("LLLLLLLLL");
		System.out.println();
	}
	
}
