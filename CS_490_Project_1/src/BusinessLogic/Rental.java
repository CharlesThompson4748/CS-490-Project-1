/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.Calendar;
import java.text.SimpleDateFormat;

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
    
    
    //Class Constructor
    public Rental(Calendar rentDate, Calendar returnDate, String customerName, String carID){
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.customerName = customerName;
        this.carID = carID;
    }
    
    public String getRentalDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String date = dateFormat.format(rentDate.getTime());
        return date;
    }
    
    public String getReturnDate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String date = dateFormat.format(returnDate.getTime());
        return date;
    }
    
    @Override
    public String getID(){
        return this.carID;
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
    
    //Info function overriden from Searchable interface
    //Input: None
    //Output: String Array of Strings containing the current objects
    //name, phone, and address values
    @Override
    public String[] info(){
        return new String[]{this.getRentalDate(), this.getReturnDate(), this.carID};
    }
   
    //TODO: Create new functions needed for the class
}
