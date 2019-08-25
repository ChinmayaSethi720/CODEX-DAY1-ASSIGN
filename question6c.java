public class question6c 
{

	public static void main(String[] args) 
	{
		int a=1600;
		
		if ((a%4==0) && (a%100!=0))
		{
			System.out.println(a+ " is a leap year");
		}
		else if (a%400==0) 
		{
			System.out.println(a+ " is a leap year");
		}	
		else
		{
			System.out.println(a+ " is not a leap year");
		}	
	}

}

