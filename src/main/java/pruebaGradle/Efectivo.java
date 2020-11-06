package pruebaGradle;


public class Efectivo implements FormaDePago {
    
    public Efectivo()
    {
        super();
    }
    
    @Override
    public String pagar()
    {
        return "Pago en efectivo realizado";
    }
}
