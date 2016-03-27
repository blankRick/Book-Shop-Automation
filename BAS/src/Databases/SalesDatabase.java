/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Databases;

import Book.*;
import Employee.Employee;

/**
 *
 * @author ridri
 */
public class SalesDatabase {
    
    public static int thresholdForBooks = 1;
    public static boolean addToInventory(BookNotInStock bns, int copyNum, int rackNum, Vendor vendor) {
        return false;
    }
    public static void setThresholdForBooks(int n) {
        thresholdForBooks = n;
    }
    public BookInStock searchBookInStock(String ISBN, String title, String author, String publisher) {
        return null;
    }
    public boolean removeBook(String ISBN, int copyNum) {
        return false;
    }
    public String generateId(Transaction t) {
        String code = t.getBookSold().getISBN()+ t.getCustomerName() + t.getDateOfTrans().toString();
        code = code.replaceAll(" ", "");
        int n = code.length();
        StringBuilder referenceCode;
        
        int encodedNumber = (n-1) * (11 + 26);
        for(int i = 0 ; i < n ; i++) {
            if(Character.isDigit(code.charAt(i))) {
                encodedNumber += (n-i) * (Character.getNumericValue(code.charAt(i)) - 1);
            }
            if(Character.isLetter(code.charAt(i))) {
                encodedNumber += (n-i) * ((code.charAt(i) - 'a' )+ 10);
            }
        }
        referenceCode = new StringBuilder("00000000" + Long.toString(encodedNumber));
        System.out.println("TRN" + referenceCode.substring(referenceCode.length()-8, referenceCode.length()));
        return "TRN" + referenceCode.substring(referenceCode.length()-8, referenceCode.length());
    }
}
