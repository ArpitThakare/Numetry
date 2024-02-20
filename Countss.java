package CountDemo;

import java.util.Scanner;

public class Countss {

	public static void main(String[] args) {
		
		int alphabates=0;
		int digit=0 ;
		int symbol=0;
		
		System.out.println("Enter Alphabates,Symbols and Digits ");
		
		Scanner sc=new Scanner(System.in);
		
		String inputss=sc.nextLine();
		
		
		
		for(int i=0;i<inputss.length();i++)
		{
			 char ch = inputss.charAt(i);
			 
			 if(Character.isLetter(ch)) {
				 alphabates ++;
			 }else if(Character.isDigit(ch)) {
				 digit++;
			 }else {
				 symbol++;
			 }
		}

		System.out.println("Albhabates are : "+ alphabates);
		
		System.out.println("digit are : "+ digit);
		
		System.out.println("special character are : "+ symbol);
	}

}
