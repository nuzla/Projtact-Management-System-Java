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
public class MiniProject extends Project {
    
  
    
    private int time;
    private String leader;
    
    
    public MiniProject(){}
    
    public MiniProject(String projectName, String projectId, String desc, String platform,int time,String leader){
        super(projectName,projectId,desc,platform);
        this.time=time;
        this.leader=leader;
    
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    @Override
    public String toString() {
        return "Mini Project{" + "time=" + time + ", leader=" + leader + '}';
    }
    
    
    
   
    
}
