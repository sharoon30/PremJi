package constructor;

public class C3 {
	C3(){
		this(10);
		System.out.println(1);
	}
	C3(int a){
		this(1,1);
		System.out.println(2);
	}
	C3(int a,int b){
		
		System.out.println(3);
	}
	
	{
		System.out.println("non static block");
	}
	{
		System.out.println("non static block 2");
	}
	
	public static void main(String[] args) {
		C3 c1=new C3();
	}
	

}
