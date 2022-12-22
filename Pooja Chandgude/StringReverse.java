import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String rev=" ";
		for (int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev.toUpperCase());
		//String str = "We are learning java!";
		//String upper_str = str.toUpperCase();
		//System.out.println("String:" +str);
		//System.out.println("String in uppercase:" +upper_str);

	}

}