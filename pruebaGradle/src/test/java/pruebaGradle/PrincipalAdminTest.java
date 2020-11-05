package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrincipalAdminTest {

	@Test
	public void test() {
		PersonalAdm pa = new PersonalAdm("paID","qwerty","carlos");
		PrincipalAdmin instance = new PrincipalAdmin(pa);
	}

}
