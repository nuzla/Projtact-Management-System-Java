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
public class Name implements java.io.Serializable {
   static final long serialVersionUID = 1L;
  
    private String firstName;
    private String midName;
    private String lastName;
    
    public Name(){
    }

    public Name(String firstName, String midName, String lastName) {
        this.firstName = firstName;
        this.midName = midName;
        this.lastName = lastName;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the midName
     */
    public String getMidName() {
        return midName;
    }

    /**
     * @param midName the midName to set
     */
    public void setMidName(String midName) {
        this.midName = midName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
      @Override
    public String toString() {
        return  "First Name=" + firstName + "/n" +"Middle Name=" + midName +  "/n"+"Last Name=" + lastName ;
    }
    
}
