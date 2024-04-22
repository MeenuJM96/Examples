package inheritance;

public class HierarchialExB extends HierarchialExA {
	public void disp() {
		System.out.println("This is first child class of A");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialExB obj=new HierarchialExB();
		obj.print();
		obj.disp();
	}

}
