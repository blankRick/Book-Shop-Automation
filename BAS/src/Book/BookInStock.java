/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.sql.*;
/**
 *
 * @author ridri
 */

public class BookInStock extends Book{
    private int copiesSold = 0;
    private int copyNum = 0;
    private String ISBN;
    private int noOfDaysToProcure = 0;
    private int rackNumber;
    public double sellingPrice = 0;
    private Vendor vendor;
    public BookInStock(String title, String author, String publisher, double costPrice, int copyNum, int noOfDaysToProcure, int rackNumber, double sellingPrice, Vendor vendor) {
        super(title, author, publisher, costPrice, true);
        this.copyNum = copyNum;
        this.noOfDaysToProcure = noOfDaysToProcure;
        this.rackNumber = rackNumber;
        this.sellingPrice = sellingPrice;
        this.vendor = vendor;
        
        //generating ISBN from database
        
        
    }
    public BookInStock(Book b, int copyNum, int rackNum, double sellingPrice, Vendor vendor, int noOfDaysToProcure) {
        super(b.title, b.author, b.publisher, b.costPrice, true);
        this.copyNum = copyNum;
        this.noOfDaysToProcure = noOfDaysToProcure;
        this.rackNumber = rackNumber;
        this.sellingPrice = sellingPrice;
        this.vendor = vendor;
        
        //generating ISBN from database
        
        
    }
    public BookInStock(String title, String author, String publisher, double costPrice, int rackNumber) {
        super(title, author, publisher, costPrice, true);
        this.rackNumber = rackNumber;
        
        //generating ISBN from Oracle database
        
        
    }
    public int getCopyNum() {
        return copyNum;
    }
    public void setCopyNum (int copyNum) {
        this.copyNum = copyNum;
    }
    public int getRackNum () {
        return rackNumber;
    }
    public void setRackNum(int rackNumber) {
        this.rackNumber = rackNumber;
    }
    public String getISBN() {
        return ISBN;
    }
    public double getProfit() {
        return this.copiesSold*this.sellingPrice;
    }
    public static BookInStock convertToBookInStock(BookNotInStock bns, int copyNum, int rackNum, double sellingPrice, Vendor vendor, int noOfDaysToProcure) {
        BookInStock temp_bs = new BookInStock(bns, copyNum, rackNum, sellingPrice, vendor, noOfDaysToProcure);
        return temp_bs;
    }
    public double getSellingPrice() {
        return sellingPrice;
    }
    public void setSellingPrice(double sellingPrice ) {
        this.sellingPrice = sellingPrice;
    }
    public int getNoOfDaysToProcure() {
        return this.noOfDaysToProcure;
    }
    public void setNoOfDaysToProcure(int noOfDaysToProcure) {
        this.noOfDaysToProcure = noOfDaysToProcure;
    }
    public Vendor getVendor() {
        return vendor;
    }
    public void setVendor (Vendor vendor ) {
        this.vendor = vendor;
    }
    public int getCopiesSold() {
        return copiesSold;
    }
    public void setCopiesSold(int copiesSold) {
        this.copiesSold = copiesSold;
    }
    
}