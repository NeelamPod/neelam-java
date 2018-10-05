package arithematic;

public class Runner {

	public static void main(String[] args) {
		NumberOperation Even = new NumberOperation();
		int num=171;
		if (Even.findEven(num)) {
			System.out.println("The Number is even:" + num );
		}else {
			System.out.println("The Number is odd:" + num );
		}
		
		
		

	}

}
