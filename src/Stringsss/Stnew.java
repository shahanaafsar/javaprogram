package Stringsss;

public class Stnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s4="Testing Training Centre";
		 String []rev=s4.split(" ");
		 int c=rev.length;
		 for(int i=c-1; i>=0;i--)
		 {
			System.out.print(rev[i]);
		 }
	
//String []len=s4.split("\\ ");
//int c1=len.length;
//System.out.println("length="+c1);
}
}