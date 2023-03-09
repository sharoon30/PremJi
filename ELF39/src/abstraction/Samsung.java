package abstraction;

public class Samsung implements Mobile{
	public void ram() {
		System.out.println("6GB Ram");
	}
	public void rom() {
		System.out.println("128 ROM");
	} 
	public void camMp() {
		System.out.println("108");
	}
	public static void main(String[] args) {
		Samsung s1 = new Samsung();
		s1.camMp();
	}
}
