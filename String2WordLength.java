package player;

import java.util.Scanner;

public class String2WordLength {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String Word[]=scan.nextLine().split(" "); 
		System.out.println(Word[1]+"("+Word[1].length()+")");
	}
}
