package CorrecionE1B1;

public class Comida_Tipica {
    String nombre;
    Comida_Tipica(String nombre){
        this.nombre = nombre;
    }
    Comida_Tipica(){
        
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void bienvenida(){
        System.out.println("Bienvenido a Ecuador, el país de las 4 regiones.");
    }
}
