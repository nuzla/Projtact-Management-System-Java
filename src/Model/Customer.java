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
public class Customer extends Person {

     private String projectId;
     private float price; 
    
     public Customer(){
        
    }
    
    public Customer(Name Name,String Gender,Date DOB,String Address,String TP,String Email,String NIC,String projectId,float price){
        super(Name,Gender,DOB,Address,TP,Email,NIC);
        this.projectId=projectId;
        this.price=price;
    }
    
    
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Customer{" + "projectId=" + projectId + ", price=" + price + '}';
    }
    
}
