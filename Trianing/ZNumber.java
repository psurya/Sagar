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
public class ZNumber 
{
	private char[] ch;
	//Assighnmnet 2(a):
	public ZNumber(ZDigit... zn)
	{
		int n=zn.length ;
		ch=new char[n];
		for(int i=0;i<n;i++)
		{
			ch[i]=zn[i].c;
		}
	}
	//Assighnment 2(b):
	public String toString()
	{
		String b=new String(ch);
		return b;
	}
	//Assighnment 3(a):
	public void toDecimal()
	{
		int n=ch.length;
		int dg=0;
		for(int i=0;i<n;i++)
		{
			dg= dg*26 + ((int)ch[i] - 'A') + 1;
		}
		String b=new String(ch);
		System.out.println("the decimal of : " + b + " is " + dg);
	}
	//Assighnment 3
	public ZNumber(char... chars)
	{
		for(int i=0;i<chars.length;i++)
		{
			if(Character.isUpperCase(chars[i]) || chars[i]=='0' )
			{
				
			}
			else  throw new IllegalArgumentException("enter between A-Z and 0 ");
		}
		ch=chars;
	}
	public ZNumber(String str)
	{
		char[]chars = str.toCharArray();
		for(int i=0;i<chars.length;i++)
		{
			if(Character.isUpperCase(chars[i]) || chars[i]=='0' )
			{
				
			}
			else  throw new IllegalArgumentException("enter between A-Z and 0 ");
		}
		ch=chars;
	}
	//Assighnment 3:
	public ZDigit[] getDigits()
	{
		int n=ch.length;
		ZDigit[] zn=new ZDigit[n];
		for(int i=0;i<n;i++)
		{
			zn[i]=new ZDigit(ch[i]);
		}
		return zn;
	}
}

