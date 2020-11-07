package principal;

import java.util.ArrayList;

import secundario.*;

public class Paciente {
    private String nombre ;
    private String apellido;
    private String direccion;
    private String estaTomando="Ningun medicamento actualmente";
    private int edad;
    private int dni;
    private HistorialMedico historial = new HistorialMedico();
    private ArrayList <Medicamento> misMedicamentos;
    private ArrayList <Medicamento> alergias;
    private FormaDePago mifdp;
    public boolean esSelect = false;
    boolean deuda = false;
    
    public Paciente(){}
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
	public Paciente(String n,String a,String d,int e,int dn,boolean sel)
    {
        this.nombre = n;
        this.apellido = a;
        this.direccion = d;
        this.edad = e;
        this.dni = dn;
        this.esSelect = sel;
        misMedicamentos = new ArrayList();
        alergias = new ArrayList();    
    }
    
    public void addMedicamento(Medicamento m)
    {
         misMedicamentos.add(m);
         if(this.estaTomando.equals("Ningun medicamento actualmente"))
         {
             this.estaTomando="";
         }
         this.estaTomando+=m.getNombre()+" ";
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public void setfdp(FormaDePago fdp)
    {
        mifdp = fdp;
    }
    
    public FormaDePago getMiFdp()
    {
    	return mifdp;
    }
            
    public void setSelect()
    {
        this.esSelect = true;
    }

    public void setHistorial(HistorialMedico historial) {
        this.historial = historial;
    }

    public void setMisMedicamentos(ArrayList<Medicamento> misMedicamentos) {
        this.misMedicamentos = misMedicamentos;
    }

    public void setMifdp(FormaDePago mifdp) {
        this.mifdp = mifdp;
    }

    public boolean EsSelect() {
        return esSelect;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public ArrayList<Medicamento> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<Medicamento> alergias) {
        this.alergias = alergias;
    }
    
    public void addAlergia(Medicamento m) {
    	this.alergias.add(m);
    }
    
    public void unSelect()
    {
        this.esSelect = false;
    }

    public HistorialMedico getHistorial() {
        return historial;
    }

    public boolean getDeuda() {
        return deuda;
    }

    public void setDeuda(boolean deuda) {
        this.deuda = deuda;
    }
    
    public String Pagar()
    {
        return this.mifdp.pagar();
    }

    public String getEstaTomando() {
        return estaTomando;
    }

    public void setEstaTomando(String estaTomando) {
        this.estaTomando = estaTomando;
    }

    public ArrayList<Medicamento> getMisMedicamentos() {
        return misMedicamentos;
    }
   
    
}
