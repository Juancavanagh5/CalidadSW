package pruebaGradle;

public class Medicamento {
    private String nombre=""; 
    
    public Medicamento(String s)
    {
        this.nombre = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
