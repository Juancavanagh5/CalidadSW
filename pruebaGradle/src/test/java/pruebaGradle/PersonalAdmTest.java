package pruebaGradle;

/*import static org.junit.Assert.*;

import org.junit.Test;

public class PersonalAdmTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}*/

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Joaquin Funes
 */
public class PersonalAdmTest {
    private Doctor d;
    private Paciente p;
    private PersonalAdm pa;
    private FormaDePago fdp;
    private Turnos t, t2;
    
    public PersonalAdmTest() {
        d=new Doctor();
        p=new Paciente();
        pa=new PersonalAdm("paID","qwerty","carlos");
        fdp=new Efectivo();
        t = new Turnos(p, d, "lunes 20", "10:35");
        t2 = new Turnos(p, d, "martes 21", "18:00");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of registrarObserver method, of class PersonalAdm.
     */
    /*@Test
    public void testRegistrarObserver() {
        System.out.println("registrarObserver");
        Doctor d = null;
        PersonalAdm instance = new PersonalAdm();
        instance.registrarObserver(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of notificarObservers method, of class PersonalAdm.
     */
    /*@Test
    public void testNotificarObservers() {
        System.out.println("notificarObservers");
        Doctor d = null;
        Turnos t = null;
        PersonalAdm instance = new PersonalAdm();
        instance.notificarObservers(d, t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of borrarObserver method, of class PersonalAdm.
     */
    /*@Test
    public void testBorrarObserver() {
        System.out.println("borrarObserver");
        Doctor d = null;
        PersonalAdm instance = new PersonalAdm();
        instance.borrarObserver(d);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of borrarTurno method, of class PersonalAdm.
     */
    @Test
    public void testBorrarTurno() {
        System.out.println("borrarTurno");
        Paciente pac = p;
        Doctor doc = d;
        //String fecha = "lunes 20";
        //int[] h = new int [2];
        //h[0]=10; h[1]=30;
        PersonalAdm instance = pa;
        //instance.crearTurno(pac, doc, fecha, h);
        instance.crearTurno(t);
        if(instance.getAllTurnos().isEmpty())
        {
            fail("Fallo el test BorrarTurno");
        }
        Turnos t = instance.getAllTurnos().get(0);
        instance.borrarTurno(t);
        if(instance.getAllTurnos().isEmpty())
        {
            //bien
        }
        else fail("Fallo el test BorrarTurno");
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of crearTurno method, of class PersonalAdm.
     */
    @Test
    public void testCrearTurno() {
        System.out.println("crearTurno");
        Paciente pac = p;
        Doctor doc = d;
        //String fecha = "lunes 20";
        //String fecha2 = "martes 21";
        //int[] h = new int [2];
        //h[0]=10; h[1]=30; 
        PersonalAdm instance = pa;
        instance.crearTurno(t);
        if(instance.getAllTurnos().isEmpty())
        {
            fail("The test case is a prototype.");
        }
        instance.crearTurno(t2);
        if(instance.getAllTurnos().size() != 2)
        {
            fail("The test case is a prototype.");
        }
        
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getAllTurnos method, of class PersonalAdm.
     */
    @Test
    public void testGetAllTurnos() {
        System.out.println("getAllTurnos");
        PersonalAdm instance = new PersonalAdm();
        LinkedList<Turnos> expResult = new LinkedList();
        expResult.add(t);
        expResult.add(t2);
        instance.crearTurno(t);
        instance.crearTurno(t2);
        LinkedList<Turnos> result = instance.getAllTurnos();
        assertEquals(expResult, result);
    }

    /**
     * Test of crearPaciente method, of class PersonalAdm.
     */
    @Test
    public void testCrearPaciente() {
        System.out.println("crearPaciente");
        String nombre = "Luis";
        String apellido = "Rodriguez";
        String dir = "Independencia 679";
        int e = 21;
        int d = 56789221;
        int d2 = 60789349;
        boolean b = true;
        PersonalAdm instance = pa;
        //PersonalAdm instance = new PersonalAdm();
       
        instance.crearPaciente(nombre, apellido, dir, e, d);

        // TODO review the generated test code and remove the default call to fail.
        if(instance.getAllPacientes().isEmpty())
        {
            fail("The test case is a prototype.");
        }
        instance.crearPaciente("Luisa", "Diaz", "Trejo 687", 24, d2);
        if(instance.getAllPacientes().size() != 2)
        {
            fail("The test case is a prototype.");
        }
        assertEquals(56789221, pa.getPaciente(d).getDni());
        assertEquals("Luis", pa.getPaciente(d).getNombre());
        assertEquals(60789349, pa.getPaciente(d2).getDni());
        assertEquals("Luisa", pa.getPaciente(d2).getNombre());
        
    }

    /**
     * Test of getAllPacientes method, of class PersonalAdm.
     */
    @Test
    public void testGetAllPacientes() {
        System.out.println("getAllPacientes");
        PersonalAdm instance = pa;
        Paciente p1 = new Paciente("Aldo", "Algorry", "Av San Martin 135", 52, 30456789, false);
        Paciente p2 = new Paciente("Martin", "Ayarde", "Dean Funes 458", 35, 35446726, false);
        LinkedList<Paciente> expResult = new LinkedList<Paciente>();
        expResult.add(p1);
        expResult.add(p2);
        
        instance.crearPaciente("Aldo", "Algorry", "Av San Martin 135", 52, 30456789);
        instance.crearPaciente("Martin", "Ayarde", "Dean Funes 458", 35, 35446726);
        LinkedList<Paciente> result = instance.getAllPacientes();
        
        assertEquals(expResult.get(0).getDni(), result.get(0).getDni());
        assertEquals(expResult.get(1).getDni(), result.get(1).getDni());
        
        if(pa.getAllPacientes().size() != 2) {
        	fail("The test case is a prototype.");
        }
        
    }

    /**
     * Test of getID method, of class PersonalAdm.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        PersonalAdm instance = pa;
        String expResult = "paID";
        String result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSelect method, of class PersonalAdm.
     */
    /*@Test
    public void testSetSelect() {
        System.out.println("setSelect");
        PersonalAdm instance = new PersonalAdm();
        instance.setSelect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getSelect method, of class PersonalAdm.
     */
    /*@Test
    public void testGetSelect() {
        System.out.println("getSelect");
        PersonalAdm instance = new PersonalAdm();
        boolean expResult = false;
        boolean result = instance.getSelect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getNombre method, of class PersonalAdm.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        PersonalAdm instance = pa;
        String expResult = "carlos";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class PersonalAdm.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        PersonalAdm instance = pa;
        String expResult = "qwerty";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    
}

