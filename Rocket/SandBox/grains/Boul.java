package grains;

public class Boul {

	public static void main(String[] args)
	{
		top();
		second();
	}
	
		public static void top()
		{
			System.out.println( middle() );
		}
		
		public static void second()
		{
			System.out.println( middle() );
		}
		
		public static boolean middle()
		{
		return true;
		}
	
}
