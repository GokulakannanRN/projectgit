package org.bike;

public class Yamaha extends Hero{
public void r15() {
System.out.println("Excellent");
}
public void mt() {
System.out.println("only for wheeling");
}
public static void main(String[] args) {
	Yamaha y = new Yamaha();
	y.mt();
	y.r15();
	y.honda();
	y.hondaunicorn();
	y.platina();
	y.pulsar();
}
}
