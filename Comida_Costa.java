package CorrecionE1B1;

public class Comida_Costa extends Provincia{
    String sabor;
    double precio; 
    public Comida_Costa(String nombre,double temperatura, double precio){
        super(nombre,temperatura);
        this.precio = precio;
    }
    public Comida_Costa(){
    }
    public String getSabor(){
        return sabor;
    }
    public void setSabor(String sabor){
        this.sabor = sabor;
    }
    public double getPrecio(){
        return precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public void mensaje (){
        System.out.println("\" Buen Provecho \"");
    }
    
}
