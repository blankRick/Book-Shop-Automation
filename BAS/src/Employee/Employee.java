/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;
import Exceptions.*;
/**
 *
 * @author ridri
 */
abstract public class Employee {
    private String emp_id;
    private String name;
    private String address;
    private double salary;
    private long phoneNo;
    private String email = null;
    protected String position;
    
    public Employee(String emp_id, String name, String address, double salary, long phoneNo, String email) throws InvalidPhoneException {
        this.emp_id = emp_id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        if(InvalidPhoneException.checkValidPhone(phoneNo))
            this.phoneNo = phoneNo;
        this.email = email;
    }
    public Employee(String emp_id, String name, String address, double salary, long phoneNo) throws InvalidPhoneException {
        this.emp_id = emp_id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        if(InvalidPhoneException.checkValidPhone(phoneNo))
            this.phoneNo = phoneNo;
    }

    public void setEmp_id(String emp_id) {
        this.emp_id = emp_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmp_id() {
        return emp_id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getPosition() {
        return position;
    }
    
    
    
    
}
