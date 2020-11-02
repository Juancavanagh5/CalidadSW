package pruebaGradle;

import java.util.LinkedList;

public class HistorialMedico {
private String historia = "No espesificado aún";
private String Enfermedades = "No espesificado aún";
private String GrupoG = "No espesificado aún";
private String Incapacidades = "No espesificado aún";
private String HistTurnos="";
private LinkedList<String> Alergic = new LinkedList();
private LinkedList<Turnos> consultas= new LinkedList();

public HistorialMedico(){}

public HistorialMedico(String h,String e,String G,String I,LinkedList<String> A)
    {
        this.historia = h;
        this.Enfermedades = e;
        this.GrupoG = G;
        this.Incapacidades = I;
        this.Alergic = A;
    }

    public void setEnfermedades(String Enfermedades) {
        this.Enfermedades = Enfermedades;
    }

    public void setGrupoG(String GrupoG) {
        this.GrupoG = GrupoG;
    }

    public void setIncapacidades(String Incapacidades) {
        this.Incapacidades = Incapacidades;
    }

    public void setAlergic(LinkedList<String> Alergic) {
        this.Alergic = Alergic;
    }

    public void setConsultas(LinkedList<Turnos> consultas) {
        this.consultas = consultas;
    }



public void setHistoria (String s)
{
    this.historia = s;
}

public String getHistoria()
{
    return this.historia;
}

public LinkedList<Turnos> getConsultas()
{
    return this.consultas;
}

    public String getEnfermedades() {
        return Enfermedades;
    }

    public String getGrupoG() {
        return GrupoG;
    }

    public String getIncapacidades() {
        return Incapacidades;
    }

    public LinkedList<String> getAlergic() {
        return Alergic;
    }

    public String getHistTurnos() {
        return HistTurnos;
    }

    public void setHistTurnos(String HistTurnos) {
        this.HistTurnos = HistTurnos;
    }
    

}

