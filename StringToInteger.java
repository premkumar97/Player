package player;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		String num=in.nextLine();
	    int n = Integer.parseInt(num);
	    System.out.println(n);
	}
}
