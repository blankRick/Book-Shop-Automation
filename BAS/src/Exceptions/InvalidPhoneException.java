/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author ridri
 */
public class InvalidPhoneException extends Exception {
    public InvalidPhoneException() {
        super("Phone no. is invalid");
    }
    public static boolean checkValidPhone(long phoneNo) throws InvalidPhoneException {
        if(phoneNo / 1000000000 > 0 && phoneNo / 1000000000 < 10)
            return true;
        else 
            throw new InvalidPhoneException();
    }
}
