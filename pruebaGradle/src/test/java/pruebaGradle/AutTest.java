package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class AutTest {
	PersonalAdm pa;
	Aut instance;
	
	public AutTest() {
		pa = new PersonalAdm("paID","qwerty","carlos");
		instance = new Aut(pa);
		
	}

	@Test
	public void test() {
		
	}

}
