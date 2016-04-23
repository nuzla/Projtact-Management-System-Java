/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Nuzla
 */
public class Employee extends Person{

    
    private String id;
    private String skills;

  
    
    public Employee(){
        
    }
    
    public Employee(Name Name,String Gender,Date DOB,String Address,String TP,String Email,String NIC,String id,String skills){
        super(Name,Gender,DOB,Address,TP,Email,NIC);
        this.id=id;
        this.skills=skills; 
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
    
     @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", skills=" + skills + '}';
    }
    
    
}
