package ui;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    
    public void showMenu(){
        System.out.println("Bienvenido a su menu preferido!");
        System.out.println("Por favor ingrese una opcion");
        System.out.println("(1) Ingresar una persona");
        System.out.println("(2) Deseo saber cuantas personas han intentado ingresar a la tienda");
        System.out.println("(3) Salir del programa");
    }

    public void doOperation (int option){
        switch(option){
            case 1:
            System.out.println();
            break;

        case 2:
            System.out.println();
            break;
        case 3:
            System.out.println("Gracias por usar esta aplicacion");

        default: 
            System.out.println("Error, opcion invalida, por favor digite otra opcion");
        }
    }
    
    public int readOption() {
        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }

    public void startProgram() {
        int option;
        do {
            showMenu();
            option = readOption();
            doOperation(option);
        } while (option != 11);
    }

}
