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
public class Account {
    public String UserName;
    public String Password;
    public String FullName;
    public String Email;
    public int Level;
    
    public Account() {
        this.Password = "123456789";
        this.Level = 1;
    }
    
    public void display() {
        System.out.println("****************************");
        System.out.println("Username: " + this.UserName);
        System.out.println("Fullname: " + this.FullName);
        System.out.println("Password: " + this.Password);
        System.out.println("Email: " + this.Email);
        System.out.println("Level: " + this.Level);
    
    }
    public void resetPassword() {
        this.Password = "123456789";
    }
    
    public void increaseLevel() {
        this.Level = this.Level + 1;
    }
}
