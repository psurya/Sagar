import java.util.*;
public class Amnesia
{
  public static void main(String[] args) 
  {
  		Double sum=0.0;
 		Random rand =new Random();
 		for(int k=0;k<1000500;k++)
 		{
 			L l=new L();
 			L r=new L();
 			for(int i=0;i<50;i++)
 			{
 				int j=rand.nextInt(10)+1;
 				l.addq(j);
 				r.addr(j);
				
 			}
 			sum=sum+Math.abs(l.score-r.score);
 		}
 		sum=sum/1000500 ;
 		sum = Math.round( sum * 100000000.0 ) / 100000000.0;
 		System.out.println("Answer is :" +sum);	
 	}
} 
 class L 
{
	public  int score;
	public  List<Integer> m;
	public  HashMap<Integer,Integer> c,c2;
public L()
{
	score=0;
	m=new ArrayList<Integer>();
	c=new HashMap<Integer,Integer>();
	for(Integer i=1;i<11;i++) c.put(i,0);	
}
public void addq(int i)
 {
 	c.put(i,0);
	for(Integer key :c.keySet())
 				if(key!=i) c.put(key,c.get(key)+1) ;
 	if(m.contains(i)) score++;
 	else if(m.size()==5 )
 		{
 			remov();
 			m.add(i);
 		}
 	else  
 		{
 			m.add(i);			
 		}
 	
}
public void addr(int i)
{
	if(m.contains(i)) 
		{
			score++;
			for(Integer key :c.keySet())
			{
 				if(m.contains(key)) c.put(key,c.get(key)+1) ;
				else c.put(key,0);
			}
		}
	else if(m.size()==5 )
 		{
            		remov();
 			m.add(i);
 			for(Integer key :c.keySet())
 			{
 				if(m.contains(key)) c.put(key,c.get(key)+1) ;
 				else c.put(key,0);
 			}
 		}
 	else
 	{
 		m.add(i);
 		c.put(i,1);
 		for(Integer key :c.keySet())
		{
 		  if(m.contains(key)) c.put(key,c.get(key)+1) ;
		  else c.put(key,0);
		}
 	}
}
public void remov()
{
	int max=0,i=0;
	for(int j=0;j<5;j++)
 			{
 				int key=m.get(j);
 				if(max<c.get(key) ) 
 				{
 					max=c.get(key);
 					i=j;
 				}
 			}
	m.remove(i);
}
}
