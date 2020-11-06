package pruebaGradle;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
@SuppressWarnings("unused")
public class PacienteTest {
    private Medicamento penicilina;
    private Medicamento corticoides;
    private Medicamento paracetamol;
    private Paciente p;
    private FormaDePago fdp1,fdp2, fdp3;
    
    public PacienteTest() {
        penicilina = new Medicamento("Penicilina");
        corticoides = new Medicamento("Corticoides");
        paracetamol = new Medicamento("Paracetamol");
        p = new Paciente("Aldo", "Algorry", "Estrada 145", 50, 15478589, false);
        fdp1 = new Efectivo();
        fdp2 = new Mutual();
        fdp3 = new Tarjeta();
    }
    
    
    /**
     * Test of getEdad method, of class Paciente.
     */
    @Test
    public void testGetEdad() {
    	System.out.println("getEdad");
    	Paciente instance = p;
    	assertEquals(50, instance.getEdad());
    }
    
    
    /**
     * Test of getDni method, of class Paciente.
     */
    @Test
    public void testGetDni() {
    	System.out.println("getDni");
    	Paciente instance = p;
    	assertEquals(15478589, instance.getDni());
    }
    
    
    /**
     * Test of getNombre method, of class Paciente.
     */
    @Test
    public void testGetNombre() {
    	System.out.println("getNombre");
    	Paciente instance = p;
    	assertEquals("Aldo", instance.getNombre());
    }
    
    
    /**
     * Test of setApellido method, of class Paciente.
     */
    @Test
    public void testSetApellido() {
    	System.out.println("setApellido");
    	Paciente instance = p;
    	instance.setApellido("nuevoApellido");
    	assertEquals("nuevoApellido", instance.getApellido());
    }
    
    /**
     * Test of setSelect method, of class Paciente.
     */
    @Test
    public void testSetSelect() {
    	System.out.println("setSelect");
    	Paciente instance = p;
    	assertEquals(false, instance.EsSelect()); //por defecto es false
    	instance.setSelect(); //lo pone en true
    	assertEquals(true, instance.EsSelect());
    }
    
    /**
     * Test of setEstaTomando method, of class Paciente.
     */
    @Test
    public void testSetEstaTomando() {
    	System.out.println("setEstaTomando");
    	Paciente instance = p;
    	instance.setEstaTomando("cree que Supritos pero no esta seguro");
    	assertEquals("cree que Supritos pero no esta seguro", instance.getEstaTomando());
    }
    
    /**
     * Test of getEstaTomando method, of class Paciente.
     */
    @Test
    public void testGetEstaTomando() {
    	System.out.println("getEstaTomando");
    	Paciente instance = p;
    	assertEquals("Ningun medicamento actualmente", instance.getEstaTomando());
    	instance.addMedicamento(penicilina);
    	assertEquals("Penicilina ", instance.getEstaTomando());
    	instance.addMedicamento(corticoides);
    	assertEquals("Penicilina Corticoides ", instance.getEstaTomando());
    }
    
    
    /**
     * Test of getDireccion method, of class Paciente.
     */
    @Test
    public void testGetDireccion() {
    	System.out.println("getDireccion");
    	Paciente instance = p;
    	assertEquals("Estrada 145", instance.getDireccion());
    }
    
    
    /**
     * Test of setDireccion method, of class Paciente.
     */
    @Test
    public void testSetDireccion() {
    	System.out.println("setDireccion");
    	Paciente instance = p;
    	instance.setDireccion("Nueva direccion 325");
    	assertEquals("Nueva direccion 325", instance.getDireccion());
    }
    
    /**
     * Test of setEdad method, of class Paciente.
     */
    @Test
    public void testSetEdad() {
    	System.out.println("setEdad");
    	Paciente instance = p;
    	instance.setEdad(54);
    	assertEquals(54, instance.getEdad());
    }
    
    
    
    /**
     * Test of addMedicamento method, of class Paciente.
     */
    @Test
    public void testAddMedicamento() {
        System.out.println("addMedicamento");
        Paciente instance = p;
        ArrayList <Medicamento> medicamentosExp = new ArrayList <Medicamento>();
        medicamentosExp.add(penicilina);
        instance.addMedicamento(penicilina);
        assertEquals(medicamentosExp, instance.getMisMedicamentos());
        
        medicamentosExp.add(corticoides);
        instance.addMedicamento(corticoides);
        assertEquals(medicamentosExp, instance.getMisMedicamentos());
        
        
        /*instance.addAlergia(penicilina); //lo hago alergico a la penicilina
        
        if(!instance.getAlergias().contains(penicilina)) { //si no es alergico, se lo receto
        	instance.addMedicamento(penicilina);
        }
        else fail("The test case is a prototype.");*/
    }



    /**
     * Test of setMifdp method, of class Paciente.
     */
    @Test
    public void testSetMifdp() {
        System.out.println("setMifdp");
        Paciente instance = p;
        
        instance.setMifdp(fdp1);
        assertEquals("Pago en efectivo realizado", instance.getMiFdp().pagar());
        
        instance.setMifdp(fdp2);
        assertEquals("Pago con mutual medica realizado", instance.getMiFdp().pagar());
        
        instance.setMifdp(fdp3);
        assertEquals("Pago con tarjeta de credito realizado", instance.getMiFdp().pagar());
    }
    
    
    /**
     * Test of setMisMedicamentos method, of class Paciente.
     */
    @Test
    public void testSetMisMedicamentos() {
        System.out.println("setMisMedicamentos");
        Paciente instance = p;
        ArrayList <Medicamento> misMedicamentos = new ArrayList <Medicamento> ();
        misMedicamentos.add(corticoides);
        misMedicamentos.add(penicilina);
        misMedicamentos.add(paracetamol);
        instance.setMisMedicamentos(misMedicamentos);
        assertEquals(misMedicamentos, instance.getMisMedicamentos());
    }


    /**
     * Test of getAlergias method, of class Paciente.
     */
    @Test
    public void testGetAlergias() {
        System.out.println("getAlergias");
        Paciente instance = p;
        ArrayList<Medicamento> expResult = new ArrayList <Medicamento>();
        expResult.add(penicilina); expResult.add(corticoides);
        instance.addAlergia(penicilina); instance.addAlergia(corticoides);
        ArrayList<Medicamento> result = instance.getAlergias();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of setAlergias method, of class Paciente.
     */
    @Test
    public void testSetAlergias() {
        System.out.println("getAlergias");
        Paciente instance = p;
        ArrayList<Medicamento> array = new ArrayList <Medicamento>();
        array.add(penicilina); array.add(corticoides);
        instance.setAlergias(array);
        ArrayList<Medicamento> result = instance.getAlergias();
        assertEquals(array, result);
    }
    
    /**
     * Test of setDeuda method, of class Paciente.
     */
    @Test
    public void testSetDeuda() {
        System.out.println("setDeuda");
        Paciente instance = p;
        instance.setDeuda(true);
        assertEquals(true, instance.getDeuda());
        
        instance.setDeuda(false);
        assertEquals(false, instance.getDeuda());
    }

    /**
     * Test of addAlergia method, of class Paciente.
     */
    @Test
    public void testAddAlergia() {
        System.out.println("addAlergia");
        Paciente instance = p;
        instance.addAlergia(penicilina);
        if(p.getAlergias().contains(penicilina))
        {
            //todo bien
        }
        else
        fail("The test case is a prototype.");
    }

    /**
     * Test of pagar method, of class Paciente.
     */
    @Test
    public void testPagar() {
        System.out.println("pagar");
        Paciente instance = p;
        instance.setMifdp(fdp1);
        assertEquals(instance.Pagar(), "Pago en efectivo realizado");
    }

    /**
     * Test of getMisMedicamentos method, of class Paciente.
     */
    @Test
    public void testGetMisMedicamentos() {
        System.out.println("getMisMedicamentos");
        Paciente instance = p;
        ArrayList<Medicamento> expResult = new ArrayList<Medicamento>();
        expResult.add(penicilina); expResult.add(corticoides);
        instance.addMedicamento(penicilina); instance.addMedicamento(corticoides);
        ArrayList<Medicamento> result = instance.getMisMedicamentos();
        assertEquals(expResult, result);
    }
    
}
