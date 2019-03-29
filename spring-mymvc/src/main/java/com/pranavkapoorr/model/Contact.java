package com.pranavkapoorr.model;

public class Contact {  
    private String firstname;  
    private String lastname;
    
    public Contact() {}
    public Contact(String firstName, String lastName) {
    	this.firstname = firstName;
    	this.lastname = lastName;
    }
      
    
    public String getFirstname() {  
        return firstname;  
    }  
    public String getLastname() {  
        return lastname;  
    }  
    public void setFirstname(String firstname) {  
        this.firstname = firstname;  
    }  
    public void setLastname(String lastname) {  
        this.lastname = lastname;  
    }  
      
}