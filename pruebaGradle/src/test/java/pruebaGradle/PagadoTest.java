package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class PagadoTest {
	PersonalAdm pa;
	Pagado pag;
	
	public PagadoTest() {
		pa = new PersonalAdm("id13", "pass123", "name");
		pag = new Pagado(pa, "todo ok");
		
	}

	@Test
	public void test() {
		
	}

}
