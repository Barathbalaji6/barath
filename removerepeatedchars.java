package aa;

import java.util.Scanner;
public class RemoveChar{
public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner s=new Scanner(System.in);
System.out.println("Enter the string");
String a=s.nextLine();
String ans="";
  for(int i=0;i<a.length();i++){
      if(a.charAt(i)!=' '){
          ans+=a.charAt(i)+"";
          a=a.replaceAll(a.charAt(i)+""," ");
      }
  }  
    System.out.println(ans);
    }

}
