package tp;

import java.util.ArrayList;

public class Mano 
{
    private ArrayList<Carta> cartasEnMano;

    public Mano(ArrayList<Carta> cartasEnMano) {
        this.cartasEnMano =new ArrayList();
    }
    
    public void recibirCartaDeMazo (Carta carta)
    {
        cartasEnMano.add(carta);
    }
    
    public void sacarDeMano (int posicion)
    {
        cartasEnMano.remove(posicion);
    }
    
}
