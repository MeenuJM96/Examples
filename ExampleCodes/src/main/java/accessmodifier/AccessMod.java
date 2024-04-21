package accessmodifier;

public class AccessMod {
		public void meth1() {
			System.out.println("This is a public method");
		}
		protected void meth2() {
			System.out.println("This is a protected method");
		}
		private void meth3() {
			System.out.println("This is a private method");
		}
		void meth4() {
			System.out.println("This is a default method");
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessMod obj=new AccessMod();
		obj.meth1();
		obj.meth2();
		obj.meth3();
		obj.meth4();
	}

}
