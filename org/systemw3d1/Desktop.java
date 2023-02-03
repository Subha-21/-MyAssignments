package org.systemw3d1;

public class Desktop extends Computer {

	public void desktopSize(int size) {
		
		System.out.println("Desktop size is : " + size);
		
	}
	
	
	public static void main (String[] args) {
		
		Desktop myDesk = new Desktop();
		myDesk.computerModel("Dell");
		myDesk.desktopSize(21);
		
	}
	
}
