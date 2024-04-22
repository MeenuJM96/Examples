package superkeyword;

public class InstMethEx2 extends InstMethEx1{
	public void print() {
		super.print();
		System.out.println("Child class Method");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstMethEx2 obj=new InstMethEx2();
		obj.print();
	}

}