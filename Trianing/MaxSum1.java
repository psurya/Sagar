
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;
import java.io.File;

public class MaxSum1 {
public static void main(String[] args) throws IOException
{
Scanner scanner = new Scanner(new File("p067_triangle.txt"));

List<int[]> list = new ArrayList<int[]>();
int i=0;
int j=0;//columns
int[] array;//declaration of an two dimensional arrays

while(scanner.hasNextInt())
{
for(i=0;i<100;i++)
{
array = new int[i+1];
for(j=0; j<= i ; j++)
{
array[j] = scanner.nextInt();
}
list.add(array);
}
}

for(i=99 ; i>=0 ; i--)
{
for(j=0 ; j < i ; j++)
{
if(list.get(i)[j] < list.get(i)[j+1])
{
list.get(i-1)[j] = list.get(i-1)[j] + list.get(i)[j+1];
}
else
list.get(i-1)[j] = list.get(i-1)[j] + list.get(i)[j];
}
}
scanner.close();
System.out.println(list.get(0)[0]);
}
}
