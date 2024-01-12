package org.bike;

public class Hero extends Bajaj{
public void honda() {
System.out.println("good for milage");
}
public void hondaunicorn() {
System.out.println("Speed");
}
public static void main(String[] args) {
	Hero h = new Hero();
	h.honda();
	h.hondaunicorn();
	h.platina();
	h.pulsar();
}
}
