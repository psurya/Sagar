import java.util.*;
import java.lang.*;
import java.io.File;
import java.io.IOException;
public class Sudoku
{
static int[][] number=new int[9][9];
public  static void main(String[] args) throws IOException
{		
	String Gridname;
		int[][] answer;
		int sum=0;
		Scanner scanner=new Scanner(new File("p096_sudoku.txt"));
		while(scanner.hasNext())
		{
			Gridname=scanner.nextLine();
			for(int k=0;k<9;k++)
			{
			for(int j=0;j<9;j++)
			{
			number[k][j]=(int)scanner.findInLine(".").charAt(0)-'0';
			}
			scanner.nextLine();
			}
			SUdoku b=new SUdoku();// goes to other class
			answer=b.check(); // function for solving
		        sum=sum+number[0][0]*100+number[0][1]*10+number[0][2];
	}
	System.out.println(sum);
}
}
 class SUdoku extends Sudoku
{
	public int[][] check()
	{
		if(!Solve(number))
		{ 
		System.out.println("Solution Doesn't Exist");
		}
		return number;
	} 
	 boolean Solve(int[][] number)
	{
		int row=0,column=0,j=0;
		mainloop:
		for(row=0;row<9;row++)
		{
		for(column=0;column<9;column++)
		{
		j++;
		if(number[row][column]==0)
		{
			break mainloop;	
		}
		}
		}
		if(j==81) return true;
		for(int i=1;i<10;i++)
		{
		  if(isSafe(number,row,column,i))
		 {
			number[row][column]=i;
			if(Solve(number))
				return true;
			number[row][column]=0;	
		 }
		 }		
		return false;		
	}
	 boolean isSafe(int[][] number,int row,int column,int i)
	{
	return (!isColumn(number,row,column,i) && !isRow(number,row,column,i) && !isGrid(number,row-row%3,column-column%3,i));
	}
	boolean isColumn(int[][] number,int row,int column,int i)
	{
	 for (int col = 0; col <9; col++)
         if (number[col][column] == i)
            return true;
    	return false;
	}
	 boolean isRow(int[][] number,int row,int column,int i)
	{
		for (int col = 0; col <9; col++)
        if (number[row][col] == i)
            return true;
    	return false;
	}	
	boolean isGrid(int[][] number,int r1,int c1,int i)
	{
		for (int j = 0; j < 3; j++)
        for (int col = 0; col < 3; col++)
            if (number[j+r1][col+c1] == i)
                return true;
    return false;
	}
}
