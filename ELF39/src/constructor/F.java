package constructor;

public class F extends E{
int e=50;
int f=60;
public static void main(String[] args) {
	D d1=new D();
	E e1=new E();
	F f1=new F();
	System.out.println(d1 instanceof F);
	d1=f1;
	System.out.println(d1 instanceof F);
	System.out.println(d1 instanceof E);
	
		
}
}
