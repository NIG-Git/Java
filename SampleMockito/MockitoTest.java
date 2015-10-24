package sysblo.mock;

import static org.mockito.Matchers.*;
import static org.mockito.Mockito.*;

public class MockitoTest {

	public static void main(String[] args) {

		/*** ケース1 引数がデータ型のメソッド呼び出し ***/
		SampleA a1 = mock(SampleA.class);
		when(a1.argIsData(anyString())).thenReturn("mock1!!");
		String ret1 = a1.argIsData("str");
		System.out.println(ret1);

		/*** ケース2 引数が参照型のメソッド呼び出し ***/
		SampleA a2 = mock(SampleA.class);
		SampleB b = new SampleB(1);
		when(a2.argIsClass((SampleB)any())).thenReturn("mock2!!");
		String ret2 = a2.argIsClass(b);
		System.out.println(ret2);

		/*** ケース3 例外呼び出し ***/
		SampleA a3 = mock(SampleA.class);
		doThrow(new NullPointerException("ぬるぽ")).when(a3).argIsData(anyString());
		a3.argIsData("str");

	}

}
