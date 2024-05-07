package exception;

public class CustomEx {

	public static void main(String[] args) throws AgeException {	//throws declaration
		// TODO Auto-generated method stub
		int age=17;
		if(age>18) {
			System.out.println("Eligible");
		}
		else {
			throw new AgeException("Invalid Input"); //parameterized constructor invoking
		}
	}

}
