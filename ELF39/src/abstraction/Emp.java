package abstraction;
public class Emp {
	String name;
	int id;
	static int count=0;
	Emp(String name , int id){
		count++;
		this.name=name;
		this.id=id;
	}
	public static void main(String[] args) {
		Emp e1=new Emp("tuntun aunty",01);
		Emp e2=new Emp("kaliya",02);
		Emp e3=new Emp("raju",03);
		Emp e4=new Emp("jaggu",04);
		Emp[] e=new Emp[count];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		e[3]=e4;
		for(int i=0;i<e.length;i++) {
			System.out.println(e[i].name+" "+e[i].id);
		}
	}
}