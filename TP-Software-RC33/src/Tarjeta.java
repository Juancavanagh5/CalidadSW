
public class Tarjeta implements FormaDePago {
    
    public Tarjeta()
    {
        super();
    }
    @Override
    public String pagar()
    {
        return "Pago con tarjeta de credito realizado";
    }
}
