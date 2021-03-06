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
public class Car implements Searchable{
    //Class variables
    private String id;
    
    //CarSpec class object
    private CarSpec specs;
    private RentalStatus status;
    //Class constructor
    
    public Car(String id){
        this.id = id;
    }
    
    //Contains function overriden from Searchable interface
    //Input: String containing the value to be compared against
    //Output: Boolean based on if the any of the value match the input
    @Override
    public boolean contains(String key){
        if(id.trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else if(this.specs.specInfo()[0].trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else if(this.specs.specInfo()[1].trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else if(this.specs.specInfo()[2].trim().toUpperCase().contains(key.trim().toUpperCase()))
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
        return new String[]{null, this.id, this.specs.specInfo()[0], this.specs.specInfo()[1], this.specs.specInfo()[2],
            this.specs.specInfo()[3]};
    }
    
    @Override
    public String getID(){
        return this.id;
    }
    //Fucntion to add specs to the current car object
    //Input: String for make and model, int for year, and CarSize enum object 
    public CarSpec addSpecs(String make, String model, int year, CarSize size){
        //Create new CarSpec object
        specs = new CarSpec(make, model, year, size);
        return specs;
    }
    
    public void setRentalStatus(RentalStatus status){
        this.status = status;
    }
}
