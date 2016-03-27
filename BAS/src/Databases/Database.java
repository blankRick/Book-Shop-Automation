/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Databases;

import Book.*;
import Employee.*;
import java.time.*;
import java.util.*;

/**
 *
 * @author ridri
 */
public class Database {
    private SalesDatabase sales;
    private EmployeeDatabase employees;
    private InventoryDatabase inventory;
    
    public Database(String ownerName, String ownerAdd, long ownerPhone) {
        
    }
    public String addEmployee(Employee employee, String managerId) {
        return null;
    }
    public boolean delEmployee(String empId, String managerId) {
        return false;
    }
    public String[] getEmployeeList(String managerId) {
        return null;
    }
    public String addToInventory(String title, String author, String publisher, double costPrice, int copyNum, int rackNum, Vendor vendor, String empId) {
        return null;
    }
    public String addTransaction(BookInStock bs,int copyNum,String cusName, LocalDateTime date, String cusAddress, long cusPhone, String clerkId, String customerEmail) {
        return null;
    }
    public ArrayList<Transaction> getTransaction(String managerId, String cusName, LocalDateTime date, String transId) {
        return null;
    }
    
    public String addManager(Manager manager, String ownerId) {
        return null;
    }
    public ArrayList<String> getAllTransactions(String managerId) {
        return null;
    }
    public String generateSalesStatistics(String ownerId) {
        return null;
    }
    public String changeOwner(String ownerId) {
        return null;
    }
    public boolean removeBook(String ISBN, int copyNum, String empId) {
        return false;
    }
    public BookInStock searchBookInStock(String ISBN, String title, String author, String publish) {
        return null;
    }
    public BookInStock changeBookInStock(String ISBN, BookInStock newBsm, String empId) {
        return null;
    }
    public BookNotInStock searchBookNotInStock(String title, String author, String publish, String managerId) {
        return null;
    }
    public ArrayList<BookNotInStock> getBooksBelowThreshold(String ownerId) {
        return null;
    }
}
