package java8;

public class Emp {
	private String ename;
	private int uid;
	public Emp(String ename, int uid) {
		super();
		this.ename = ename;
		this.uid = uid;
		
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	@Override
	public String toString() {
		return "Emp [ename=" + ename + ", uid=" + uid + "]";
	}
	
	
	

}
