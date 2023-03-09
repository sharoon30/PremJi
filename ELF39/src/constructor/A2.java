package constructor;

import java.util.Random;

public class A2 {
	A2(){
		System.out.println("const-1");
	}
	A2(int a){
		System.out.println("const 2");
	}
	
	{
		System.out.println("block 1");
	}
	{
		System.out.println("block 2");
	}
	public static void main(String[] args) {
		A2 a1 = new A2();
		Random r1 = new Random(100);
		System.out.println(r1.nextInt());
	}

}
