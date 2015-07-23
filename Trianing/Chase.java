import java.util.*;
public class Chase 
{
	public static void main(String args[])
	{
		Random rand=new Random();
		int d1,d2;
		Double sum=0.0;
		long startTime = System.nanoTime();
		for(int j=0;j<1000000;j++)
		{
			int i=0;
			Dice a=new Dice(0);
			Dice b=new Dice(51);
			while(a.p!=b.p)
			{
				d1=rand.nextInt(6) +1;
				a.dice(d1);
				d2=rand.nextInt(6) +1;
				b.dice(d2);
				i++;
			}
		sum=sum+i;
		}
		sum=sum/1000000;
		System.out.println(sum);
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
	}
}
class Dice
{
	public int p;
	public Dice(int p)
	{
		this.p=p;
	}
	public void dice(int d1)
	{
		if(d1==6) p=(p+1)%100;
		if(d1==1)
	{ 
		if(p==0) p=100;
		else p--;
	}
}
}

