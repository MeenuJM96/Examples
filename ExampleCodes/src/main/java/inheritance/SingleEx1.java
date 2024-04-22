package inheritance;

public class SingleEx1 extends SingleEx{
	public void display() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleEx1 obj=new SingleEx1();
		obj.print();
		obj.display();
	}

}
