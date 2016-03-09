/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

/**
 *
 * @author charlie
 */
public class CarSpec {
    private String make;
    private String model;
    private int year;
    private CarSize size; 
    
    public CarSpec(String make, String model, int year, CarSize size){
        this.make = make;
        this.model = model;
        this.year = year;
        this.size = size;
    }
    
    public String[] specInfo (){
        return new String[]{this.make, this.model, Integer.toString(this.year)};
    }
}
