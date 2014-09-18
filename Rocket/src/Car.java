/**
 * @author larsozac000
 * @since 2014-11-10
 */

public class Car 
{
	
	public String make;
	public String model;
	public Integer year;
	public boolean isstarted = false;
	
	public static void main(String args[]) 
	{
		carType();
		carColor();
		}
		
		public boolean start() 
		{
			isstarted = true;
			return isstarted;
			}
	
		public boolean stop() 
		{
			isstarted = false;
			return isstarted;
			}
		
		public static void carType() 
		{
			System.out.print("Tesla!");
			}
			
		public static void carColor() 
		{
			System.out.print("Cherry Red");
			}
		
}	
