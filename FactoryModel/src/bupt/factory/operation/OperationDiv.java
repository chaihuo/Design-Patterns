package bupt.factory.operation;

public class OperationDiv extends Operation{

	@Override
	public double getResult() {
		if(this.getNumber2()!=0) {
			double result = this.getNumber1()/this.getNumber2();
			return result;
		} else {
			return (Double) null;
		}
	}

}
