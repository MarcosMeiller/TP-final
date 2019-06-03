
package tp;

public class Main {
    public static void main(String[] args) {
        Carta cartita = new Carta("Aldeano","Normal",1,3,4,2,false,false);
        Carta cartita1 = new Carta("Guerrero","Tanque",3,4,6,3,false,false);
        Carta cartita2 = new Carta("Mago","Daño",4,5,3,6,false,false);
        System.out.println(cartita+"\n"+cartita1+"\n"+cartita2);
        //Barbaro, Guerrero, Arquero, Brujo, Asesino, Conjurador, Caballero, Druida, No-Muerto, Dragon, Mago, Cazador, Goblin
        //carta de mana, de bola de fuego, de robo, de buff (vida o daño)
    }
}
