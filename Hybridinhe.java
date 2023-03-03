package com.demoss;
import java.io.IOException;
interface Q {
	public void show1();
}
interface W {
	public void show2();
}
interface E extends Q,W{
	public void show3();
}
class R{
	public void show4() {
		System.out.println("hello class D");
	}
}
public class Hybridinhe extends R implements E{
	public void show1() {
		System.out.println("Hello interface A");
	}
	public void show2() {
		System.out.println("Hello interface B");
	}
	public void show3() {
		System.out.println("Hello interface C");
	}
	public static void main(String[] args) throws IOException{
		Hybridinhe n = new Hybridinhe();
		n.show1();
		n.show2();
		n.show3();
		n.show4();

	}

}
