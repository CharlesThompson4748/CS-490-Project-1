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
    private enum status {RENTED, RETURNED};
    
    public Rental(Calendar rentDate, Calendar returnDate, enum status){
        this.rentDate = rentdate;
        this.returnDate = returnDate;
        this.status = status;
    }
    
}
