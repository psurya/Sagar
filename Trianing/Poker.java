import java.lang.*;
import java.util.*;
import java.io.File;
import java.io.IOException;	
class Poker
{
	static int p1=0,p2=0,t=0,i=0;
	public static void main(String[] args) throws IOException
	{
		String[] s=new String[10];
		Scanner scan=new Scanner(new File("p054_poker.txt"));
		while(scan.hasNextLine())
		{
			s=scan.nextLine().split(" "); 
			String[] s1=new String[5];
			String[] s2=new String[5];
			for(int i=0;i<5;i++)
			{
				s1[i]=s[i];
				s2[i]=s[5+i];
			}
			Player player1=new Player(s1);
			Player player2=new Player(s2);
			Result r1=new Result();
			if(r1.rank(player1,player2)) p1++;
		}
		System.out.println(" Player1 won " +p1+" times");
	}
}

