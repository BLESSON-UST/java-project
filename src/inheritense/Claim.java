package inheritense;

public class Claim extends Policy {
	private String claim;

	public Claim(int id, int num, String name, int pid, String pname, int pamount, String claim) {
		super(id, num, name, pid, pname, pamount);
		this.claim = claim;
	}

	public String getClaim() {
		return claim;
	}

	

}
