package controlstatement;

public class Whilereverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int rem,rev=0;
			int p=4567;
			int n=4567;
			while(n>0)
			{
				rem=n%10;
				rev=rev*10+rem;
				n=n/10;
				
				System.out.println(rev);
				
	
			}
			
			if(rev==p)
			{
				System.out.println("number is palindrome");
			}
			else
			{
				System.out.println("number is not palindrome");
			}
			
			
	}
	

}
