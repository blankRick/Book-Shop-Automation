/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;
import Exceptions.*;
/**
 *
 * @author ridri
 */
public class Vendor {
    private String name;
    private String address;
    private long phoneNo;
    
    public Vendor(String name, String address, long phoneNo) throws InvalidPhoneException {
        this.name = name;
        this.address = address;
        if(InvalidPhoneException.checkValidPhone(phoneNo))
            this.phoneNo = phoneNo;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(long phoneNo) throws InvalidPhoneException {
        if(InvalidPhoneException.checkValidPhone(phoneNo))
            this.phoneNo = phoneNo;
    }
}
