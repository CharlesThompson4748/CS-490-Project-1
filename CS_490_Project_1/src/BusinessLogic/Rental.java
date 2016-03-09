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
public class Rental {
    //Class variables
    private Calendar rentDate;
    private Calendar returnDate;
    
    //RentalStatus enum object
    private RentalStatus status;
    
    //Class Constructor
    public Rental(Calendar rentDate, Calendar returnDate, RentalStatus status){
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.status = status;
    }
    
    //TODO: Create new functions needed for the class
    
    
}
