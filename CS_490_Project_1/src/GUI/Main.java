/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BusinessLogic.Controller;

/**
 *
 * @author charlie
 */
public class Main {
    public static void main(String[] args){
        //Creating new controller object
        Controller controller = Controller.instance();
        
        //Adding new cars
        controller.addCar("21575", "Dodge", "Ram 1500", 2008, "Large");
        controller.addCar("21664", "Dodge", "Dart", 2010, "Small");
        controller.addCar("85564", "Ford", "Focus", 2012, "Midsize");
        controller.addCar("85565", "Ford", "Focus", 2013, "Midsize");
        controller.addCar("85566", "Ford", "Mustang", 2015, "Midsize");
        controller.addCar("31789", "Nissan", "Altima", 2012, "Small");
        controller.addCar("31767", "Nissan", "Altima", 2013, "Small");
        controller.addCar("11134", "Volks Wagen", "Golf GTI", 2014, "Midsize");
        controller.addCar("12457", "Volks Wagen", "Passat", 2015, "Large");
        controller.addCar("56481", "Chevy", "Cruze", 2015, "Midsize");
        controller.addCar("56794", "Chevy", "Spark", 2014, "Small");
        controller.addCar("53231", "Chevy", "Tahoe", 2013, "Large");
        
        //Adding new customers
        controller.addCustomer("Charles Thompson", "235-985-7811", "411 Antioch Rd.");
        controller.addCustomer("Katrina Flynn", "481-624-8000", "123 Some Rd.");
        controller.addCustomer("Brandon Buckalew", "785-123-7802", "5780 Main St.");
        controller.addCustomer("Phillip J. Fry", "001-231-2000", "2999 Future Ln.");
        controller.addCustomer("Bender Bending Rodriguez", "470-010-0100", "1800 King Dr.");
        controller.addCustomer("John A. Zoidberg", "158-0245-9752", "200 DumbsterOutBack Rd.");
        
        //Creating customer frame and setting it visible
        CustomerFrame frame=new CustomerFrame();
        frame.setVisible(true);
    }
}
