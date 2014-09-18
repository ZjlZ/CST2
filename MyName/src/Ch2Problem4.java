/**
 * 
 * @author larsozac000
 *@since 2014/09/17
 *This imputs l and W of house
 *and outputs area of house
 */

import java.util.Scanner;

public class Ch2Problem4 {

	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		//in
		
		System.out.print(" Farienheight? ");
		int Far = console.nextInt();
		
		System.out.print("Celcious??");
		int Cel = console.nextInt();
		
		System.out.print("Magnitude??");
		int MAG = console.nextInt();
		
		//process
		
		int CeltoFar = Cel * MAG;
		int FartoCel = Far * MAG;
		
		//output
		System.out.print("Cel to far = ");
		System.out.println(CeltoFar);
		
		System.out.print("Far to Cel = ");
		System.out.println(FartoCel);
		
		System.out.print("Maggie");
		System.out.println(MAG);
		
		console.close();
	}
	
}
