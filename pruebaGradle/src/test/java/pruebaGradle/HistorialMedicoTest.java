package pruebaGradle;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

public class HistorialMedicoTest {
	HistorialMedico hm;
	LinkedList<String> alergias;
	
	public HistorialMedicoTest() {
		alergias = new LinkedList <String> ();
		hm = new HistorialMedico("quebradura de cubito y radio el 23/02/2010", "Diabetes", "B+", "ninguna", alergias);
	}

	@Test
	public void testSetEnfermedades() {
		HistorialMedico instance = hm;
		instance.setEnfermedades("Parkinson");
		assertEquals("Parkinson", instance.getEnfermedades());
	}
	
	@Test
	public void testSetGrupoG() {
		HistorialMedico instance = hm;
		instance.setGrupoG("B-");
		assertEquals("B-", instance.getGrupoG());
	}
	
	@Test
	public void testSetIncapacidades() {
		HistorialMedico instance = hm;
		instance.setIncapacidades("oido izquierdo no escucha");
		assertEquals("oido izquierdo no escucha", instance.getIncapacidades());
	}
	
	@Test
	public void testSetHistoria() {
		HistorialMedico instance = hm;
		instance.setHistoria("contusion leve en cabeza, 15/05/2011");
		assertEquals("contusion leve en cabeza, 15/05/2011", instance.getHistoria());
	}

}
