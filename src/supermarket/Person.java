/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket;

/**
 *
 * @author eska
 */
public class Person {
    private String fname;
    private String lname;
    private String gender;
    private String email;
    private int id;
    
    public Person(int id, String fname, String lname, String gender, String email){
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.email = email;
        
    }
    
    public String getFname(){
        return fname;
    }
    public String getFullName(){
        return (fname+" "+lname);
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getGender(){
        return gender;
    }
    
    public int getId(){
        return id;
    }
    
    public void setName(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
    
    public void setGender(String gender){
        this.gender = gender;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "ID: "+id+"| First Name: "+fname+"| Last Name: "+lname+"|Gender: "+gender+"| Email: "+email;
    }
}
