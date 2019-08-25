
public class question4 
{

		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
		int out;
		int a=654, b=154, c=795, d=584;
		out = a>b? a:b;
		out = (c > d?(c > out? c:out) : (d > out? d: out));
		System.out.println("greatest no. "+out);

		}

}
