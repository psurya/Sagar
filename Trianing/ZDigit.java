package assigh;
public class ZDigit extends IllegalArgumentException
{
		char c;
		public  ZDigit(char c) 
		{
			if(Character.isUpperCase(c) || c=='0' )
			{
				this.c=c;
			}
			else  throw new IllegalArgumentException("enter between A-Z and 0 ");
		}
		
}
