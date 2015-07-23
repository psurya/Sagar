import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Poker1 {
public static void main(String[] args) throws FileNotFoundException{

String filename = "p054_poker.txt";
Scanner scanner = new Scanner(new File(filename));
String[] array ;

List<String[]> handlist = new ArrayList<String[]>();

while(scanner.hasNextLine())
{	
array = new String[10];

for(int i=0;i<10;i++)
{
array[i] = scanner.next();
}
handlist.add(array);

}

int i = handlist.size();
for(int j=0;j<i;j++)
{
System.out.println(handlist.get(j));
}
}
}
