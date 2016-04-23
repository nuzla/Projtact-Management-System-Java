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
public class TempEmp extends Employee {
    
    public  TempEmp(){}

     private float rate;
     
     private int hours;
     

    public TempEmp(Name Name,String Gender,Date DOB,String Address,String TP,String Email,String NIC,String id,String skills,float rate){
       super(Name,Gender,DOB,Address,TP,Email,NIC,id,skills);
       this.rate=rate;
    }
     
    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
    }
    @Override
    public String toString() {
        return "TempEmp{" + "rate=" + rate + '}';
    }

    /**
     * @return the hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * @param hours the hours to set
     */
    public void setHours(int hours) {
        this.hours = hours;
    }
    
  
    
}
