package abstraction;

public class Student {
	private String name;
private	   int roll;
private 	String std;
private 	char c;
	public Student(String name, int roll, String std, char c) {
		super();
		this.name = name;
		this.roll = roll;
		this.std = std;
		this.c = c;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}
}
