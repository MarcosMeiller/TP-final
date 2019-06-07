package tp;

import java.util.ArrayList;

public class Heroe 
        implements IRecibirDaño
{
    private int vidaActual;
    private int vidaMaxima;
    private int manaActual;
    private int manaMaximo;
    private int contadorTurno;
    private int elegir;
    private String nombre;
    private ArrayList<Carta> miMano;
    private ArrayList<Carta> cartasEnMazo;

    public Heroe()
    {
        
    }

    public Heroe(int vidaActual, int vidaMaxima, int manaActual, int manaMaximo, int contadorTurno, int elegir, String nombre) 
    {
        this.vidaActual = vidaActual;
        this.vidaMaxima = vidaMaxima;
        this.manaActual = manaActual;
        this.manaMaximo = manaMaximo;
        this.contadorTurno = contadorTurno;
        this.elegir = elegir;
        this.nombre = nombre;
        this.miMano= new ArrayList();
        this.cartasEnMazo=new ArrayList();
        
    }
    
    public int getVidaActual() 
    {
        return vidaActual;
    }
    
  
    public int getVidaMaxima() 
    {
        return vidaMaxima;
    }

    public int getManaActual() 
    {
        return manaActual;
    }

    public int getManaMaximo() 
    {
        return manaMaximo;
    }

    public int getContadorTurno() 
    {
        return contadorTurno;
    }

 

    public int getElegir() 
    {
        return elegir;
    }
    
    public String getNombre() 
    {
        return nombre;
    }
    public ArrayList<Carta> getMiMano() {
        return miMano;
    }

    

    public void setVidaActual(int vidaActual) 
    {
        this.vidaActual = vidaActual;
    }

    public void setManaActual(int manaActual) 
    {
        this.manaActual = manaActual;
    }

    public void setContadorTurno(int contadorTurno) 
    {
        this.contadorTurno = contadorTurno;
    }

    public void setElegir(int elegir) 
    {
        this.elegir = elegir;
    }

    

   @Override
    public void recibirDaño(int dañoRecibido) 
    {
       vidaActual-=dañoRecibido;
    }
    
    public void agregarAMano(Carta a)
    {
        miMano.add(a);
    }
    
    public void removerDeMano(Carta a)
    {
        miMano.remove(a);
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
    
    public Carta robarCartaDeMazo()
    {
        Carta a=cartasEnMazo.get(0);
        cartasEnMazo.remove(0);
        return a;
    }

    @Override
    public String toString() {
        return "Heroe{" + "vidaActual=" + vidaActual + '}';
    }

    }  

