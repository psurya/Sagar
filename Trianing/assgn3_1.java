package assignment;
import java.util.*;
import java.lang.*;
class ZDigit extends IllegalArgumentException
{ char ch;
	 ZDigit(char ch) throws IllegalArgumentException
	{
		if(Character.isUpperCase(ch) || (ch=='0') )
			this.ch=ch;//System.out.println("ZDigit id correct");
		else 
			throw new IllegalArgumentException("Invalid input");
	}  

	/*public static void main(String args[])
	{  
		//ZDigit zd=new ZDigit('0');  
		ZDigit zd1=new ZDigit('4');  
	}  */
}  
