package inheritense;

public class Policy extends Employee{
	private int pid;
	private String pname;
	private int pamount;
	public Policy(int id, int num, String name, int pid, String pname, int pamount) {
		super(id, num, name);
		this.pid = pid;
		this.pname = pname;
		this.pamount = pamount;
	}
	public int getPid() {
		return pid;
	}
	
	public String getPname() {
		return pname;
	}
	
	public int getPamount() {
		return pamount;
	}
	
	
	

}
