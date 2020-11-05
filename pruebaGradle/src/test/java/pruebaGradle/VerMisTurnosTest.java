package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerMisTurnosTest {

	@Test
	public void test() {
		PersonalAdm pa=new PersonalAdm("paID","qwerty","carlos");
		Doctor d1 = new Doctor("doc1","user1","1234",pa);
		pa.registrarObserver(d1);
		pa.SelDoctor("user1");
		Paciente p1 = new Paciente("Aldo", "Algorry", "Estrada 145", 50, 15478589, false);
		Turnos t = new Turnos(p1, d1, "lunes 20", "10:35");
		pa.crearTurno(t);
		VerMisTurnos instance = new VerMisTurnos(pa);
	}

}
