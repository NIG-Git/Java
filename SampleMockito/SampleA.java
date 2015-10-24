package sysblo.mock;

public class SampleA {

	public String argIsData(String str){

		return "str";

	}

	public String argIsClass(SampleB b){

		String ret = b.getName();

		return ret;

	}

}
