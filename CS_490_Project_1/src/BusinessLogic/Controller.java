/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.Calendar;
import java.util.LinkedList;

/**
 *
 * @author charlie
 */
public class Controller {
    //Creating static Controller object for Singleton class
    private static Controller Singleton;
    
    //Class lists
    private LinkedList<Searchable> customers = new LinkedList<Searchable>();
    private LinkedList<Searchable> cars = new LinkedList<Searchable>();
    private LinkedList<Searchable> rented = new  LinkedList<Searchable>();
    private LinkedList<Searchable> returned = new  LinkedList<Searchable>();
    
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
            //No match found. Default value to enum RENTED
            default:
                return RentalStatus.RENTED;
        }
    }
    
    //Function to create a new Rental object and add to the List of customers
    //Input: TODO
    //Output: Rental object
    public Rental addRental(RentalStatus status, Calendar rentDate, Calendar returnDate, String customerName, String carID) {  
        Rental rental = new Rental(rentDate, returnDate, status);
        return rental;
    }
    
    //Function to create a new Customer object and add to the List of customers
    //Input: Strings for the customer name, phone, and address
    //Output: Customer object
    public Customer addCustomer(String name, String phone, String address) {
        //Convert name to lower (error checking that will be changed)
        try {
            name.toLowerCase();
        }
        catch (NumberFormatException e) {
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
        LinkedList<String[]> result = new LinkedList<String[]>();
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
        LinkedList<String[]> result = new LinkedList<String[]>();
        //Search the cars list for strings that contain key 
        for(Searchable car:cars) {
            if(car.contains(key))
                //Match found adding to list
                result.add(car.info());
        }
        return result;
    }
    
}
