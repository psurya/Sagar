public class Result extends Player
{
	public  boolean rank(Player player1,Player player2)
	{	//Royal rush
		if(player1.royalflush()) return true; 
		else if(player2.royalflush()) return false;
		//Straight flush
		if(result(player1.straightflush(),player2.straightflush())==1) return true;
		else if(result(player1.straightflush(),player2.straightflush())==-1) return false; 
		//four()
		if(result(player1.four(),player2.four())==1) return true;
		else if(result(player1.four(),player2.four())==-1) return false;
		//full
		if(result(player1.full(),player2.full())==1) return true;
		else if(result(player1.full(),player2.full())==-1) return false;
		//flush
		if(result(player1.flush(),player2.flush())==1) return true;
		else if(result(player1.flush(),player2.flush())==-1) return false;
		//straight
		if(result(player1.straight(),player2.straight())==1) return true;
		else if(result(player1.straight(),player2.straight())==-1) return false;
		//three
		if(result(player1.three(),player2.three())==1) return true;
		else if(result(player1.three(),player2.three())==-1) return false;
		//two pairs
		if(result(player1.two(),player2.two())==1) return true;
		else if(result(player1.two(),player2.two())==-1) return false;
		//onepair
		if(result(player1.one(),player2.one())==1) return true;
		else if(result(player1.one(),player2.one())==-1) return false;
		//Highcard
		if(result(player1.highcard(),player2.highcard())==1) return true;
		else if(result(player1.highcard(),player2.highcard())==-1) return false;
		return false;
	}
	private int result(int p11,int p22)
	{
		if(p11>p22) 
		{
			return 1;
		}
		else if(p11<p22) 
		{
			return -1;
		}
		return 0;
	}
}
