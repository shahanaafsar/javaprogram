package oops;

class member
{
	String name;
	int age;
	long phonenumber;
	String address;
	int salary;
	String specialization;
	
	
	public void printdetails()

	{
		System.out.println("name="+name);
		
		System.out.println("age="+age);
		System.out.println("phonenumber="+phonenumber);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
		System.out.println(	 "specialization="+specialization);
		}
}

class employeei extends member
{
	String specialization;
	String department;
	}
class manager extends member
{
	String specialization;
	String department;
}
class hr extends member
{
	}

public class Inheritancepgmclassex1 {

	public static void main(String[] args) {
		

 employeei ob1=new employeei();
 ob1.name="shahana";
 ob1.age=22;
 ob1.address="asdfghjj";
 ob1.phonenumber=12345678l;
 ob1.printdetails();
	System.out.println(ob1.specialization="tester");
	System.out.println(ob1.department="testing");
 manager ob2=new manager();
 ob2.name="madam";
 ob2.age=34;
 ob2.address="bnmjjhhg";
 ob2.phonenumber=1237655l;
 ob2.department="test";
 ob2.specialization="testing";
 ob2.printdetails();
 hr ob3=new hr();
 ob3.name="revathy";
 ob3.age=26;
 ob3.address="yutr tyugj bhjfg";
 ob3.phonenumber=87654321l;
 ob3.salary=1000;
 ob3.printdetails();
	}

}
