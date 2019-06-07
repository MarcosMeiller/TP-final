
package tp;

import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        /*Carta cartita = new Carta("Aldeano","Normal",1,3,4,2,false,false);
        Carta cartita1 = new Carta("Guerrero","Tanque",3,4,6,3,false,false);
        Carta cartita2 = new Carta("Mago","Daño",4,5,3,6,false,false);
        System.out.println(cartita+"\n"+cartita1+"\n"+cartita2);*/
        // HOA
        Unidad unit = new Unidad(5,1,true,"Sujeto","prueba",0,1);
        Unidad unit2 = new Unidad(5,5,true,"Vencedor","prueba",0,1);
        ArrayList <Unidad> unidades= new ArrayList();
        unidades.add(unit);
        ArrayList <Unidad> unidads= new ArrayList();
        unidads.add(unit2);
        Heroe sujeto1 = new Heroe(5,5,10,10,1,0,"jugador 1");
        Heroe sujeto2;
        sujeto2 = new Heroe(10,10,10,10,1,0,"jugador 2");
        Tablero juego = new Tablero (false,false,unidads,unidades,0,1,sujeto1,sujeto2);
            //unit.recibirDaño(20);
            //System.out.println(unit);
            int i=unit.atacar();
            System.out.println(i);
     
           juego.unidadVsUnidad(juego.getCartasEnBatallaJ1().get(0),juego.getCartasEnBatallaJ2().get(0));
           System.out.println(juego.getCartasEnBatallaJ1().get(0));
           System.out.println(juego.getCartasEnBatallaJ2().get(0));
           juego.unidadVsHeroe(juego.getCartasEnBatallaJ1().get(0), juego.getJugador2());
           System.out.println(juego.getJugador2());
      
       
        
    }
}
//    public Tablero(boolean juegoGanado, boolean terminarTurno, ArrayList<Unidad> cartasEnBatallaJ1, ArrayList<Unidad> cartasEnBatallaJ2, int contadorTurnos, int turnoJugador, Heroe jugador1, Heroe jugador2) {
