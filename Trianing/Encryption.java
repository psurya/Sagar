import java.lang.*;
import java.util.*;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;
public class Encryption
{
public static int[] ap={32,33,39,40,41,44,46,48,49,50,51,52,53,54,55,56,57,59,65,66,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};	
public static void main(String[] args) throws IOException
	{
		List<Integer> ds=new ArrayList<Integer>();
		String s=new String();
		int sum=0;
		Scanner scan=new Scanner(new File("p059_cipher.txt"));
		s=scan.nextLine();
		String[] coma=s.split(",");
		s="";
		for(int i=0;i<coma.length;i++)
		{
		int number=Integer.parseInt(coma[i]);
		ds.add(number);
		}
		int[] f=new int[26];
		int j=97;
		for(int i=0;i<26;i++) f[i]=j++;
	C:for(int a: f)			
	    for(int b:f)
		for(int c:f){
				int count=0;
				for(int i=0;(i+2)<ds.size(); i+=3) count=count+encryptmessage(ds,i,a,b,c);	
				int z = ds.get(ds.size()-1)^a;
				if (Arrays.binarySearch(ap,z)>=0) count=count+1;
				if(count==ds.size())
				{
				sum=findsum(a,b,c,ds);
				System.out.println("The Key is :" + (char)a +"" +(char)b+""+(char)c);
				for(int i=0;(i+2)<ds.size(); i+=3)
				{
				s=s+(char)(ds.get(i)^a);
				s=s+(char)(ds.get(i+1)^b);
				s=s+(char)(ds.get(i+2)^c);
				}
				s=s+(char)(ds.get(ds.size()-1)^a);
				System.out.println("The message is :" + s);
				System.out.println("The sum of ASCII  Values :" +sum);
				break C;
				}
			}
					
			
	}
	public static int encryptmessage(List<Integer> ds,int i ,int a, int b,int c)
	{
	int x=ds.get(i)^a;
	int y=ds.get(i+1)^b;
	int  z=ds.get(i+2)^c;
        if( (Arrays.binarySearch(ap,x)>=0) && (Arrays.binarySearch(ap,y)>=0) && (Arrays.binarySearch(ap,z)>=0)  )
		{
			return 3 ;
		}
	return 0;
	}
	public static int findsum(int a, int b, int c,List<Integer> ds){
		int sum=0;
		for(int i=0; i+2<ds.size(); i += 3)
			{
				sum=(ds.get(i)^a)+(ds.get(i+1)^b)+(ds.get(i+2)^c)+sum;
			}
			sum=sum+ds.get(ds.size()-1)^a;
		return sum;
	}
	
}
