package sysblo.reflection;

import java.lang.reflect.Constructor;

public class ReflectionClass {

	public static void main(String[] args) throws Exception {

		/*** 1 ***/
		Class<?> c = Class.forName("sysblo.reflection.Employee");

		/*** インスタンスからクラスの型を取得する場合 ***/
		//Employee emp = new Employee("Ichiro", "Satou");
		//Class<? extends Employee> sample = emp.getClass();

		/*** 2 ***/
		Constructor<?> con = c.getConstructor(String.class, String.class);

		/*** 3 ***/
		Employee e = (Employee) con.newInstance("Ichiro", "Satou");

		System.out.println(e.getFullName());

	}

}
