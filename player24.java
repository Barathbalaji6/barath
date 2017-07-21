package aa;

import java.util.Scanner;


public class player24 {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
  
	System.out.println("enter the value");
	String num=in.nextLine();
	
	int flag=0;
	for(int i=0;i<num.length();i++)
	{
		flag=0;
		if(num.charAt(i)=='1'||num.charAt(i)=='2'||num.charAt(i)=='3'||num.charAt(i)=='4'||num.charAt(i)=='6'||num.charAt(i)=='5'||num.charAt(i)=='7'||num.charAt(i)=='8'||num.charAt(i)=='9'||num.charAt(i)=='0'||num.charAt(i)=='.'||num.charAt(i)=='e'||num.charAt(i)=='E'){
		flag=1;
				
	}

	}
	
	if(flag==1){
		System.out.println("true");
		
	}
	else{
		System.out.println("false");
	}
}
	
}
