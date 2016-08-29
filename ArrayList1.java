package player;

import java.util.*;

public class ArrayList1 {
	public static void main(String args[])
	{
		int pos,i,lim,ele;
		ArrayList al = new ArrayList();
		System.out.println("Enter The Initial Value lim");
		Scanner scan =new Scanner(System.in);
		lim=scan.nextInt();
		System.out.println("Enter the Values");
		for(i=0;i<lim;i++)
			al.add(scan.nextInt());
		System.out.println("Enter The position and element To Add");
		pos=scan.nextInt();
		ele=scan.nextInt();
		
		al.add(pos, ele);	
		System.out.println(al);
	      		
	}

}
