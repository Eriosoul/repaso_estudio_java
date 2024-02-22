/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurant;

import java.util.ArrayList;
import restaurant.restaurant.VIEW.ViewRestaurant;
import restaurnat.MODEL.Table;

/**
 *
 * @author Andrei
 */
public class ManagementRestaurant {
    
    public void addData() {
        // array how has the objects from class Table
        ArrayList<Table> arrListTable = new ArrayList<Table>();
        
        Table actualTable = new Table();
        // object to acced in viewRestaurant modules
        ViewRestaurant v = new ViewRestaurant();
        actualTable = v.restaurnatTable();
        // append data from actual table to arrayList
        arrListTable.add(actualTable);
    }    
}
