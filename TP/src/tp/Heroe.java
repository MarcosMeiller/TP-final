package tp;

public class Heroe
{
    int vidaActual;
    int vidaMaxima;
    int manaActual;
    int manaMaximo;
    int contadorTurno;
    int recibirDaño;
    int elegir;
    int costoHabilidad;
    int dañoHabilidad;
    String nombre;
    Mano miMano;
    Mazo miMazo;
    Batalla misCartasBatallando;

    public Heroe() 
    {
        
    }

    public Heroe(int vidaActual, int vidaMaxima, int manaActual, int manaMaximo, int contadorTurno, int recibirDaño, int elegir, int costoHabilidad, int dañoHabilidad, String nombre, Mano miMano, Mazo miMazo, Batalla misCartasBatallando) 
    {
        this.vidaActual = vidaActual;
        this.vidaMaxima = vidaMaxima;
        this.manaActual = manaActual;
        this.manaMaximo = manaMaximo;
        this.contadorTurno = contadorTurno;
        this.recibirDaño = recibirDaño;
        this.elegir = elegir;
        this.costoHabilidad = costoHabilidad;
        this.dañoHabilidad = dañoHabilidad;
        this.nombre = nombre;
        this.miMano = miMano;
        this.miMazo = miMazo;
        this.misCartasBatallando = misCartasBatallando;
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

    public int getRecibirDaño() 
    {
        return recibirDaño;
    }

    public int getElegir() 
    {
        return elegir;
    }

    public int getCostoHabilidad() 
    {
        return costoHabilidad;
    }

    public int getDañoHabilidad() 
    {
        return dañoHabilidad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public Mano getMiMano() 
    {
        return miMano;
    }

    public Mazo getMiMazo() 
    {
        return miMazo;
    }

    public Batalla getMisCartasBatallando() 
    {
        return misCartasBatallando;
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

    public void setRecibirDaño(int recibirDaño) 
    {
        this.recibirDaño = recibirDaño;
    }

    public void setElegir(int elegir) 
    {
        this.elegir = elegir;
    }

    public void setMiMano(Mano miMano) 
    {
        this.miMano = miMano;
    }

    public void setMiMazo(Mazo miMazo) 
    {
        this.miMazo = miMazo;
    }

    public void setMisCartasBatallando(Batalla misCartasBatallando) 
    {
        this.misCartasBatallando = misCartasBatallando;
    }
    
}