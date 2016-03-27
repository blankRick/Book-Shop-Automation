/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

/**
 *
 * @author ridri
 */
public class Printer {
    public String printBill(Transaction t) {
        return "Transaction ID :" + t.getTransId()+
                "\nCustomer Name : " + t.getCustomerName()+
                "\nCustomer Address : " + t.getCustomerAddress()+
                "\nCustomer Mail : " + t.getCustomerMail()+
                "\nCustomer Phone : " + t.getCustomerPhone()+
                "\nDate : " + t.getDateOfTrans().toString()+
                "\nBook Sold : " + t.getBookSold().title+
                "\nCopies Sold : " + t.getCopiesSold()+
                "\nTotal Cost : " + t.getTotalCost();
    }
}
