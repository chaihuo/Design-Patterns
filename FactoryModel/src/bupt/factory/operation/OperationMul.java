package bupt.factory.operation;

public class OperationMul extends Operation{

	@Override
	public double getResult() {
		double result = this.getNumber1()*this.getNumber2();
		return result;
	}

}
