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
    
    //Customer class object
    private Customer customer;
    
    //Car class object
    private Car car;
    
    //RentalStatus enum object
    private RentalStatus status;
    
    //Class Constructor
    public Rental(Calendar rentDate, Calendar returnDate, RentalStatus status){
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.status = status;
    }
    
    
    //Info function overriden from Searchable interface
    //Input: None
    //Output: String Array of Strings containing the current objects
    //name, phone, and address values
    @Override
    public String[] info(){
        return new String[]{this.rentDate.toString(), this.returnDate.toString()};
    }
    
    //Contains function overriden from Searchable interface
    //Input: String containing the value to be compared against
    //Output: Boolean based on if the any of the value match the input
    @Override
    public boolean contains(String key){
        /*if(name.trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else if (phone.trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else if (address.trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else 
            return false;*/
        return true;
    }
    
    //Will most likely be removed during refactoring
    @Override
    public boolean matches(String key){
        //return this.name.equals(key);
        return true;
    }
    
    //TODO: Create new functions needed for the class
}
