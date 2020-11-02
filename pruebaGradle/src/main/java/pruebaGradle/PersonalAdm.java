package pruebaGradle;

import java.util.ArrayList;
import java.util.LinkedList;

public class PersonalAdm {
private LinkedList <Turnos> allTurnos=new LinkedList();
LinkedList <Paciente> allPacientes;
LinkedList <Doctor> misObservers;
private String nombre;
private String password; 
private String ID;
private boolean esSelect = false;

public PersonalAdm()
{
}

public PersonalAdm(String d,String pass,String nom)
{
    this.ID=d;
    this.password=pass;
    this.nombre=nom;
    allPacientes = new LinkedList();
    misObservers = new LinkedList();
}

public void registrarObserver(Doctor d)
{
    misObservers.add(d);
}

public void notificarObservers(Doctor d, Turnos t)
{
    d.actualizar(t);
}

public void borrarObserver(Doctor d)
{
    misObservers.remove(d);
}

public void borrarTurno(Turnos t)
{
    allTurnos.remove(t);
}

public void crearTurno(Turnos t)
{
   allTurnos.add(t);
   notificarObservers(t.getDoctor(),t);
}

public LinkedList <Turnos> verTurnos()
{
   return allTurnos; 
}

public void crearPaciente(String nombre, String apellido, String dir, int e,int d)
{
    Paciente p = new Paciente(nombre, apellido,dir,e,d,false);
    allPacientes.add(p);
}

public LinkedList <Paciente> getPacientes()
{
    return allPacientes;
}

public String getID()
{
    return this.ID;
}
public void setSelect()
{
    this.esSelect = true;
}

public boolean getSelect()
{
    return this.esSelect;
}
public String getNombre()
{
    return this.nombre;
}
public String getPassword()
{
    return this.password;
}

    private LinkedList<Turnos> getAllTurnos() {
        return allTurnos;
    }

    public LinkedList<Paciente> getAllPacientes() {
        return allPacientes;
    }

    public LinkedList<Doctor> getMisObservers() {
        return misObservers;
    }

public Paciente getPaciente(int dni)
    {
        Paciente p = new Paciente();
        for(int i=0;i<this.allPacientes.size();i++)
        {
            if(this.allPacientes.get(i).getDni()==dni)
            {
                p=this.allPacientes.get(i);
            }
        }
        return p;
    }
    public Doctor getDoctor(String nom)
    {
        Doctor d = new Doctor();
        for(int i=0;i<this.misObservers.size();i++)
        {
            if(this.misObservers.get(i).getNombre().equals(nom))
            {
                d=this.misObservers.get(i);
            }
        }
        return d;
    }
    
     public Doctor getDoctorSel()
     {
         Doctor d = new Doctor();
         for(int i = 0; i< this.misObservers.size(); i++)
         {
             if(this.misObservers.get(i).getSelect())
             {
                 d = this.misObservers.get(i);
             }
         }
         return d;
     }
     
     public Paciente getPacienteSel()
     {
         Paciente p = new Paciente();
         for(int i = 0; i< this.allPacientes.size(); i++)
         {
             if(this.allPacientes.get(i).EsSelect())
             {
                 p = this.allPacientes.get(i);
             }
         }
         return p;
     }
     
     public void SelPaciente (int a)
     {
         for(int i = 0; i< this.allPacientes.size(); i++)
         {
             if(i==a)
             {
                 this.allPacientes.get(i).setSelect();
             }
             else
             {
                 this.allPacientes.get(i).unSelect();
             }
         }
     }
     
     public void SelDoctor (String d)
     {
         for(int i = 0; i< this.misObservers.size(); i++)
         {
             if(d.equals(this.misObservers.get(i).getID()))
             {
                 this.misObservers.get(i).setSelect();
             }
             else
             {
                 this.misObservers.get(i).unSelect();
             }
         }
     }
     
     

}

