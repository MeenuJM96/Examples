package upcasting;

public class UpcastExB extends UpcastExA{
	public void print() {
		System.out.println("Single Inheritance");
		System.out.println("Parent class");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UpcastExA obj=new UpcastExB(); //object is created for parent class
		obj.print();
		//only parent class features will be transfered so invoke only parent class method
	}

}
