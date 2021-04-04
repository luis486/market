package ui;
import model.*;
import exception.*;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);
    private MiniMarket mm = new MiniMarket();
    
    public void showMenu(){
        System.out.println("Bienvenido a su menu preferido!");
        System.out.println("Por favor ingrese una opcion");
        System.out.println("(1) Ingresar una persona");
        System.out.println("(2) Deseo saber cuantas personas han intentado ingresar a la tienda");
        System.out.println("(3) Salir del programa");
    }

    public String registerPerson(){
        String msg = "";
        System.out.println("Por favor ingrese su numero de identificacion");
        long id = sc.nextLong();
        System.out.println("Por favor ingrese su TIPO de documento");
        System.out.println("CC, PP, TI o CE");
        sc.nextLine();
        String type = sc.nextLine();
        TypeDocument td = TypeDocument.valueOf(type);
        try {
            mm.addPerson(id, td);
            msg = "The person was added succesfully";
        } catch (AgeException a) {
            a.printStackTrace();
        }
        catch (DayException d){
            d.printStackTrace();
        }
        return msg;
    }

    public String count(){
        return "The amount of people who try enter are: "+mm.getCount();
    }
        

    public void doOperation (int option){
        switch(option){
            case 1:
            registerPerson();
            break;

        case 2:
            System.out.println(count());
            break;
        case 3:
            System.out.println("Gracias por usar esta aplicacion");
            break;

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
        } while (option != 3);
    }

}
