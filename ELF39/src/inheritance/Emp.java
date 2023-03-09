package inheritance;

public class Emp {
String name;
double salary;
int eid;
static int count=0;
public Emp(String name, double salary, int eid) {
	
	this.name = name;
	this.salary = salary;
	this.eid = eid;
	count++;
}
public static void main(String[] args) {
	Emp e1=new Emp("Mehek",30000,1);
	Emp e2=new Emp("Rajneesh",30000,2);
	Emp e3=new Emp("zohra",30000,3);
	Emp data[]=new Emp[count];
	data[0]=e1;
	data[1]=e2;
	data[2]=e3;
	for(Object o:data) {
		Emp e5=(Emp)o;
		System.out.println(e5.name);
		System.out.println(e5.eid);
		System.out.println(e5.salary);
		System.out.println("--------");
	}
	
}
}
