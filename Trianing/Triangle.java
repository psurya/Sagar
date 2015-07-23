//package Project;
import java.util.*;
import java.io.File;
import java.io.IOException;
public class Triangle
 {
	public static void main(String[] args)  throws IOException
	{
		List<Integer[]> number=new ArrayList<Integer[]>();
		Scanner scanner=new Scanner(new File("p067_triangle.txt"));
		int sum=0;
		int i=0,j=0,position=0;
		while(scanner.hasNextInt())
		{
		    Integer[] y=new Integer[i+1];
		    number.add(y);
			for(j=0;j<i+1;j++)
			{
			(number.get(i))[j]=scanner.nextInt();
			}
			i++;
		}
		for(i=99;i>-1;i--)
		{
		for(j=0;j<i;j++)
		{
		if(number.get(i)[j]<number.get(i)[j+1])
		{
		number.get(i-1)[j]=number.get(i-1)[j]+number.get(i)[j+1];
		}
		else
		{
		number.get(i-1)[j]=number.get(i-1)[j]+number.get(i)[j];
		}
		}
		}
	System.out.println(number.get(0)[0]);
	scanner.close();	
	}

}
