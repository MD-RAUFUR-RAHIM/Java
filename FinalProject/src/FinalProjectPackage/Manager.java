package FinalProjectPackage;

public abstract class Manager {
	private String house_name;
	private int road_no,house_no,mobile_no;
	public String getname() {
		return house_name;
	}
	public void setname(String nhouse_name) {
		 this.house_name=nhouse_name;
	}
	public int houseNo() {
		return house_no;
	}
	public void sethouseNo(int nhouse_no) {
		this.house_no=nhouse_no;
	}
	public int roadNo() {
		return road_no;
	}
	public void setroadNo(int nroad_no) {
		this.road_no=nroad_no;
	}
	public int mobile() {
		return mobile_no;
	}
	public void setmobile(int nmobile_no) {
		this.mobile_no=nmobile_no;
	}
	public abstract void order();
	public void rating() {
		System.out.println("Please rate the service of this  online shop");
	}
	

}
