package employeesalary;

import java.util.Scanner;

public class Palindrome {
	

private static Scanner s;

public static void palindromenumber()
{

	String str,rev="";
	s = new Scanner(System.in);
	System.out.println("Enter the string value :");
	str= s.nextLine();
	int length =str.length();
	for(int i=length-1;i>=0;i--)
		rev=rev+str.charAt(i);
	if(str.equals(rev))
		System.out.println(str+"is a palindrome");
	else
		System.out.println(str+"is not a palindrome");
}

public static void main(String[] args) {
	// TODO Auto-generated method stub

	palindromenumber();
}

}
/*	int x,number,y=0,temp=0;
	s = new Scanner(System.in);
	System.out.println("enter the number:");
	number = s.nextInt();
	x=number;
	while(number>0)
	{
		x=number%10;
		number =number/10;
		temp=temp*10+x;
		
	}
	if(temp==y)
	{
		System.out.println("number is plaindrome");
	}
		else
		{
			System.out.println("number is not plaindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		palindromenumber();
	}


}

*/



