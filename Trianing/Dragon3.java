public class Dragon3
{
public static void main(String[] args)
{
String[] string=new String[10];
string[0]="R";
for(int i=1;i<10;i++)
{
string[i]=string[i-1]+'R';
 String reverse = new StringBuffer(string[i]).
      reverse().toString();
      
}
}
}
