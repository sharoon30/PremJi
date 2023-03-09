package methodOverrinding;

public class A3 extends A2{
void mobile() {
	System.out.println("method - 2");
}
void iphone() {
	System.out.println("14 pro");
}
public static void main(String[] args) {
	A2 a1=new A3();//upcasting
	a1.iphone();
	A3 a2=(A3)a1;//downcasting
	a2.iphone();
	A2 a3=new A2();
	a3.iphone();
}
}
