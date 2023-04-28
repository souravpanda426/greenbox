package mypackage;

import java.util.Scanner;

public class Words {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String next = s.nextLine();
		int findWords = findWords(next);
		System.out.println(findWords+"  words present in the string you have input");

	}

	private static int  findWords(String next) {

		int count = 0;
		char[] ch = next.toCharArray();
		for(int i=0;i<ch.length;i++) {


			if(i==0 && ch[i]!=' '|| ch[i]!=' ' && ch[i-1] == ' ') {
				count++;

			}
		}
		return count;

	}

}
