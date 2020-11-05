package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class NuevoPacienteTest {
	
	public NuevoPacienteTest() {
		
	}

	@Test
	public void test() {
		PersonalAdm pa = new PersonalAdm("paID","qwerty","carlos");
		NuevoPaciente np = new NuevoPaciente(pa);
		
		
	}

}
