/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringExemple;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1795928
 */
public class Professor extends Person {
    List<Student> students = new ArrayList<Student>();
    String photoUrl;
    
    public Professor(String lastName, String firstName){
        String employeeId = lastName.toUpperCase().trim().substring(1,3)
                + firstName.toUpperCase().trim().substring(1,3);
        System.out.println("New professor: " + employeeId);
    }
    
    public void setPhotoUrl(String photoName){
        this.photoUrl = "/photos/professors/mad/" + photoName;
    }
}
