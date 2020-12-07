package study.calculator;

public class Division implements Operator {

	@Override
	public int calculate(int src1, int src2) {
		return src1 / src2;
	}

	@Override
	public boolean matchOperatorStatus(OperatorStatus operatorStatus) {
		return !operatorStatus.isNotDivide();
	}
}
