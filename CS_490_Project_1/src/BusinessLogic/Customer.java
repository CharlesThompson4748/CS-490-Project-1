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
public class Customer implements Searchable{
    //Class variables
    private String name;
    private String phone;
    private String address;
    
    //Class Constructor 
    public Customer(String name, String phone, String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }
    
    //Info function overriden from Searchable interface
    //Input: None
    //Output: String Array of Strings containing the current objects
    //name, phone, and address values
    @Override
    public String[] info(){
        return new String[]{this.name, this.phone, this.address};
    }
    
    //Contains function overriden from Searchable interface
    //Input: String containing the value to be compared against
    //Output: Boolean based on if the any of the value match the input
    @Override
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
    
    //Will most likely be removed during refactoring
    @Override
    public boolean matches(String key){
        return this.name.equals(key);
    }
}
