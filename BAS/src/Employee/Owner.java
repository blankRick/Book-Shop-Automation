/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import Exceptions.InvalidPhoneException;

/**
 *
 * @author ridri
 */
public class Owner extends Employee{
    
    public Owner(String emp_id, String name, String address, double salary, long phoneNo, String email) throws InvalidPhoneException {
        super(emp_id, name, address, salary, phoneNo, email);
        super.position = "OWN";
    }
    
}
