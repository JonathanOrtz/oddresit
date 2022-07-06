/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooddresit.model;

/**
 *
 * @author jona1
 */
public class User {
    
    private String name, lastName;
    private String email;
    private String userName;
    private String passWord;
    private boolean administrator;
    
    public User(String name, String lastName, String email, String userName, String password, boolean isAdmin){
     
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.userName = userName;
        this.passWord = password;
        this.administrator = isAdmin; 
        
    }
    
    // getters
    
    public String getName(){
        return this.name;
    }
    
    
}
