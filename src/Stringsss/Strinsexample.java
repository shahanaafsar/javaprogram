package Stringsss;

public class Strinsexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "hello";
		String s1="welcome";
		String s2="Hello";
		String s3= "hello welcome to luminar";
		System.out.println(s.concat(s1));
		
		System.out.println(s.equals(s1));
		
		System.out.println(s.equals(s2));
		
		System.out.println(s.equalsIgnoreCase(s2));
		
		System.out.println(s3.startsWith("hello"));
		
		System.out.println(s3.endsWith("luminar"));
		
		System.out.println(s3);
		
		System.out.println(s3.trim());
		
		System.out.println(s3.contains("welcome"));
		
		System.out.println(s2.length());
		
		System.out.println(s3.length());
		
		System.out.println(s2.charAt(0));
		
		System.out.println(s2.toUpperCase());
		
		System.out.println(s2.toLowerCase());
		
		System.out.println(s1.substring(1,3));
		
		String[]st=s3.split("");
		
		for( String str:st)
		{
			System.out.println(str);
		}
		
		System.out.println(s3.replace("hello", "hi"));
		
		//string palindrome
		
	}

}
