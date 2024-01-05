package CorrecionE1B1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Comida_Costa[] comidas_costa = new Comida_Costa[5]; 
        Scanner letra = new Scanner(System.in);
        for (int i = 0; i < comidas_costa.length; i++) {
            comidas_costa[i] = new Comida_Costa();
            System.out.println("Comida " + (i+1)+"\nIngrese el nombre de la comida: ");
            comidas_costa[i].setNombre(letra.nextLine());
            System.out.println("Ingrese el sabor de la comida: ");
            comidas_costa[i].setSabor(letra.nextLine());
            System.out.println("Ingrese el precio de la comida: ");
            comidas_costa[i].setPrecio(letra.nextDouble());
            letra.nextLine();
            comidas_costa[i].preguntarPro();
        }  
        letra.close();
        for (int i = 0; i < comidas_costa.length; i++) {
            System.out.println("Comida " + (i+1)+"\nNombre: " + comidas_costa[i].getNombre() + "\nPrecio: " + comidas_costa[i].getPrecio() + "$" + "\nSabor: " + comidas_costa[i].getSabor() + "\nProvincia: " + comidas_costa[i].getNombrePro());
            comidas_costa[i].mensaje();
        }
    }
}
