package oops;
class employee2
{
	private String empname;
	private int empid;
	private int empage;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public int getEmpage() {
		return empage;
	}
	public void setEmpage(int empage) {
		this.empage = empage;
	}
	
	
	
}
public class Encapsulationemployeee {

	public static void main(String[] args) {
		employee2 ob=new employee2();
		ob.setEmpname("amal");
		ob.setEmpid(101);
		ob.setEmpage(22);
		System.out.println("name="+ob.getEmpname());
		System.out.println("age="+ob.getEmpage());
		System.out.println("id="+ob.getEmpid());
	}

}
