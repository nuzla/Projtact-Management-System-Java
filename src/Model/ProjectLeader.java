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
public class ProjectLeader extends PermanentEmp {
    private int projectId;
    private String[] Employees;
    
       public ProjectLeader(){
    
    }
    
    public ProjectLeader(Name Name,String Gender,Date DOB,String Address,String TP,String Email,String NIC,String id,String skills,float salary,float allowances,int projectLeaderId,String[] Employees){
         super(Name,Gender,DOB,Address,TP,Email,NIC,id,skills,salary,allowances);
         this.projectId=projectLeaderId;
         this.Employees=Employees;
    }

    /**
     * @return the projectLeaderId
     */
    public int getProjectId() {
        return projectId;
    }

    /**
     * @param projectLeaderId the projectLeaderId to set
     */
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    /**
     * @return the Employees
     */
    public String[] getEmployees() {
        return Employees;
    }

    /**
     * @param Employees the Employees to set
     */
    public void setEmployees(String[] Employees) {
        this.Employees = Employees;
    }
    
 
    
}
