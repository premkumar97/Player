package player;

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseVowelRemover
{
   public static void main(String args[])
   {
	   Scanner keyboard=new Scanner(System.in);
	   System.out.print("Please enter your name: ");
	   String reverse = new StringBuffer(keyboard.nextLine()).reverse().toString();
	   System.out.println(reverse);
	   String strNew = reverse.replaceAll("[aeiouAEIOU]", "");
	   System.out.print(strNew);
   }
}
