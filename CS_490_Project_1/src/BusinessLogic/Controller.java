/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author charlie
 */
public class Controller {
    //Creating static Controller object for Singleton class
    private static Controller Singleton;
    private String customerName;
    private Car car;
    
    //Class lists
    private LinkedList<Searchable> customers = new LinkedList<>();
    private LinkedList<Searchable> cars = new LinkedList<>();
    private LinkedList<Searchable> rented = new  LinkedList<>();
    private LinkedList<Searchable> returned = new  LinkedList<>();
    
    //Class Constructor
    private Controller() {}

    //Function to return the Singleton class object
    //Input: None
    //Output: Class Singleton object
    public static Controller instance() {
        //Determine if a class object has been created.
        if(Singleton == null) {
            //No class object created yet. Create one.
            Singleton = new Controller();
        }
        //Return the Singleton class object
        return Singleton;
    }
    
    public void setCustomerName(String name){
        customerName = name;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public void setCarToRented(String carID, String status){
        for(Searchable car:cars){
            if(car.contains(carID))
                getRentalStatus(status);
        }
    }
    
    //Function to convert a String to an RentalStatus enum object
    //Input: String status
    //Ouput: RentalStatus enum object
    private CarSize getCarSize(String carSize) {
        //Remove any whitespace
        String type = carSize.trim();
        //Compare input to specific values
        switch(type) {
            case "Small":
                //Return the enum object
                return CarSize.SMALL;
            case "Midsize":
                return CarSize.MIDSIZE;
            case "Large":
                return CarSize.LARGE;
            //No match found. Default value to enum MIDSIZE
            default:
                return CarSize.MIDSIZE;
        }
    }
    
    //Function to convert a String to an RentalStatus enum object
    //Input: String status
    //Ouput: RentalStatus enum object
    private RentalStatus getRentalStatus(String status) {
        //Remove any whitespace
        String type = status.trim();
        //Compare input to specific values
        switch(type) {
            case "Rented":
                //Return the enum object
                return RentalStatus.RENTED;
            case "Returned":
                return RentalStatus.RETURNED;
            //No match found. Default value to enum RETURNED
            default:
                return RentalStatus.RETURNED;
        }
    }
    
    //Function to create a new Rental object and add to the List of customers
    //Input: TODO
    //Output: Rental object
    public Rental addRental(Calendar rentDate, Calendar returnDate, String customerName, String carID) {  
        Rental rental = new Rental(rentDate, returnDate, customerName, carID);
        
        rented.add(rental);
        return rental;
    }
    
    public void returnRental(String customer){
        //searchRentals(customer);
    }
    
    
    //Function to create a new Customer object and add to the List of customers
    //Input: Strings for the customer name, phone, and address
    //Output: Customer object
    public Customer addCustomer(String name, String phone, String address) {
        //Convert name to lower (error checking that will be changed)
        try {
            name.toLowerCase();
        }
        catch (Exception e) {
            System.out.println("Exception thrown  :" + e);
        }
        //Creating new Customer object
        Customer newCustomer = new Customer(name, phone, address);
        //Adding new object to customer list
        customers.add(newCustomer);
        return newCustomer;
    }
    
    //Function to create a new Car object and add to the List of cars
    //Input: Strings for the id, make, model, and size of the car as well as
    //an interger for the year
    //Output: Car object
    public Car addCar(String id, String make, String model, int year, String size) {
        //Create new Car object
        Car newCar = new Car(id);
        //Convert the size to an enum
        CarSize sizeFormatted = getCarSize(size);
        //Create an object for the car specs
        newCar.addSpecs(make, model, year, sizeFormatted);
        //Add the car to the list
        cars.add(newCar);
        return newCar;
    }
    
    //Function to search the customers list for a specific String value
    //Input: String key for comparison value
    //Output: LinkedList of String arrays of all the values that contained the 
    //input value
    public LinkedList<String[]> searchCustomers(String key) {
        //Create new list to be returned
        LinkedList<String[]> result = new LinkedList<>();
        //Search the customers list for strings that contain key 
        for(Searchable customer:customers) {
            if(customer.contains(key))
                //Match found adding to list
                result.add(customer.info());
        }
        return result;
    }
    
    //Function to search the cars list for a specific String value
    //Input: String key for comparison value
    //Output: LinkedList of String arrays of all the values that contained the 
    //input value
    public LinkedList<String[]> searchCars(String key) {
        //Create new list to be returned
        LinkedList<String[]> result = new LinkedList<>();
        //Search the cars list for strings that contain key 
        for(Searchable car:cars) {
            if(car.contains(key))
                //Match found adding to list
                result.add(car.info());
        }
        return result;
    }
    
    public LinkedList<String[]> searchRentals(String key) {
        //Create new list to be returned
        LinkedList<String[]> result = new LinkedList<>();
        //Search the cars list for strings that contain key 
        for(Searchable car:rented) {
            if(car.contains(key))
                //Match found adding to list
                
                result.add(car.info());
        }
        return result;
    }
    
}
