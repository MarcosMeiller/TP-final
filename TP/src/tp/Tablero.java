package tp;

import java.util.ArrayList;

public class Tablero 
{   
    private boolean juegoGanado;
    private boolean terminarTurno;
    private ArrayList <Unidad> cartasEnBatallaJ1;
    private ArrayList <Unidad> cartasEnBatallaJ2;
    private int contadorTurnos;
    private int turnoJugador;
    private Heroe jugador1;
    private Heroe jugador2;
    
    
     public Tablero(boolean juegoGanado, boolean terminarTurno, ArrayList<Unidad> cartasEnBatallaJ1, ArrayList<Unidad> cartasEnBatallaJ2, int contadorTurnos, int turnoJugador, Heroe jugador1, Heroe jugador2) {
        this.juegoGanado = juegoGanado;
        this.terminarTurno = terminarTurno;
        this.cartasEnBatallaJ1 = cartasEnBatallaJ1;
        this.cartasEnBatallaJ2 = cartasEnBatallaJ2;
        this.contadorTurnos = contadorTurnos;
        this.turnoJugador = turnoJugador;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    public boolean isJuegoGanado() {
        return juegoGanado;
    }

    public boolean isTerminarTurno() {
        return terminarTurno;
    }

    public ArrayList<Unidad> getCartasEnBatallaJ1() {
        return cartasEnBatallaJ1;
    }

    public ArrayList<Unidad> getCartasEnBatallaJ2() {
        return cartasEnBatallaJ2;
    }

    public int getContadorTurnos() {
        return contadorTurnos;
    }

    public int getTurnoJugador() {
        return turnoJugador;
    }

    public Heroe getJugador1() {
        return jugador1;
    }

    public Heroe getJugador2() {
        return jugador2;
    }

   
    
    public void juegoNuevo()
    {
        contadorTurnos=1;
        turnoJugador=1;
    }
    /**
     * Funcion que inicia un nuevo turno, y resetea las energias para que puedan volverse a usar
     */
    public void nuevoTurno()
    {
       terminarTurno = false;
       if(turnoJugador==1){
       turnoJugador=2;
       resetearEnergias(jugador1.getMiMano());      
       }
       else{
               turnoJugador=1;
               resetearEnergias(jugador2.getMiMano());
               }
          
    }
    public void resetearEnergias(ArrayList<Carta> mano){
        for(Carta a:mano){
            if(a instanceof Unidad){
                ((Unidad) a).setEnergia(juegoGanado);
            }
        }
    }
    
    public void terminarTurno()
    {
        terminarTurno = true;
    }
    /**
     * Metodo que verifica si la partida finalizo
     * @return si retorna 1 gano el jugador 1, si retorna 2 gano el jugador 2, y 0 si no murio nadie
     */
    public int chequearVictoria()         
    { 
        if(jugador1.getVidaActual() == 0)
        {
            juegoGanado=true;
            return 1;
        }
        if(jugador2.getVidaActual() == 0)
        {
            juegoGanado=true;
            return 2;
        }
        return 0;
    }
    /**
     * Metodo que sirve para robar carta de su propio mazo y ponerla en la mano
     */
    public void robarCarta()
    {
        Carta a;
        if(turnoJugador==1)
        {
            if(jugador1.getMiMano().isEmpty())
            {
                jugador1.recibirDaño(2);
            }
            else
            {
                a=jugador1.robarCartaDeMazo();
                jugador1.agregarAMano(a);
            }
        }
        if(turnoJugador==2)
        {
            if(jugador2.getMiMano().isEmpty())
            {
                jugador2.recibirDaño(2);
            }
            else
            {
                a=jugador2.robarCartaDeMazo();
                jugador2.agregarAMano(a);
            }
        }
    }
    /**
     * Metodo que hace que una carta ataque a la otra
     * @param a Carta seleccionada
     * @param b Carta seleccionada
     */
    public void unidadVsUnidad(Unidad a,Unidad b)
    {
  
        if(a.atacar()==-1)
        {
            b.recibirDaño(a.atacar());
            a.recibirDaño(b.getDaño());
        }
        if(cartaConVida(a)==false)
        {
            cartasEnBatallaJ1.remove(a);
        }
        if(cartaConVida(b)==false)
        {
            cartasEnBatallaJ2.remove(b);
        }
    }
    public void unidadVsHeroe(Unidad a,Heroe h)
    {
        if(a.atacar()!=-1)
        {
            h.recibirDaño(a.atacar());
        }
    }
    /**
     * chequea que la carta tenga vida
     * @param a Una carta
     * @return True si tiene vida, false si no
     */
    public boolean cartaConVida(Carta a)
    {
        boolean cartaConVida;
        if(((Unidad) a).getVida()>0)
        {
            cartaConVida=true;
        }
        else
        {
            cartaConVida=false;
        }
        return cartaConVida;
    }
    
    public void limpiarTablero()
    {
        cartasEnBatallaJ1.clear();
        cartasEnBatallaJ2.clear();
    }
}
