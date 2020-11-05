package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class VerMisPacientesTest {
	
	public VerMisPacientesTest() {
		
	}

	@Test
	public void testConstructorVerMisPacientes() {
		PersonalAdm pa=new PersonalAdm("paID","qwerty","carlos");
		Doctor d1 = new Doctor("doc1","user1","1234",pa);
        Doctor d2 = new Doctor ("doc2", "user2","4321",pa);
        pa.registrarObserver(d1);
        pa.registrarObserver(d2);
        pa.SelDoctor("user1");
        Paciente p = new Paciente("Aldo", "Algorry", "Estrada 145", 50, 15478589, false);
        Turnos t1 = new Turnos(p, d1, "martes 21", "18:00");
        pa.crearTurno(t1);
        VerMisPacientes vmp = new VerMisPacientes(pa);
        
	}

}
