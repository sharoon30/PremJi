package a1_basicJavaPrograms;
public class Van extends  Vehicles {
	int b=10;
	void multi() {
		System.out.println("multi");
	}
public static void main(String[] args) {
	System.out.println(brand);
	Van v1=new Van();
	v1.multi();//
	v1.type();//using child reference calling parent method
	Vehicles v2=new Vehicles();
	v2.type();
}
}

