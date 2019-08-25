
public class question5 
{

	public static void main(String[] args) 
	{
		double x=81000.00;
		double tax;
	        
	        if(0.00<x && 14999.99>x)
	        {
	        	tax= 0.00 + ((x-0.00)*15/100);
	        		System.out.println("Tax= " +tax);
	        }
	        else if (15000.00<x && 29999.99>x) 
	        {
	        	tax= 2250 + ((x-15000.00)*18/100);
	        		System.out.println("Tax= "+tax);
	        }
	        
	        else if(30000.00<x && 49999.99>x) 
	        {
	        	tax= 5400 + ((x-30000.00)*22/100);
	        		System.out.println("Tax= "+tax);
	        }
	        
	        else if(50000.00<x && 79999.99>x) 
	        {
	        	tax= 11000 + ((x-50000.00)*27/100);
	        		System.out.println("Tax= "+tax);
	        }
	        
	        else if(80000.00<x && 150000.00>x) 
	        {
	        	tax= 21600 + ((x-80000.00)*33/100);
	        		System.out.println("Tax= "+tax);
	        }
	        else 
	        {
	        	System.out.println("-1.0");
	        }
	}
}
