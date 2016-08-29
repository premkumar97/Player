package player;

import java.util.Scanner;

public class Binary {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int a1=scan.nextInt(),a2=scan.nextInt();
		System.out.println(Integer.toBinaryString(a1)+" "+Integer.toBinaryString(a2));
	}

}
