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
        Controller controller = Controller.instance();
        
        //controller.addCar("21575", "Dodge", "Ram 1500", 2008, LARGE);
        
        controller.addCustomer("Charles Thompson", "235-985-7811", "411 Antioch Rd.");
        controller.addCustomer("Katrina Flynn", "481-624-8000", "123 Some Rd.");
        controller.addCustomer("Brandon Buckalew", "785-123-7802", "5780 Main St.");
        controller.addCustomer("Phillip J. Fry", "001-231-2000", "2999 Future Ln.");
        controller.addCustomer("Bender Bending Rodriguez", "470-010-0100", "1800 King Dr.");
        controller.addCustomer("John A. Zoidberg", "158-0245-9752", "200 DumbsterOutBack Rd.");
        
        CustomerFrame frame=new CustomerFrame();
        frame.setVisible(true);
    }
}
