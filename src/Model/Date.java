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
public class Date implements java.io.Serializable{

    static final long serialVersionUID = 10L;
      
    private String day;
    private String month;
    private String year;
    
    public Date(){
    }
    
    public Date(String day, String month, String year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Date{" + "day=" + day + ", month=" + month + ", year=" + year + '}';
    }

    

    
}
