package sysblo;

public class SampleLambda{

	public static void main(String[] args) {

		// 従来の記述方法
		/**
		SampleIF sampleIF = new SampleIF(){
			@Override
			public String show(String str){
				return str;
			}
		};
		*/

		// ラムダ式を使用した記述方法
		//SampleIF if1 = str -> "Hello, " + str;
		//先程までの記述方法
		SampleIF if1 = (String str) -> { return "Hello, " + str; };

		//引数の型、()を省略
		SampleIF if2 = str -> { return "Hello, " + str; };

		//処理の{}、return を省略
		SampleIF if3 = str -> "Hello, " + str;

		System.out.println(if1.method("Duke"));

	}

}

@FunctionalInterface
interface SampleIF{
	public String method(String str);
}
