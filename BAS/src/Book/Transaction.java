/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.time.*;
import Exceptions.*;
/**
 *
 * @author ridri
 */
public class Transaction {
    private BookInStock bookSold;
    private String customerName;
    private LocalDateTime dateOfTrans;
    private int copiesSold;
    private String transId;
    private String customerMail;
    private long customerPhone;
    private String customerAddress;
    private String clerkId;
    
    public Transaction(BookInStock bs, int copiesSold, LocalDateTime date, String customerName, String customerAddress,String customerMail, long customerPhone, String clerkId) throws InvalidPhoneException {
        if(bs == null || date == null || clerkId == null)
            throw new NullPointerException();
        this.bookSold = bs;
        this.copiesSold = copiesSold;
        this.dateOfTrans = date;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerMail = customerMail;
        if(InvalidPhoneException.checkValidPhone(customerPhone))
            this.customerPhone = customerPhone;
        this.clerkId = clerkId;
        
        //create transId from database
    }
    public int getCopiesSold () {
        return copiesSold;
    }
    public String getCustomerName() {
        return customerName;
    }
    public LocalDateTime getDateOfTrans() {
        return dateOfTrans;
    }
    public BookInStock getBookSold() {
        return bookSold;
    }
    public String getTransId() {
        return transId;
    }
    public double getTotalCost() {
        return bookSold.getSellingPrice() * copiesSold;
    }
    public String getCustomerAddress() {
        return customerAddress;
    }
    public String getCustomerMail() {
        return customerMail;
    }
    public String getCustomerPhone() {
        return Long.toString(customerPhone);
    }
}
