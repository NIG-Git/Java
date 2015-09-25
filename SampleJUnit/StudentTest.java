package JUnitTest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import TestTarget.Student;

public class StudentTest{

	Student student;

	/*** 1 @Test = テストメソッド ***/
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

	/*** 2 @Ignore = テストをスキップ ***/
	@Ignore
	@Test
	public void ignoreTest(){
		System.out.println("--- @Ignore ---");
	}

	/*** 3 @Before = テストメソッド実行前に実行される ***/
	@Before
	public void beforeTest(){
		System.out.println("--- @Before ---");
		this.student = new Student("Tom", 20);
	}

	/*** 4 @After = テストメソッド実行後に実行される ***/
	@After
	public void afterTest(){
		System.out.println("--- @After ---");
		this.student = null;
	}

}
