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
public class Project  implements java.io.Serializable, java.lang.Comparable<Project>{
    
    static final long serialVersionUID = 99L;

    private String projectName;
    private String projectId;
    private String desc;
    private String platform;
    
    public Project(){}
    
    public Project(String projectName, String projectId, String desc, String platform) {
        this.projectName = projectName;
        this.projectId = projectId;
        this.desc = desc;
        this.platform = platform;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Project{" + "projectName=" + projectName + ", projectId=" + projectId + ", desc=" + desc + ", platform=" + platform + '}';
    }

    @Override
    public int compareTo(Project o) {
        return this.projectId.compareTo(o.projectId);
    }
    
    
  
    
}
