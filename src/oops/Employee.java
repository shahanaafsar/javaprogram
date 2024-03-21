package oops;

public class Employee {
	String empname;
	int empid;
	
	public Employee(String empname,int empid)
	{
		this.empname=empname;
		this.empid=empid;
	}
	
	
	public void display()
	{
		System.out.println("empname="+empname);
		System.out.println("empid="+empid);
	}
	public static void main(String[] args) {
		Employee emp1=new Employee("shahaan",101);
		emp1.display();
		
		//accessmodifier
		Accessmodifier ob1=new Accessmodifier();
		System.out.println(ob1.b);
		System.out.println(ob1.c);
		System.out.println(ob1.d);
	}

}
