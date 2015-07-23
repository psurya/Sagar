import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;


public class Encryption2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br  = new BufferedReader(new FileReader("p059_cipher.txt"));
		String s = br.readLine();


		char[] array = s.toCharArray();
		
		int i;
		
		for( i =0 ; i< array.length ;i++)
		{
			if (array[i] == ',')
			{
				i++;
			}
		else continue;
		}
		System.out.println(i);
		int z = i+1;
		System.out.println("Hence the number of integers is "+  z);
		
		List<Integer> list = new ArrayList<Integer>(z);
		
		
		int j;
		for(j=0; j<array.length; )
		{
			String s1 = "";
			
			while(array[j] != ',')
			{
				s1 = s1 + array[j];
				j++;
				
				if(j == (array.length))
					break;
			}
			
			j++;
			int k = Integer.parseInt(s1);
			list.add(k);
		}
		System.out.println(j);
		System.out.println(z);

		for(int p=0;p<list.size();p++)
		{
			System.out.println(list.get(p));
		
		}

	}

}
