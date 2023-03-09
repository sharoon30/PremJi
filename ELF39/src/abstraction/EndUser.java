package abstraction;

public class EndUser {
public static void main(String[] args) {
	Student s1=new Student("prem", 1, "10th", 'a');
	Student s2=new Student("Sharath", 2,"8th", 'B');
	Student s3=new Student("swathi", 3, "6th", 'c');
	display(s1);
	display(s2);
	display(s3);
}

static void display(Student s) {
	System.out.println(s.getName()+" "+s.getRoll()+" "+s.getStd()+" "+s.getC());
}
}
