package tp;

import java.util.ArrayList;

public class Mazo 
{
    ArrayList<Carta> cartasEnMazo ;

    public Mazo(ArrayList<Carta> cartasEnMazo) {
        this.cartasEnMazo =new ArrayList();
    }

    public ArrayList<Carta> getCartasEnMazo() 
    {
        return cartasEnMazo;
    }

    public void setCartasEnMazo(ArrayList<Carta> cartasEnMazo) 
    {
        this.cartasEnMazo = cartasEnMazo;
    }
    public void removerCartaDelMazo(Carta carta)
    {
        cartasEnMazo.remove(carta);
    }
}
