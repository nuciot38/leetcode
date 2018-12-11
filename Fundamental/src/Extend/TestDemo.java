package Extend;

public class TestDemo {
	public static void main(String[] args) {
		String userName = "xsw";
		int idCard = 1;
		SonClass sonClass = new SonClass(userName, idCard);
		sonClass.say();
		sonClass.sleep();
	}
}
