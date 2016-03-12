/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.Calendar;

/**
 *
 * @author charlie
 */
public class Rental implements Searchable{
    //Class variables
    private Calendar rentDate;
    private Calendar returnDate;
    private String customerName;
    private String carID;
    
    //RentalStatus enum object
    private RentalStatus status;
    
    //Class Constructor
    public Rental(Calendar rentDate, Calendar returnDate, String customerName, String carID){
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.customerName = customerName;
        this.carID = carID;
    }
    
    //Contains function overriden from Searchable interface
    //Input: String containing the value to be compared against
    //Output: Boolean based on if the any of the value match the input
    @Override
    public boolean contains(String key){
        if(carID.trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else if(this.customerName.trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else 
            return false;
    }
    
    //Will most likely be removed during refactoring
    @Override
    public boolean matches(String key){
        return this.carID.equals(key);
    }
    
    //Info function overriden from Searchable interface
    //Input: None
    //Output: String Array of Strings containing the current objects
    //name, phone, and address values
    @Override
    public String[] info(){
        return new String[]{this.rentDate.toString(), this.returnDate.toString(), this.status.toString()};
    }
    
    public RentalStatus getStatus(){
        return this.status;
    }
    
    public void setStatus(RentalStatus status){
        this.status = status;
    }
    
    //TODO: Create new functions needed for the class
}
