package org.system;

public class Desktop extends Computer {
	
	void desktopSize() {
		System.out.println("The size is 29inces");
	}

	public static void main(String[] args) {
		
		Desktop feat = new Desktop();
		
		feat.computerModel("ASUS ROG G49126X");
		feat.desktopSize();
	}

}
