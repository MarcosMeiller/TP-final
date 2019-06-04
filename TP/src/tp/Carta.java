package tp;

public class Carta 
{
    String nombre;
    String tipo;
    int ID;
    int mana;
    int vida;
    int daño;
    boolean seMovio;
    boolean yaAtaco;

    public Carta(String nombre, String tipo, int ID, int mana, int vida, int daño, boolean seMovio, boolean yaAtaco) 
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ID = ID;
        this.mana = mana;
        this.vida = vida;
        this.daño = daño;
        this.seMovio = seMovio;
        this.yaAtaco = yaAtaco;
    }

    public Carta() 
    {
        
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public int getID() 
    {
        return ID;
    }

    public int getMana() 
    {
        return mana;
    }

    public int getVida() 
    {
        return vida;
    }

    public int getDaño() 
    {
        return daño;
    }

    public boolean isSeMovio() 
    {
        return seMovio;
    }

    public boolean isYaAtaco() 
    {
        return yaAtaco;
    }

    @Override
    public String toString() 
    {
        return "Carta"+"\n\n" + "nombre= "+nombre 
                +"\n"+"tipo= "+tipo 
                +"\n"+"mana= "+mana
                +"\n"+"vida= "+vida
                +"\n"+"daño= "+daño+"\n\n";    
    }
}
