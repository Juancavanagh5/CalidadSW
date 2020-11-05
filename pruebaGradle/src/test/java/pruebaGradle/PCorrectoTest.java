package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class PCorrectoTest {

	@Test
	public void test() {
		PersonalAdm pa=new PersonalAdm("paID","qwerty","carlos");
		PCorrecto instance = new PCorrecto(pa);
		instance.main(null);
	}

}
