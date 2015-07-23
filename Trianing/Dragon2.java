public class Dragon2
{
public static void main(String[] args)
{
double startTime = System.nanoTime();
Path d=new Path();
double endTime = System.nanoTime();
System.out.println("Took "+(endTime - startTime)/1000000000 + " s");
}
}
class Path
{
	public int x=0,y=0,p=2;
	public  int j=1;
	double i=1;
	public Path()
	{
		for(int k=1;k<2;k++)
		{
		j=1;
		while(j<476837)
	 	{	
		 F();
		 Form(i);
		j++;
		i++;
	  }
	
	}
	print();
}
	public void print()
	{
		System.out.println(x + "," + y+" "+((i-1))+"	"+p);
	}
	public  void  Form(double n)
	{
	while(n%2==0 )
	{
	n=n/2;
	}
	/*if(n==1)
	{
	R();
	F();
	j++;
	i++;
	R();
	}
	else */if(n%4==1)
	{
	 R();
	}
	else if(n%4==3) 
	{
		L();
	}	
	}
	public    void R()
	{
		switch(p){
			case 1:
					p=-2;
					break;
			case 2:
					p=1;
					break;
			case -2:
					p=-1;
					break;
			case -1:
					p=2;
					break;
		}
		
	}
	public    void L()
	{
		switch(p){
			case 1:
					p=2;
					break;
			case 2:
					p=-1;
					break;
			case -2:
					p=1;
					break;
			case -1:
					p=-2;
					break;
		}
	
	}public    void F()
	{
		switch(p){
			case 1:
					x++;
					break;
			case 2:
					y++;
					break;
			case -2:
					y--;
					break;
			case -1:
					x--;
					break;

		}
	}
}
