/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample01;

/**
 *
 * @author user
 */
public class Student {
    public String Code;
    public String FullName;
    public String Address;
    public String Email;
    public String Phone;
    public int YearOfBirth;
        
    public void display() {
        System.out.println("****************************");
        System.out.println("Code: " + this.Code);
        System.out.println("Fullname: " + this.FullName);        
        System.out.println("Email: " + this.Email);
        System.out.println("Phone: " + this.Phone);
        System.out.println("YearOfBirth: " + this.YearOfBirth);    
    }    
}
