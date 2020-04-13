package teste;

import static org.junit.Assert.*;
import org.junit.*;

public class AntesDepois {

	@Before
	public void before() {
		System.out.println("@Before");
	}
	
	@After
	public void after() {
		System.out.println("@After");
	}
	
	@Test
	public void test1() {
		System.out.println("teste1");
	}
	
	@Test
	public void test2() {
		System.out.println("teste2");
	}
	
	@Test
	public void test3() {
		System.out.println("teste3");
	}

}
