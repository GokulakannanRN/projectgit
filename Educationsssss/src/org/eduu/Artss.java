package org.eduu;

public class Artss extends Education {
private void bsc() {
System.out.println("Science");
}
private void bed() {
System.out.println("Education");
}
public void ug() {
System.out.println("Under graduate");
}
public void pg() {
System.out.println("Post graduate");
}
public static void main(String[] args) {
	Artss a = new Artss();
	a.bed();
	a.bsc();
	a.pg();
	a.ug();
	
	Education e = new Artss();
	e.ug();
	e.pg();
}
}
