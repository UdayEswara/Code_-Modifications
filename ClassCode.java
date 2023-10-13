package pack;

import java.util.Scanner;

public class ClassCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Hello
		//Fbiil
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = sc.next();
		String str = "";
		for(int i=0;i<word.length();i++)
		{
			char ch = word.charAt(i);
			if(Character.isUpperCase(ch))
			{
				int n = ch;
				if(ch=='B')
					n = 90;
				else if(ch == 'A')
					n = 89;
				else
					n -= 2;
				ch = (char)n;
				str += ""+ch;
			}
			else if(Character.isLowerCase(ch))
			{
				int n = ch;
				if(ch == 'c')
					n=122;
				else if(ch=='b')
					n=121;
				else if(ch=='a')
					n=120;
				else
					n -= 3;
				ch = (char)n;
				str += ""+ch;
			}
		}
		System.out.println(str);
		
	}

}
