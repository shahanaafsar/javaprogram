package controlstatement;

public class Digitcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=2345;
			int rem,rev = 0,count=0;
			while(a>0)
			{
				rem=a%10;
				rev=rev*10+rem;
				a=a/10;
				//count=1;
				count++;
			}
			System.out.println("count="+count);
	}

}
