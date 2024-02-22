/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package restaurant;

import java.util.ArrayList;
import restaurant.restaurant.VIEW.ViewRestaurant;
import restaurnat.MODEL.Table;

/**
 *
 * @author Andrei
 */
public class Restaurant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Table> arrListTable = new ArrayList<>();
        // TODO code application logic here
        
        int person = 0;
        
        ManagementRestaurant manage = new ManagementRestaurant();
        ViewRestaurant view = new ViewRestaurant();
        
        do {
            manage.addData();
            person ++;
            if (person % 5 == 0){
                view.appendData(arrListTable);
            }
        }while(person != 2); 
    }
}
