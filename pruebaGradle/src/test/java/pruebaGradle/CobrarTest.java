package pruebaGradle;

import static org.junit.Assert.*;

import org.junit.Test;

public class CobrarTest {
	Cobrar c;
	PersonalAdm pa;
	Turnos t1, t2, t3;
	Paciente p1, p2;
	Doctor d1, d2;
	
	public CobrarTest() {
		pa = new PersonalAdm("myID", "myPass", "Carlos");
		c = new Cobrar(pa);
		d1 = new Doctor("doc1","user1","1234",pa);
		d2 = new Doctor ("doc2", "user2","4321",pa);
	}

	@Test
	public void testConstructorCobrar() {
		PersonalAdm instance = pa;
		instance.crearPaciente("a", "b", "c 123", 23, 12145741);
		instance.crearPaciente("aa", "bb", "cc 123", 23, 45145742);
		instance.crearPaciente("aaa", "bbb", "ccc 123", 23, 78145743);
		instance.getPaciente(12145741).setDeuda(true);
		t1 = new Turnos(instance.getPaciente(12145741), d1, "lunes 20", "10:35");
		t2 = new Turnos(instance.getPaciente(45145742), d1, "martes 21", "10:35");
		t3 = new Turnos(instance.getPaciente(78145743), d2, "miercoles 22", "10:35");
		Cobrar instance2 = new Cobrar(instance);
		
	}

}
