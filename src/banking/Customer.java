package banking;

public class Customer {
	private int c_id;
	private String c_name;
	private String c_email;
	public Customer(int c_id, String c_name, String c_email) {
		super();
		this.setC_id(c_id);
		this.setC_name(c_name);
		this.setC_email(c_email);
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_email() {
		return c_email;
	}
	public void setC_email(String c_email) {
		this.c_email = c_email;
	}
	
	
	

}
