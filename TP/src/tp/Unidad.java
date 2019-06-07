package tp;

public class Unidad  extends Carta implements IRecibirDaño,IAtacar
{
    private int vida;
    private int daño;
    private boolean energia;

    public Unidad(int vida, int daño, boolean energia, String nombre, String tipo, int ID, int mana) 
    {
        super(nombre, tipo, ID, mana);
        this.vida = vida;
        this.daño = daño;
        this.energia = energia;
    }
    
    @Override
    public void recibirDaño(int dañoRecibido) 
    {
         vida-=dañoRecibido;
         if(vida < 0)
             vida=0;
   }

    @Override
    public int atacar() 
    {
        if(energia==true)
        {
            energia=false;
            return daño;
        }
        else
        {
            return -1;
        }
    }

    public int getVida() 
    {
        return vida;
    }

    public int getDaño() 
    {
        return daño;
    }

    public boolean isEnergia() 
    {
        return energia;
    }

    public void setEnergia(boolean energia) 
    {
        this.energia = energia;
    }

    @Override
    public String toString() {
        return "vida: " + vida + " daño: " + daño + " energia: " + energia;
    }
    
}
