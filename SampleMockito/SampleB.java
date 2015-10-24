package sysblo.mock;

public class SampleB {

	private int num = 0;

	public SampleB(int num){
		this.num = num;
	}

	public String getName(){

		String ret;

		if(num == 1){
			ret = TestEnum.TEST1.toString();
		}else if(num == 2){
			ret = TestEnum.TEST2.toString();
		}else{
			ret = "other";
		}

		return ret;

	}

	private enum TestEnum {

		TEST1,
		TEST2;

	}

}
