package exception;

public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
			catch(ArithmeticException x) {	
				System.out.println("Exception occured "+x);
			}
			finally {
				System.out.println("Exception completed");
			}
	}

}
