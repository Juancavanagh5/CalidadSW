package secundario;

import principal.*;


public class Mutual implements FormaDePago {
    
    public Mutual()
    {
    super();
    }
            
    @Override
    public String pagar()
    {
        return "Pago con mutual medica realizado";
    }
}

