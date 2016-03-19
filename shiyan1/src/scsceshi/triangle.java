package scsceshi;

public class triangle {
	private static int result = -1;
	public void triangle(int a,int b,int c)
	{
		if(a<=0 || b<=0 || c<=0)
		{
			result = -1;
		}
		else
		{
			if(((a+b)>c) && ((a+c)>b && (b+c)>a))
			{
				if((a == b) &&(a == c))
			    {
				  result = 3;
			    }
				if((a==b && a!=c)||(a==c && a!=b)||(b==c && a!=b))
				{
					result = 2;
					
				}
				if(a!=b && a!=c && b!=c)
				{
					result = 1;
				}
			}
			
			else
			{
				result = -1;
			}
		}
		
	}
	
	
	public int getResult(){
		return result;
	}
	
		public void clear(){
		result = -1;
	}

}
