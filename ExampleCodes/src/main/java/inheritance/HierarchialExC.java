package inheritance;

public class HierarchialExC extends HierarchialExA {
	public void display() {
		System.out.println("This is second child class of A");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HierarchialExC obj=new HierarchialExC();
		obj.print();
		obj.display();
	}

}
