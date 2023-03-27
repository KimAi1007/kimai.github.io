package Model;

public class accounts {
	private int id;
	private String uesrname;
	private String password;
	private int isAdmin;
	private int isEmployee;
	public accounts() {
		super();
		// TODO Auto-generated constructor stub
	}
	public accounts(int id, String uesrname, String password, int isAdmin, int isEmployee) {
		super();
		this.id = id;
		this.uesrname = uesrname;
		this.password = password;
		this.isAdmin = isAdmin;
		this.isEmployee = isEmployee;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUesrname() {
		return uesrname;
	}
	public void setUesrname(String uesrname) {
		this.uesrname = uesrname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(int isAdmin) {
		this.isAdmin = isAdmin;
	}
	public int getIsEmployee() {
		return isEmployee;
	}
	public void setIsEmployee(int isEmployee) {
		this.isEmployee = isEmployee;
	}
	@Override
	public String toString() {
		return "accounts [id=" + id + ", uesrname=" + uesrname + ", password=" + password + ", isAdmin=" + isAdmin
				+ ", isEmployee=" + isEmployee + "]";
	}
	
}
