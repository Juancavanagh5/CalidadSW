package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class InHistMedTest {
	
	public InHistMedTest() {
		
	}

	@Test
	public void test() {
		PersonalAdm pa = new PersonalAdm("paID","qwerty","carlos");
		InHistMed instance = new InHistMed(pa);
		instance.main(null);
	}

}
