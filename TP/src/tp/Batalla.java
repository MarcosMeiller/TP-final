package tp;

import java.util.ArrayList;

public class Batalla 
{
    ArrayList <Carta> cartasEnBatalla;

    public Batalla(ArrayList<Carta> cartasEnBatalla) {
        this.cartasEnBatalla = new ArrayList();
    }
    public void ponerCartaEnBatalla(Carta carta){
        cartasEnBatalla.add(carta);
    }
    
}
