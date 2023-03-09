package a1_basicJavaPrograms;

public class NonStaticBlock{
	
	{
		System.out.println("Non static block - 1");
	}
	
	{
		System.out.println("Non static block - 2");
	}
	
	public static void main(String[] args) {
		System.out.println("Main-Method");
		NonStaticBlock n1 = new NonStaticBlock();//Non static block gets executed only by object creation
		System.out.println("bye");
	}
	
}
