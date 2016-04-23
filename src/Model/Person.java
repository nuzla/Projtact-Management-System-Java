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
public class Person implements java.io.Serializable, java.lang.Comparable<Person> {

   static final long serialVersionUID = 77L;
  
    private Name Name;
    private String Gender;
    private Date DOB;
    private String Address;
    private String TP;
    private String Email;
    private String NIC;
    
    public Person(){
    }
    
       public Person(Name Name,String Gender,Date DOB, String Address, String TP, String Email, String NIC) {
        this.Name = Name;
        this.Gender=Gender;
        this.DOB = DOB;
        this.Address = Address;
        this.TP = TP;
        this.Email = Email;
        this.NIC = NIC;
    }
    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    /**
     * @return the Name
     */
    public Name getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(Name Name) {
        this.Name = Name;
    }

    /**
     * @return the DOB
     */
    public Date getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the TP
     */
    public String getTP() {
        return TP;
    }

    /**
     * @param TP the TP to set
     */
    public void setTP(String TP) {
        this.TP = TP;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the NIC
     */
    public String getNIC() {
        return NIC;
    }

    /**
     * @param NIC the NIC to set
     */
    public void setNIC(String NIC) {
        this.NIC = NIC;
    }
  
    /**
     * @return the Address
     */
    public String getAddress() {
        return Address;
    }

    /**
     * @param Address the Address to set
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "Person{" + "Name=" + Name + ", Gender=" + Gender + ", DOB=" + DOB + ", Address=" + Address + ", TP=" + TP + ", Email=" + Email + ", NIC=" + NIC + '}';
    } 

    @Override
    public int compareTo(Person o) {
       return this.NIC.compareTo(o.NIC);
    }
   
    

    
}
