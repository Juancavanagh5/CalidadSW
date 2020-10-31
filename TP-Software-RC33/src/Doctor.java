import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;

public class Doctor {
private String nombre;
private LinkedList <Turnos> misTurnos = new LinkedList();
private LinkedList <Paciente> misPacientes = new LinkedList();
private PersonalAdm persAdm;  //Sujeto a quien observo
private String user = "";
private String password;
private boolean esSelect = false;

public Doctor(){}

public Doctor(String n, String m, String pass, PersonalAdm pa)
{
    nombre = n;
    this.user = m;
    this.password = pass;
    persAdm = pa;
    persAdm.registrarObserver(this);  //me registro como observador a PersonalAdm
}

public LinkedList<Turnos> getTurnos()
{
    return misTurnos;
}

public void actualizar(Turnos t)
{
    misTurnos.add(t);
    if(misPacientes.isEmpty())
    {
        misPacientes.add(t.getPaciente());
    }
    else
    {
        if(misPacientes.contains(t.getPaciente()))
        {
            //ya tengo ese paciente asi que no hago nada
        }
        else misPacientes.add(t.getPaciente());
    }
    
}
public void recetar(Paciente p, Medicamento m)
{     
    
}

public String getID()
{
    return this.user;
}

public String getPassword()
{
    return this.password;
}

public void setSelect()
{
    this.esSelect=true;
}

public boolean getSelect()
{
    return this.esSelect;
}

    public String getNombre() {
        return nombre;
    }

    public LinkedList<Turnos> getMisTurnos() {
        return misTurnos;
    }

    public LinkedList<Paciente> getMisPacientes() {
        return misPacientes;
    }

    public PersonalAdm getPersAdm() {
        return persAdm;
    }

    public boolean isEsSelect() {
        return esSelect;
    }
    
    public Paciente getPaciente(int d)
    {
        Paciente p = new Paciente();
        for(int i =0;i<this.misPacientes.size();i++)
        {
            if(this.misPacientes.get(i).getDni()==d)
            {
                p = this.misPacientes.get(i);
            }
        }
        return p;
    }
    
    public void selPaciente(int a)
    {
        for(int i =0;i<this.misPacientes.size();i++)
        {
            if(i==a)
            {
                this.misPacientes.get(i).setSelect();
            }
            else
            {
                this.misPacientes.get(i).unSelect();
            }
        }
    }
    
    public Paciente getPacienteSel()
    {
        Paciente p = new Paciente();
        for(int i =0;i<this.misPacientes.size();i++)
        {
            if(this.misPacientes.get(i).EsSelect())
            {
                p = this.misPacientes.get(i);
            }
        }
        return p;
    }
    
    public void selTurno(int a)
    {
        for(int i =0;i<this.misTurnos.size();i++)
        {
            if(i==a)
            {
                this.misTurnos.get(i).setEsSelect(true);
            }
            else
            {
                this.misTurnos.get(i).setEsSelect(false);
            }
        }
    }
    public void QuitarTurnoSel()
    {
        for(int i =0;i<this.misTurnos.size();i++)
        {
            if(this.misTurnos.get(i).isSelect())
            {
                this.misTurnos.remove(this.misTurnos.get(i));
            }
        }
    }
    
    public Turnos getTurnoSel()
    {
        Turnos t = new Turnos();
        for(int i =0;i<this.misTurnos.size();i++)
        {
            if(this.misTurnos.get(i).isSelect())
            {
               t = this.misTurnos.get(i);
            }
        }
        return t;
    }
    
    public boolean ExistePaciente (int dni)
    {
        for(int i =0;i<this.misPacientes.size();i++)
        {
            if(this.misPacientes.get(i).getDni()==dni)
            {
                return true;
            }
        }
        return false;
    }
    public void unSelect()
    {
        this.esSelect = false;
    }
}
