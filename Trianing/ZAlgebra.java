import java.util.*;
class ZDigit extends IllegalArgumentException
{
	protected char c;
	public  ZDigit(char c) 
	{
		if(Character.isUpperCase(c) || c=='0' ) this.c=c;
		else  throw new IllegalArgumentException("enter between A-Z and 0 ");
	}		
}
class ZNumber 
{
	private char[] ch;
	//Assighnmnet 2(a):
	public ZNumber(ZDigit... zn)
	{
		int n=zn.length ;
		ch=new char[n];
		for(int i=0;i<n;i++)
			ch[i]=zn[i].c;
	}
	//Assighnment 2(b):
	public String toString()
	{
		return new String(ch);
	}
	//Assighnment 3(a):
	public void toDecimal()
	{
		int dg=0;
		for(int i=0;i<ch.length;i++)
			dg= dg*26 + ((int)ch[i] - 'A') + 1;
		System.out.println("the decimal of : " + new String(ch) + " is " + dg);
	}
	//Assighnment 3
	public ZNumber(char... chars)
	{
		for(int i=0;i<chars.length;i++)
			if(!Character.isUpperCase(chars[i]) && chars[i]!='0' ) throw new IllegalArgumentException("enter between A-Z and 0 ");
		ch=chars;
	}
	public ZNumber(String str)
	{
		for(int i=0;i<str.length();i++)
			if(!Character.isUpperCase(str.charAt(i)) && str.charAt(i)!='0') throw new IllegalArgumentException("enter A-Z and 0 ");
		ch=str.toCharArray();
	}
	//Assighnment 3:
	public List<ZDigit> getDigits()
	{
		List<ZDigit> zn=new ArrayList<ZDigit>();
		for(char c:ch)
			zn.add(new ZDigit(c));
		return zn;
	}
}
public class ZAlgebra
{
	public static void main(String[] args) 
	{	
		ZDigit a =new ZDigit ('A');//Assighnment 1
		ZDigit b =new ZDigit ('B');
		ZDigit c =new ZDigit ('C');
		ZDigit d =new ZDigit ('D');
		ZNumber zn0 = new ZNumber(a,b,c); //Assighnment 2
		System.out.println(zn0);
		zn0.toDecimal(); //Assighnment 3
		ZNumber s = new ZNumber('A','B','C','D','E');	
		ZNumber zn = new ZNumber("ABCD");
		ZNumber zn1 = new ZNumber("ABCDEF");
		ZNumber zn4 = new ZNumber(new char[]{'A','B'});
		List<ZDigit> z=zn1.getDigits();
	}
}

