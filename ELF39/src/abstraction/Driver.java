package abstraction;

public class Driver {
	public static void main(String[] args) {
		Mobile m1 = new Samsung();
		m1.ram();
		m1.rom();
		m1.camMp();
		
		Mobile m2 = new Iphone();
		m2.ram();
		m2.rom();
		m2.camMp();
	}

}
