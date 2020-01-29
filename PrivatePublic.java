package list;

public class PrivatePublic {
	private String password = "Unknown";
	private String addres = "Duinenstraat 8";

	
	public static void main(String[] args) {
		System.out.println("test");
	}
	public String getPassword() {
		return password;
	}
	
//	public void getPassword(String password) {
//		this.password = password;
//	}
	
	public void getAddres(String addres) {
		this.addres = addres;
	}
	
}