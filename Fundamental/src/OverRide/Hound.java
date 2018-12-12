package OverRide;

import java.awt.event.MouseWheelEvent;

class Dogs{
	public void bark() {
		System.out.println("woof");
	}
}


class Hounds extends Dogs{
	public void sniff() {
		System.out.println("sniff");
	}
	
	public void bark() {
		System.out.println("bowl");
	}
}

public class Hound{
	public static void main(String[] args) {
		Dogs dog = new Dogs();
		Hounds hounds = new Hounds();
		Dogs dogs = new Hounds();
		hounds.bark();
		dogs.bark();
		dog.bark();
	}
}