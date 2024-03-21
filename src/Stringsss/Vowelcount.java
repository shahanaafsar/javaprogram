package Stringsss;

public class Vowelcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	

	Vowelcount ob=new Vowelcount();
	
	String s="elephantio";
	ob.count(s);
	
}
	public void count(String s)
	{
		

		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				count++;
			}
			
		}
		System.out.println("count="+count);
	}
	
	
	
}
