package tp;

import java.util.ArrayList;

public class Tablero 
{
    private ArrayList<Heroe> jugadores;
    private boolean juegoGanado;
    private boolean primerTurno;
    private boolean terminarTurno;
    private int turnoJugador;
    
    public Tablero ()
    {
        
    }

    public Tablero(ArrayList<Heroe> jugadores) 
    {
        this.jugadores = new ArrayList();
        juegoGanado = false;
        primerTurno =true;
        terminarTurno = false;
        turnoJugador = 1;
    }
    
    public void juegoNuevo()
    {
        
    }
    
    public void nuevoTurno()
    {
       terminarTurno = false;
       if(turnoJugador==1)
       turnoJugador=2;
       else
           turnoJugador=1;
    }
    
    public void terminarTurno()
    {
        terminarTurno = true;
    }
    
    public void jugarCarta()
    {
        
    }
    
    public void chequearVictoria()
    {
        
    }
    
    public void robarCarta()
    {
        
    }
    
    public void chequearVidaDeCarta()
    {
        
    }
    
    public void limpiarTablero()
    {
        
    }
}
