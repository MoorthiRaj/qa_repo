package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		
		System.out.println("15 inch Desktop");

	}
	public static void main(String[] args) {
		
		Desktop myComputer = new Desktop();
		
		myComputer.computedModel();
		myComputer.desktopSize();

	}

}
