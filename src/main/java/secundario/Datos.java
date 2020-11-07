package secundario;

import java.util.LinkedList;

import principal.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lucas
 */
public abstract class Datos {
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static LinkedList<Doctor> Doctores = new LinkedList();
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static LinkedList<PersonalAdm> Administradores = new LinkedList();
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static LinkedList<Paciente> Pacientes = new LinkedList();
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public static LinkedList<Turnos> Turnos = new LinkedList();
    
    public Datos(){}
    
    public static Paciente getPaciente(int dni)
    {
        Paciente p = new Paciente();
        for(int i=0;i<Pacientes.size();i++)
        {
            if(Pacientes.get(i).getDni()==dni)
            {
                p=Pacientes.get(i);
            }
        }
        return p;
    }
    public static Doctor getDoctor(String nom)
    {
        Doctor d = new Doctor();
        for(int i=0;i<Doctores.size();i++)
        {
            if(Doctores.get(i).getNombre().equals(nom))
            {
                d=Doctores.get(i);
            }
        }
        return d;
    }
    
}

