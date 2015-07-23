import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.lang.*;

public class E 
{
	public static int[] ar={32,33,39,40,41,44,46,48,49,50,51,52,53,54,55,56,57,59,65,66,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};
	public  static int compatible (int a, int b, int c, int i, int[] arr){
/*int[] ar={32,33,39,40,41,44,46,48,49,50,51,52,53,54,55,56,57,59,65,66,69,70,71,72,74,76,78,83,84,87,97,98,99,100,101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118,119,120,121,122};*/		int x = arr[i]^a;
		int y = arr[i+1]^b;
		int z = arr[i+2]^c;
		if((Arrays.binarySearch(ar,x)>=0) && (Arrays.binarySearch(ar,y)>=0)&& (Arrays.binarySearch(ar,z)>=0))
			return 3;
		return 0;
	}
	public static int findsum(int a, int b, int c,int[] arr){
		int sum =0;
		for(int i=0; i+2<arr.length; i += 3)
			{
				sum = sum + (arr[i]^a) + (arr[i+1]^b) + (arr[i+2]^c);
			}
		sum=sum+(arr[arr.length-1]^a);
		return sum;
	}	
	public static void main(String[] args) throws IOException{			
			Scanner in = new Scanner(new File("p059_cipher.txt"));
			String n = in.nextLine();
			int count=1;
			for(int i=0; i<n.length(); i++)
			{	
				if(n.charAt(i)==',')	
					count++;
				
			}	
			int[] arr = new int[count];				
			for(int k=0, j=0; k<n.length(); j++, k++){
				int l = (int) n.charAt(k);
				arr[j] = l-48;
				k++;			
				if(n.charAt(k) != ','){
					int x= (int) n.charAt(k);
					arr[j] = arr[j]*10 + (x-48);
					k++;
				}
			}
			int sum=0;
	System.out.println(arr.length);
	 int [] ad={116, 111, 97, 119, 98, 99, 100, 115, 102, 109, 114, 104, 105, 121, 101, 103, 108, 110, 112, 117, 106, 107};
	 int [] br={ 111, 101, 105, 97, 117, 110, 114, 116};
	 int [] cr={101, 115, 116, 100, 110, 114, 121, 102, 108, 111, 103, 104, 97, 107, 109, 112, 117, 119};
	OUTERMOST:	for(int a: ad){			
				for(int b:br){
					for(int c:cr){
							int com=0;
							for(int i=0; i+2<arr.length; i+=3){
								com = com + compatible(a,b,c,i,arr);
								
							}
							int z = arr[arr.length-1]^a;
							if (Arrays.binarySearch(ar,z)>=0)
							{
								com=com+1;
							}

							if(com==arr.length){
								sum = findsum(a,b,c,arr);
								//System.out.println(" "+a+" "+b+" "+c+"");
								break OUTERMOST;
							}
						}
					}
				}		
			System.out.println(sum);
			
		}	
	
}
	
