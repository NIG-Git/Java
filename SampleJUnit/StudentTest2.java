package JUnitTest;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import TestTarget.Student;

public class StudentTest2{

	static Student student;

	@Test
	public void getTest(){

		String name = student.getName();
		assertEquals(name, student.getName());

	}

	@Test
	public void setTest(){

		String name = student.getName();
		student.setName("Bob");
		assertEquals(name, student.getName());

	}

	/*** 1 @BeforeClass = テストメソッド実行前に1度だけ実行される 要static ***/
	@BeforeClass
	public static void beforeTest(){
		System.out.println("--- @BeforeClass ---");
		student = new Student("Tom", 20);
	}

	/*** 2 @AfterClass = テストメソッド実行前に1度だけ実行される 要static ***/
	@AfterClass
	public static void afterTest(){
		System.out.println("--- @AfterClass ---");
		student = null;
	}

}
