package pkg;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("...........Arithmetic Operators.................");
         
		int a=20,b=10;
		System.out.println("a+b=" + (a+b));
		System.out.println("a-b=" + (a-b));
		System.out.println("a*b=" + (a*b));
		System.out.println("a/b=" + (a/b)); //quotient
		System.out.println("a%b=" + (a%b));  //remainder
		
		System.out.println(".............Assignment Operator.........");
		
		int c;
		System.out.println(c = a);
		System.out.println(a += b);  //a=a+b; 20+10
		System.out.println(a-=b);  // a= a-b;  30-10=20;
		
		System.out.println("............Relational Operators.........");
		
		int v1=40 , v2=20;
		System.out.println(v1 > v2);
		System.out.println(v1 == v2);
		
		
		System.out.println("......Logical Operators...........");
		// A	B	A&&B	A||B	!A	!B
		//0		0	0		0		1	1
		//0		1	0		1		0	1
		//1		0	0		1		1	0
		//1		1	1		1		0	0
		
		
		String username="abc";
		String password="abc123";
		System.out.println(username=="abc"&&password=="abc123");
		System.out.println(username=="ac"||password=="abc123");
		System.out.println(!(username=="abc"));
		
		System.out.println("......Unary Operators...........");
		//++ increment by 1
		//--decrement by 1
		
		int v3=10;
		System.out.println(v3++);//10
		System.out.println(v3);//11
		System.out.println(++v3);//12
		
		
		System.out.println("......ternary Operators...........");
		//variable=condition?exp1:exp2;
		String s= v1>v2?"v1 is greater":"v2 is greater";
		System.out.println(s);
		
		System.out.println("......swaping of two variable...........");
		
	
		
	}

}
