package pkg;

public class swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=10,b=12,temp;
     System.out.println("a="+a);
     System.out.println("b="+b);
     
     temp =a;
    System.out.println("temp="+temp);
    a=b;
    System.out.println("a="+a);
    b=temp;
    System.out.println("b="+b);
    
    
    // without temporary variable
    
    int d=20, e=30;
    System.out.println("d="+d);
    System.out.println("e="+e);
    
    d=d+e;
   // System.out.println("d="+d);
    e=d-e;
    d=d-e;
    System.out.println("e="+e);
    System.out.println("d="+d);
	}

}
