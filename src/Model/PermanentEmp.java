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
public class PermanentEmp extends Employee{

    
    private float salary;
    private float allowances;
    
    
    public PermanentEmp(){}
    
    public PermanentEmp(Name Name,String Gender,Date DOB,String Address,String TP,String Email,String NIC,String id,String skills,float salary,float allowances){
        super(Name,Gender,DOB,Address,TP,Email,NIC,id,skills);
        this.salary=salary;
        this.allowances=allowances;
    
    }
    
    
    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getAllowances() {
        return allowances;
    }

    public void setAllowances(float allowances) {
        this.allowances = allowances;
    }

    @Override
    public String toString() {
        return "PermanentEmp{" + "salary=" + salary + ", allowances=" + allowances + '}';
    }
    
    
    
            
    
}
