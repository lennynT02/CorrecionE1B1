package CorrecionE1B1;
import java.util.Scanner;

public class Provincia extends Costa {
    String nombrePro;
    public Provincia(String nombre, double temperatura){
        super(nombre, temperatura);
    }
    public Provincia() {
    }
    public String getNombrePro(){
        return nombrePro;
    }
    public void setNombrePro(String nombrePro){
        this.nombrePro = nombrePro;
    }
    public void preguntarPro(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la provincia ");
        nombrePro = sc.nextLine();
    }

}
