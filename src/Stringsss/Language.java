package Stringsss;

public class Language {

	public static void main(String[] args) {
	
		String s= "java language is platform independant";
		//System.out.println(s.contains("language"));
		Language ob=new Language();
		ob.count(s);
	//s=s.trim();	
	//String[]words=s.split("\\s+");
	//int count=words.length;
	//System.out.println(count);
	
	}
		public void count(String s)
		{
		int a=1;
		for(int i=0; i<s.length()-1;i++)
		{
			
			char c=s.charAt(i);
			char d=s.charAt(i+1);
			if(c==' ' && d!= ' '&& i!=0)
			{
				a++;
			}
		}
		System.out.println(a);
	}
	
}
