package sysblo.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectionMethod {

	public static void main(String[] args) throws Exception{

		//インスタンス生成
		Class<?> c = Class.forName("sysblo.reflection.Employee");
		Constructor<?> con = c.getConstructor(String.class, String.class);
		Employee e = (Employee) con.newInstance("Ichiro", "Satou");

		/*** 1 ***/
		Method m = c.getDeclaredMethod("getPrivateFullName");

		/*** 2 ***/
		m.setAccessible(true);

		/*** 3 ***/
		String retStr = (String) m.invoke(e);
		System.out.println(retStr);

	}

}
