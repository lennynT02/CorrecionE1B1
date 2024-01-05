package CorrecionE1B1;

public class Costa extends Comida_Tipica {
    double temperatura;
    Costa(String nombre, double temperatura){
        super(nombre);
        this.temperatura = temperatura;
    }
    public Costa(){
        
    }
    public double getTemperatura(){
        return temperatura;
    }
    public void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }
    public void temperadura(){
        System.out.println("La temperatura de la costa es de: " + temperatura + "°C");
    }
    
}
