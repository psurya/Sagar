package assignment;
import assignment.ZDigit;
class ZNumber{
	ZDigit a,b,c,d;

	ZNumber(ZDigit a,ZDigit b,ZDigit c,ZDigit d)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
	}

	public String toString(){
		return a+""+b+""+c+""+d;
	}
	public static void main(String args[])
		{
	ZDigit A = new ZDigit('A');
ZDigit B = new ZDigit('B');
ZDigit C = new ZDigit('C');
ZDigit D= new ZDigit('C');
		ZNumber zn=new ZNumber(A,B,C,D);


		System.out.println(zn);//compiler writes here s1.toString()

	}
}
