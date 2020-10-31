
public class Turnos {
    private Paciente paciente;
    private Doctor doctor;
    private String fecha;
    private String Hora;
    private String Comentario = "";
    private boolean esSelect = false;
  
    public Turnos (){}

    public Turnos(Paciente p, Doctor d, String fecha, String h)
{
    paciente = p;
    doctor = d;
    this.fecha = fecha;
    this.Hora=h;
}

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return Hora;
    }

    public String getComentario() {
        return Comentario;
    }

    public void setComentario(String Comentario) {
        this.Comentario = Comentario;
    }

    public boolean isSelect() {
        return esSelect;
    }

    public void setEsSelect(boolean esSelect) {
        this.esSelect = esSelect;
    }
    


}
