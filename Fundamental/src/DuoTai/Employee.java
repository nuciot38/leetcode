package DuoTai;

public class Employee {
	private String name;
	private String address;
	private int number;
	public Employee(String name, String address, int number) {
		System.out.println("Employee 构造函数");
		this.name = name;
		this.address = address;
		this.number = number;
	}
	
	public void mailCheck() {
		System.out.println("邮寄支票给:"+this.name+" "+this.address);
	}
	
	public String toString() {
		return name+" "+address+" "+number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
}
