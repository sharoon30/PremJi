package constructor;
public class C1 {
	static {
		System.out.println(13);
	}
	{
		System.out.println(420);
	}
	C1(int a){
		this(1,2);
		System.out.println(1);
	}
	C1(){
		this(10);
		System.out.println(2);
	}
	C1(int a,int b){
		
		System.out.println(3);
	}
	public static void main(String[] args) {
		C1 c1=new C1();
	}
}