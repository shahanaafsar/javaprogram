
public class Hiworldupdation {

	public static void main(String[] args) {
		
		String s4="Testing Training Centre";
		 String []rev=s4.split(" ");
		 
		 for(int i=s4.length()-1; i>=0;i--)
		 {
			System.out.print(rev[i]+" ");
		 }
		 	
		
		
		
 String s="Hello world";
 System.out.println(s.replace("Hello", "hi"));
 
 String s2="java is platform independent language";
 System.out.println(s2.startsWith("java"));
 
 
 String s3="malayalam";
 String reverse="";
 
 for(int i=s3.length()-1; i>=0;i--)
 {
	 reverse=reverse+s3.charAt(i);
 }
 System.out.println("reverse="+reverse);
 if(reverse.endsWith(s3))
 {
	 System.out.println("paliandrome");
 }
 else
 {
	 System.out.println("not palindrome");
 }
 
 
 
	}

}
