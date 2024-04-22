package superkeyword;

public class InstVarEx2 extends InstVarEx1{
	String name="Anamika";
	int age=20;
public void disp() {
	System.out.println("super keyword for Instance variable");
	System.out.println(name);
	System.out.println(age);
	System.out.println(super.name);
	System.out.println(super.age);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstVarEx2 obj=new InstVarEx2();
		obj.disp();
	}

}
