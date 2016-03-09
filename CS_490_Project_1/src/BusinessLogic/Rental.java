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
    private Calendar rentDate;
    private Calendar returnDate;
    private RentalStatus status;
    
    public Rental(Calendar rentDate, Calendar returnDate, RentalStatus status){
        this.rentDate = rentDate;
        this.returnDate = returnDate;
        this.status = status;
    }
    
    
    
}
