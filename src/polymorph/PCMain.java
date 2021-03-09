package polymorph;

public class PCMain {

	public static void getPc(Parent parent) {
		parent.showNum();
//		parent.test();
	
	}
	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child2 c2 = new Child2();
		Parent parent = new Parent();
		getPc(parent);
		getPc(c1);
		getPc(c2);
		
	}
}
