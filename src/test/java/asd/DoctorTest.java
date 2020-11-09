package asd;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import principal.*;
import secundario.*;

import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
@SuppressWarnings("unused")
public class DoctorTest {
    private Medicamento penicilina;
    private Medicamento corticoides;
    private Medicamento paracetamol;
    private Paciente p1, p2, p3;
    private Doctor d;
    private Doctor d1;
    private Doctor d2;
    private PersonalAdm pa;
    
    public DoctorTest() {
    	penicilina = new Medicamento("Penicilina");
        corticoides = new Medicamento("Corticoides");
        paracetamol = new Medicamento("Paracetamol");
        p1 = new Paciente("Aldo", "Algorry", "Estrada 145", 50, 15478589, false);
        p2 = new Paciente("Felipe", "Ferrari", "San Martin 165", 24, 19478589, false);
        p3 = new Paciente("Laura", "Cendoya", "Belgrano 789", 25, 28156745, false);
        pa = new PersonalAdm("paID", "pass123", "carlos");
        d = new Doctor("Orlando", "docOrlando", "rdp", pa);
        d1 = new Doctor("doc1","user1","1234",pa);
        d2 = new Doctor ("doc2", "user2","4321",pa);
    }
    

    /**
     * Test of getTurnos method, of class Doctor.
     */
    /*@Test
    public void testGetTurnos() {
        System.out.println("getTurnos");
        Doctor doc1 = d1;
        Doctor doc2 = d2;
        pa.crearPaciente("joaquin", "funes", "pueyrredon 149", 24, 38160516); //creo el paciente joaquin  
        pa.crearPaciente("lucas","pardina","trejo 444",23,4056568);  //creo el paciente lucas
        pa.crearPaciente("luis", "paredes", "indep 455", 20, 3934569);  //creo el paciente luis
        
        pa.crearTurno(pa.getAllPacientes().get(0),doc1, "lunes", "as"); 
        pa.crearTurno(pa.getAllPacientes().get(1), doc2, "martes", b);
        pa.crearTurno(pa.getAllPacientes().get(2), doc2, "miercoles", c);
        
        
        LinkedList<Turnos> expResult = new LinkedList();
        expResult.add(new Turnos(pa.getAllPacientes().get(1), doc2, "martes", b));
        expResult.add(new Turnos(pa.getAllPacientes().get(2), doc2, "miercoles", c));
        LinkedList<Turnos> result = doc2.getTurnos();
        assertEquals(expResult.get(0).getPaciente().getDni(), result.get(0).getPaciente().getDni());
        assertEquals(expResult.get(1).getPaciente().getDni(), result.get(1).getPaciente().getDni());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of actualizar method, of class Doctor.
     */
    /*@Test
    public void testActualizar() {
        System.out.println("actualizar");
        Turnos t = null;
        Doctor instance = new Doctor();
        instance.actualizar(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of recetar method, of class Doctor.
     */
    /*@Test
    public void testRecetar() {
        System.out.println("recetar");
        Paciente pac = p;
        Medicamento m1 = penicilina;
        Medicamento m2 = corticoides;
        Doctor instance = d;
        String expResult = "Recetado con exito";
        String result = instance.recetar(pac, m1);  //receto penicilina
        assertEquals(expResult, result);
        instance.agregarAlergia(pac, m2);  //paciente alergico a corticoides
        result = instance.recetar(pac,m2);  //le receto corticoides
        expResult = "No se puede recetar debido a que el paciente es alergico";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of getID method, of class Doctor.
     */
    @Test
    public void testGetID() {
        System.out.println("getID");
        Doctor instance = d;
        String expResult = "docOrlando";
        String result = instance.getID();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPassword method, of class Doctor.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Doctor instance = d1;
        String expResult = "1234";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSelect method, of class Doctor.
     */
    /*@Test
    public void testSetSelect() {
        System.out.println("setSelect");
        Doctor instance = new Doctor();
        instance.setSelect();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getSelect method, of class Doctor.
     */
    /*@Test
    public void testGetSelect() {
        System.out.println("getSelect");
        Doctor instance = new Doctor();
        boolean expResult = false;
        boolean result = instance.getSelect();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/

    /**
     * Test of getNombre method, of class Doctor.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Doctor instance = d;
        String expResult = "Orlando";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of selPaciente method, of class Doctor.
     */
    /*@Test
    public void testSelPaciente() {
        System.out.println("selPaciente");
        Doctor instance = d1;
        
        Turnos t1 = new Turnos(p1, instance, "lunes 20", "10:35");
        Turnos t2 = new Turnos(p2, instance, "martes 21", "18:00");
        Turnos t3 = new Turnos(p3, instance, "martes 21", "14:00");
        
        pa.crearTurno(t1); 
        pa.crearTurno(t2);
        pa.crearTurno(t3);
        
        instance.selPaciente(1); //queda seleccionado el paciente p2
        assertEquals(p2, instance.getPacienteSel());
        
        
    }
    
    /**
     * Test of selTurno method, of class Doctor.
     */
    /*@Test
    public void testSelTurno() {
        System.out.println("selTurno");
        Doctor instance = d1;
        
        Turnos t1 = new Turnos(p1, instance, "lunes 20", "10:35");
        Turnos t2 = new Turnos(p2, instance, "martes 21", "18:00");
        Turnos t3 = new Turnos(p3, instance, "martes 21", "14:00");
        
        pa.crearTurno(t1); 
        pa.crearTurno(t2);
        pa.crearTurno(t3);
        
        instance.selTurno(2); //selecciono el turno t3
        assertEquals(t3, instance.getTurnoSel());
    }
    
    /**
     * Test of quitarTurnoSel method, of class Doctor.
     */
    /*@Test
    public void testQuitarTurnoSel() {
        System.out.println("quitarTurnoSel");
        Doctor instance = d1;
        
        Turnos t1 = new Turnos(p1, instance, "lunes 20", "10:35");
        Turnos t2 = new Turnos(p2, instance, "martes 21", "18:00");
        Turnos t3 = new Turnos(p3, instance, "martes 21", "14:00");
        
        pa.crearTurno(t1); 
        pa.crearTurno(t2);
        pa.crearTurno(t3);
        
        instance.selTurno(2); //selecciono el turno t3
        assertEquals(t3, instance.getTurnoSel());
        instance.QuitarTurnoSel();
        
        LinkedList <Turnos> exp = new LinkedList <Turnos>();
        exp.add(t1); exp.add(t2);
        assertEquals(exp, instance.getMisTurnos());
        
    }
    

    /**
     * Test of getMisPacientes method, of class Doctor.
     */
    /*@Test
    public void testGetMisPacientes() {
        System.out.println("getMisPacientes");
        Doctor doc1 = d1;
        Doctor doc2 = d2;
        
        Turnos t1 = new Turnos(p1, doc1, "lunes 20", "10:35");
        Turnos t2 = new Turnos(p2, doc1, "martes 21", "18:00");
        Turnos t3 = new Turnos(p3, doc2, "martes 21", "14:00");
        Turnos t4 = new Turnos(p1, doc2, "viernes 24", "15:00");
        
        pa.crearTurno(t1); 
        pa.crearTurno(t2);
        pa.crearTurno(t3);
        pa.crearTurno(t4);
        
        LinkedList<Paciente> resultExp1 = new LinkedList<Paciente>();
        resultExp1.add(p1);
        resultExp1.add(p2);
        LinkedList<Paciente> result = doc1.getMisPacientes();
        assertEquals(resultExp1, result); //se fija si el doc1 tiene al paciente1 y al paciente2
        
        LinkedList<Paciente> resultExp2 = new LinkedList<Paciente>();
        resultExp2.add(p3);
        resultExp2.add(p1);
        LinkedList<Paciente> result2 = doc2.getMisPacientes();
        assertEquals(resultExp2, result2);//se fija si el doc2 tiene al paciente1 y al paciente3
        

    }

    /**
     * Test of agregarAlergia method, of class Doctor.
     */
    /*@Test
    public void testAgregarAlergia() {
        System.out.println("agregarAlergia");
        Paciente pac = p;
        Medicamento m = penicilina;
        Doctor instance = d;
        instance.agregarAlergia(pac, m);
        if(pac.getAlergias().contains(m))
        {
            //todo bien
        }
        // TODO review the generated test code and remove the default call to fail.
        else fail("The test case is a prototype.");
    }*/
    
}

