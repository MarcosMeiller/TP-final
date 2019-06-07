package tp;

public class Carta 
{
    private String nombre;
    private String tipo;
    private int ID;
    private int mana;
  

    public Carta(String nombre, String tipo, int ID, int mana) 
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ID = ID;
        this.mana = mana;
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

    
    @Override
    public String toString() 
    {
        return "Carta"+"\n\n" + "nombre= "+nombre 
                +"\n"+"tipo= "+tipo 
                +"\n"+"mana= "+mana+"\n\n";    
    }
    

}
