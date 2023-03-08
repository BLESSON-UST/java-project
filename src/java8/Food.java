package java8;

public class Food {
	private int fid;
	private String food;
	private int prize;
	public Food(int fid, String food, int prize) {
		super();
		this.fid = fid;
		this.food = food;
		this.prize = prize;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public int getPrize() {
		return prize;
	}
	public void setPrize(int prize) {
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Food [fid=" + fid + ", food=" + food + ", prize=" + prize + "]";
	}
	
	

}
