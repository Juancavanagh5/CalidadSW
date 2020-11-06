package pruebaGradle;

import java.util.ArrayList;

public class Main {
    public static ArrayList <Doctor> Doctores[];
    public static ArrayList <PersonalAdm> Admin[];
    public static void main(String[] args) {
        PersonalAdm usuario = new PersonalAdm("admin0","1234","Administrador");
        @SuppressWarnings("unused")
		Doctor d1 = new Doctor("Martin", "docmartin", "1234", usuario);
        @SuppressWarnings("unused")
		Doctor d2 = new Doctor("Federico", "docfederico", "4321", usuario);
        Aut Abrir = new Aut(usuario);
        Abrir.setVisible(true);
        Abrir.setLocationRelativeTo(null);
        @SuppressWarnings("unused")
		Efectivo e = new Efectivo();
        //version final
        
    }
    
}

