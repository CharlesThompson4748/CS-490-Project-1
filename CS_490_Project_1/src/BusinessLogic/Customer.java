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
public class Customer {
    private String name;
    private String phone;
    private String address;
    
    public Customer(String name, String phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
    
    public String[] customerInfo(String key){
        return new String[]{this.name, this.phone, this.address};
    }
    
    public boolean contains(String key){
        if(name.trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else if (phone.trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else if (address.trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else 
            return false;
    }
    
}
