package abstraction;

public class S1 extends Object{
	
	int rollNo;
	S1(int rollNo){
		this.rollNo=rollNo;
	}
	public boolean equals(Object o) {
		S1 s2=(S1)o;
		return this.rollNo==s2.rollNo;
	}
	public int hashCode() {
		return this.rollNo+100;
	}
	
	public static void main(String[] args) {
		String s1="123";//1 object
		String s2="123";//0 object
		System.out.println(s1==s2);
		
	
		
	}
}