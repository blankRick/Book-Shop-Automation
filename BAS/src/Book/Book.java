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
abstract public class Book {
    public String title;
    public String author;
    public String publisher;
    public double costPrice = 0;
    public boolean isProcured = false;
    
    public Book(String title, String author, String publisher, double costPrice, boolean isProcured) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.costPrice = costPrice;
        this.isProcured = isProcured;
    }
    public boolean getAvailabity() {
        return isProcured;
    }
}
