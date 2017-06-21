import java.util.Scanner;
public class IsAlphabet
{
 public static void main(String[] args)
 {
  String str;
  char val;
  System.out.println("Enter the Character :");
  Scanner s = new Scanner(System.in);
  str = s.next();
  if(str.length()==1)
  {
   val = str.charAt(0);
   if(Character.isLetter(val))
   {
    System.out.println(val + " is a character");
   }
   else
   {
    System.out.println(val + " is not a character");
   }
  }
  else
  {
   System.out.println("Please enter a individul character");
  }
 }
}
