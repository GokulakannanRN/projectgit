
public class Desktop implements Hardware,Software {
private void desktopmodel() {
System.out.println("lenovo");
}

@Override
public void softwareresources() {
System.out.println("Amd pro");	
}
@Override
public void hardwareResources() {
System.out.println("Keyboard");	
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopmodel();
	d.softwareresources();
	d.hardwareResources();
}
}
