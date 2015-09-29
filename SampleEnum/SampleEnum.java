package sysblo;

public class SampleEnum {

	/*** 1 enumの定義 ***/
	private enum Sample {
		KING,
		QUEEN,
		JACK;
	}

	/*** 2 ***/
	public static void main(String[] args) {

		String ret = check(Sample.KING);

		System.out.println(ret);

	}

	/*** 3 ***/
	private static String check(Sample sample) {

		/*** 4 ***/
		if (sample == Sample.KING) {
			return "KING!!";
		} else if (sample == Sample.QUEEN) {
			return "QUEEN!!";
		} else if (sample == Sample.JACK) {
			return "JACK";
		}

		return null;

	}

}