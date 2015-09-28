package sysblo.reflection;

import java.lang.reflect.Field;

public class ReflectionField {

	public static void main(String[] args) throws Exception{

		/*** 1 ***/
		Field[] fields = Employee.class.getDeclaredFields();

		/*** 2 ***/
		//public = 1
		//記述なし = 0
		//protected = 4
		//private = 2
		for(Field f : fields){
			System.out.println(f.getModifiers() + " : " + f.getName());
		}

		/*** 3 ***/
		Employee e = new Employee("Ichiro", "Satou");

		System.out.println(e.getFullName());

		System.out.println("\n ---値変更後 ---\n");

		Class<? extends Employee> c = e.getClass();

		Field f1 = c.getDeclaredField("lastName");
		Field f2 = c.getDeclaredField("firstName");

		f1.setAccessible(true);
		f2.setAccessible(true);

		f1.set(e, "Tanaka");
		f2.set(e, "Jirou");

		System.out.println(e.getFullName());

	}

}
