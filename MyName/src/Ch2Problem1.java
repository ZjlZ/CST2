/**
 * 
 * @author larsozac000
 *@since 2014/09/17
 *This imputs l and W of house
 *and outputs area of house
 */

import java.util.Scanner;

public class Ch2Problem1 
{
	
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		
		//input
		
		System.out.print("Width: ");
		int Width = console.nextInt();
		
		System.out.print("Length: ");
		int Length = console.nextInt();
		
		//process
		
		int Area =  Width * Length;
		
		//Output`	
		
		System.out.print("Area House = ");
		System.out.println( Area );
		
		console.close();
		
	}
}
