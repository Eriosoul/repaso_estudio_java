/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant.restaurant.VIEW;

import java.util.ArrayList;
import java.util.Scanner;
import restaurnat.MODEL.Table;

/**
 *
 * @author Andrei
 */
public class ViewRestaurant {
    public Table restaurnatTable(){
        Scanner keyboard = new Scanner(System.in);
        Table reservate = new Table();
        System.out.println("Introduzca el numero de la mesa: ");
        reservate.setNumTable(keyboard.nextInt());
        keyboard.nextLine();
        System.out.println("Introduce el primer plato: ");
        reservate.setFerstPlate(keyboard.nextLine());
        System.out.println("Introduce el segundo plato: ");
        reservate.setSecondPlate(keyboard.nextLine());
        System.out.println("Introduce el postre: ");
        reservate.setDesert(keyboard.nextLine());
        System.out.println("Introduce la bebida: ");
        reservate.setDrinks(keyboard.nextLine());
        return reservate;
    }
    
    // append the info in the array list
    
    public void appendData(ArrayList<Table> arrListTable){
        for (Table actual: arrListTable){
            System.out.println("Numero de mesa : " + actual.getNumTable());
            System.out.println("Numero de mesa : " + actual.getFerstPlate());
            System.out.println("Numero de mesa : " + actual.getSecondPlate());
            System.out.println("Numero de mesa : " + actual.getDesert());
            System.out.println("Numero de mesa : " + actual.getDrinks());
        }
    }
    
}
