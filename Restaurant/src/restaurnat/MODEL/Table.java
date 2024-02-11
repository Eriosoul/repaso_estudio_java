/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurnat.MODEL;

/**
 *
 * @author Andrei
 */
public class Table {
    private int numTable;
    private String ferstPlate;
    private String secondPlate;
    private String desert;
    private String drinks;
    
    public Table(){
        numTable = 0;
        ferstPlate = "";
        secondPlate = "";
        desert = "";
        drinks = "";
    }
    
    public Table(int numTable, String ferstPlate, String secondPlate, String desert, String drinks){
        this.numTable = numTable;
        this.ferstPlate = ferstPlate;
        this.secondPlate = secondPlate;
        this.desert = desert;
        this.drinks = drinks;
    }

    public int getNumTable() {
        return numTable;
    }

    public void setNumTable(int numTable) {
        this.numTable = numTable;
    }

    public String getFerstPlate() {
        return ferstPlate;
    }

    public void setFerstPlate(String ferstPlate) {
        this.ferstPlate = ferstPlate;
    }

    public String getSecondPlate() {
        return secondPlate;
    }

    public void setSecondPlate(String secondPlate) {
        this.secondPlate = secondPlate;
    }

    public String getDesert() {
        return desert;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public String getDrinks() {
        return drinks;
    }

    public void setDrinks(String drinks) {
        this.drinks = drinks;
    }
    
    
    
}
