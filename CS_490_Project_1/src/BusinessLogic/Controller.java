/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.LinkedList;

/**
 *
 * @author charlie
 */
public class Controller {
    private static Controller Singleton;
    private LinkedList<Searchable> customers = new LinkedList<Searchable>();
    private LinkedList<Searchable> cars = new LinkedList<Searchable>();
    private Controller(){};
   
    public static Controller instance(){
       if(Singleton==null) {
            Singleton=new Controller();
        }
       return Singleton;
    }
   
    public Customer addCustomer(String name, String phone, String address){
        try {
            name.toLowerCase();
        }
        catch (NumberFormatException e){
            System.out.println("Exception thrown  :" + e);
        }
        
        Customer newCourse = new Customer(name, phone, address);
        customers.add(newCourse);
        return newCourse;
    }
    
    private CarSize getCarSize(String carSize){
        String type=carSize.trim().toUpperCase();
        switch(type){
            case "Small":
                return CarSize.SMALL;
            case "Midsize":
                return CarSize.MIDSIZE;
            case "Large":
                return CarSize.LARGE;
            default:
                return CarSize.MIDSIZE;
        }
    }
   
    public Car addCar(String id, String make, String model, int year, String size){
        Car newCar = new Car(id);
        CarSize sizeFormatted = getCarSize(size);
        newCar.addSpecs(make, model, year, sizeFormatted);
        cars.add(newCar);
        return newCar;
    }
    
    public LinkedList<String[]> searchCustomers(String key){
        LinkedList<String[]> result=new LinkedList<String[]>();
        for(Searchable customer:customers){
            if(customer.contains(key))
                result.add(customer.info());
        }
        return result;
    }
    
    public LinkedList<String[]> searchCars(String key){
        LinkedList<String[]> result=new LinkedList<String[]>();
        for(Searchable car:cars){
            if(car.contains(key))
                result.add(car.info());
        }
        return result;
    }
}
