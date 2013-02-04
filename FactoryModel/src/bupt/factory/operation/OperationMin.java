package bupt.factory.operation;

public class OperationMin extends Operation{

	@Override
	public double getResult() {
		double result = this.getNumber1() - this.getNumber2();
		return result;
	}

}
