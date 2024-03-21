package Stringsss;

public class Methodpgm {

	public static void main(String[] args) {
		
	
	
		Methodpgm ob= new Methodpgm();
		ob.add();
		int s=ob.sub();
		System.out.println("sub="+s);
		System.out.println(ob.mul(6, 5));
		ob.div(80, 2);
}
		//method without return type without parameter
		public void add()
		{
			int a=10,b=20,c;
			c=a+b;
			System.out.println("addition="+c);
		}
		
		
	//2.	method with retun type without parameter
		
		public int sub()
		
		{
		int a=20,b=10,c;
		c=a-b;
		return c;
		}
		
		//3.method with return type with parameter
		
		public int mul(int a,int b)
		{
			int m=a*b;
			return m;
			
		}

		
		//4.method without return type with parameter
		
		public void div(int a,int b)
		{
			double c=a/b;
			System.out.println("div="+c);
		}
	}


