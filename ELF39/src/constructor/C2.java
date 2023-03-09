package constructor;
public class C2 extends C1 {
	C2(int a){
		System.out.println(4);
	}
	{
		System.out.println(840);
	}
	static {
		System.out.println(12);
	}
	static {
		System.out.println(14);
	}
	C2(){
		this(1,1);
		System.out.println(5);
	}
	C2(int a,int b){
		super(1);
		System.out.println(6);
	}
	public static void main(String[] args) {
		System.out.println("main method");
		C2 c1=new C2();
	}
}