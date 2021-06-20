/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sample01;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author user
 */
public class Sample01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // BAI TAP A: ACCOUNT
        Account a1 = new Account();
        a1.UserName = "tungnt";        
        a1.FullName = "Ngo Thanh Tung";
        a1.Email = "tungnt@softech.vn";
        
        a1.display();
        a1.resetPassword();
        a1.increaseLevel();
        a1.display();        
        
        
        // BAI TAP B: STUDENT
        // LUU Y: Phan Import o phia tren:
        // De dung mang trong JAVA, can phai import 2 package: java.util.ArrayList va java.util.List;
        List<Student> list = new ArrayList<>();
        Student s1 = new Student();
        s1.Code = "CP01";
        s1.FullName = "John";
        s1.YearOfBirth = 1990;
        list.add(s1); // them vao mang list
        
        Student s2 = new Student();
        s2.Code = "CP02";
        s2.FullName = "Peter";
        s2.YearOfBirth = 1991;
        list.add(s2); // them vao mang list
        
        Student s3 = new Student();
        s3.Code = "CP03";
        s3.FullName = "Paul";
        s3.YearOfBirth = 1989;
        list.add(s3); // them vao mang list
        

        // HIEN THI DANH SACH CAC SINH VIEN CO NAM SINH SAU 1990
        for (int i = 0; i < list.size(); i++) {
            // LUU Y: Method get(i) de lay sinh vien thu i trong mang list.
            if (list.get(i).YearOfBirth >= 1990) {
                list.get(i).display();
            }
        } 
        
    }
    
}
