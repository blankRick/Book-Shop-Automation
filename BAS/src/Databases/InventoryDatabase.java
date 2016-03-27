/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Databases;

import Book.*;

/**
 *
 * @author ridri
 */
public class InventoryDatabase {
    private String generateId(BookInStock b) {
        String code = b.title + b.author + b.publisher ;
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
        System.out.println("ISBN" + referenceCode.substring(referenceCode.length()-8, referenceCode.length()));
        return "ISBN" + referenceCode.substring(referenceCode.length()-8, referenceCode.length());
    }
}
