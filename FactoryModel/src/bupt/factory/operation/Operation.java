package bupt.factory.operation;

public abstract class Operation {
	private double Number1 = 0;
	private double Number2 = 0;
	
	public abstract double getResult();

	/**
	 * getter&setters
	 * @return
	 */
	public double getNumber1() {
		return Number1;
	}

	public void setNumber1(double number1) {
		Number1 = number1;
	}

	public double getNumber2() {
		return Number2;
	}

	public void setNumber2(double number2) {
		Number2 = number2;
	}
	
}
