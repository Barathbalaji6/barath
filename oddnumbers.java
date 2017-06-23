package com.guvi.codekata;

import java.util.ArrayList;
import java.util.Scanner
public class OddNumbers {
	
	public void isOdd(int m,int n)
	{
		
		for(int i=m;i<=n;i++)
		{
			if(i%2!=0)
			{
				System.out.println(""+i);
			}
		}
		
	
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		OddNumbers pro=new OddNumbers();
		
		pro.isOdd(m,n);
		
	}


}
