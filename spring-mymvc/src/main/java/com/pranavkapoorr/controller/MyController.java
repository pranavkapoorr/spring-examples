package com.pranavkapoorr.controller;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import com.pranavkapoorr.model.Contact;

@RestController  
public class MyController {
	private final List<Contact> contacts = new ArrayList<Contact>();
	
	public MyController(){
		contacts.add(new Contact("Pranav","Kapoor"));
		contacts.add(new Contact("Aarav","Kapoor"));
	}
	
    @GetMapping("/hello")  
    public String helloWorld() {  
        return "Hello World, Spring MVC with embeded tomcat";   
    }
    @GetMapping("/api/contacts")
    public List<Contact> getContacts() {
        return contacts;
    }
    @PostMapping("/api/contact")
    public void addContact(@RequestBody Contact contact) {
        contacts.add(contact);
    }

    @DeleteMapping("/{index}")
    public void deleteContact(@PathVariable int index) {
        contacts.remove(index);
    }
}  