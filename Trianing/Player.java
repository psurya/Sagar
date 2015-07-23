import java.util.Arrays;
public class Player 
{
	protected int[] ch;
	protected char[] ch2;
	public Player(){};
	public  Player(String[] str)
	{
		ch=new int[5];
		ch2=new char[5];
		for(int i=0;i<5;i++)
		{
			if(str[i].charAt(0)=='Q') ch[i]=12;
			else if(str[i].charAt(0)=='T') ch[i]=10 ;
			else if(str[i].charAt(0)=='J') ch[i]=11;
			else if(str[i].charAt(0)=='K') ch[i]=13;
			else if(str[i].charAt(0)=='A') ch[i]=14;
			else ch[i]=(int)str[i].charAt(0)-'0';
			ch2[i]=str[i].charAt(1);
		}
	}
	protected int full() 
	{
		if((three()>0) && (two()>0)) return three();  
		return 0;
	}
	protected boolean royalflush() {return (straightflush()==14); }
	protected int straightflush()
	{
		if ((flush()>0) && (straight()>0)) return (highcard());
		return 0;
	}
	protected int flush()
	{
		if(ch2[0]==ch2[1] && ch2[2]==ch2[3] && ch2[4]==ch2[3] && ch2[1]==ch2[2]) return (highcard());
		return 0;
	}	
	protected int straight()
	{
		Arrays.sort(ch);
		for(int i=1;i<5;i++)
			if((ch[i]-ch[i-1])!=1) return 0;
		return ch[4];
	}
	protected int highcard()
	{
		Arrays.sort(ch);
		return ch[4];
	} 
	protected int pair()
	{
		int count=0;
		Arrays.sort(ch);
		for(int i=0;i<4;i++)
		{
			if(ch[i]==ch[i+1])
			{
				i++;
				count=count+1;
			}
		}
		return count;
	}
	protected int four()
	{
		Arrays.sort(ch);
		if((ch[0]==ch[1] && ch[2]==ch[3] &&  ch[1]==ch[2]) || (ch[4]==ch[3] && ch[0]==ch[1] && ch[2]==ch[3])) return ch[3] ;
		return 0;
	}
	protected int three()
	{
		Arrays.sort(ch);
		for(int i=0;i<3;i++)
			if(ch[i]==ch[i+1] && ch[i+1]==ch[i+2]) return ch[i];
		return 0;
	}
	protected int two()
	{
		if(pair()==2) return pairmax();
		return 0;
	}
	protected int one()
	{
		if(pair()==1) return pairmax();
		return 0;
	}
	protected int pairmax()
	{
		Arrays.sort(ch);
		int max=0;
		for(int i=0;i<4;i++)
		{
			if(ch[i]==ch[i+1])
				if(max<ch[i]) max=ch[i];
		}
		return max;
	}
}	
