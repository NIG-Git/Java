package sysblo;

public class SampleEnum2 {

	/*** 1 ***/
	public static void main(String[] args) {

		System.out.println("メンバ : " + Sample.KING.name);

		System.out.println("enum型 : " + Sample.QUEEN.toString());

		System.out.println("メソッドを使用 : " + Sample.JACK.getName());

	}

	/*** 2 ***/
	private enum Sample {

		KING("王"),
		QUEEN("妃"),
		JACK("兵士");

		private String name;

		private Sample(String name) {
			this.name = name;
		}

		public String getName(){
			return name;
		}

	}

}