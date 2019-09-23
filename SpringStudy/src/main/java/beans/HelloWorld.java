package beans;

public class HelloWorld {

	private int id;
	private String name;
	private String email;

	public HelloWorld() {
		System.out.println("Testing Constructor....");
	}
	
	/*public HelloWorld(String name, int id) {
		this.name = name;
		this.id = id;
	}*/

	public HelloWorld(int id, String name, String email) {
		this.name = name;
		this.id = id;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void display() {
		System.out.println("Hello " + name + " your id is: " + id + " and your email id is: " + email);
	}
}