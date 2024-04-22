package inheritance;

public class MultilevelExC extends MultilevelExB{
	public void disp() {
		System.out.println("Child classC");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultilevelExC obj=new  MultilevelExC();
		 obj.add();
		 obj.sub();
		 obj.mul();
		 obj.div();
		 obj.disp();
	}

}
