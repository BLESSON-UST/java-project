package java8;

public class Newcity {
	int hid;
	String hname;
	int hrent;
	public Newcity(int hid, String hname, int hrent) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.hrent = hrent;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public int getHrent() {
		return hrent;
	}
	public void setHrent(int hrent) {
		this.hrent = hrent;
	}
	@Override
	public String toString() {
		return "Newcity [hid=" + hid + ", hname=" + hname + ", hrent=" + hrent + "]";
	}
	
	

}
