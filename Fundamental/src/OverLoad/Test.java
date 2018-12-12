package OverLoad;

class Cat {
	public void bark() {
		System.out.println("woof");
	}
	
	public void bark(int n) {
		for(int i=0;i<n;i++) {
			System.out.println(i+"woof");
		}
	}
}
public class Test{
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.bark();
		cat.bark(2);
	}
}