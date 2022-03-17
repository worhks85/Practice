package exception;



class MyException extends Exception{
	public String getMessage() {
		return "내가만든 예외 클래스";
	}
}


public class ExceptionEx02 {

	public static void main(String[] args) {
		try {
			throw new MyException();
		}catch (MyException e) {
			System.err.println(e.getMessage());
		}
		
		
		
		
	}

}
