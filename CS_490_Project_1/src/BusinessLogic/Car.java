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
    private String id;
    private CarSpec specs;
            
    public Car(String id){
        this.id = id;
    }
    
    @Override
    public boolean contains(String key){
        if(id.trim().toUpperCase().contains(key.trim().toUpperCase()))
            return true;
        else 
            return false;
    }
    
    @Override
    public boolean matches(String key){
        return this.id.equals(key);
    }
    
    @Override
    public String[] info(){
        return new String[]{this.id};
    }
    
    public CarSpec addSpecs(String make, String model, int year, CarSize size){
        specs = new CarSpec(make, model, year, size);
        return specs;
    }
}
