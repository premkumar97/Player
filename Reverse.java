package player;

import java.util.*;

public class Reverse {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		String a[]=scan.nextLine().split("");
		for(int i=a.length-1;i>=0;i--)
			System.out.print(a[i]);
			
	}
