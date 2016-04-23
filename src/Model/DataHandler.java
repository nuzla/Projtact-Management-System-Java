/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Nibras
 */
public class DataHandler {
    
    private static DataHandler instance = new DataHandler();
    
    private DataHandler(){}
    
    public static DataHandler getInstance(){
           return instance;
    }
    
    
    private ArrayList<Person> people = new ArrayList<Person>();
    private ArrayList<Project> projects = new ArrayList<Project>();
    
    public void add(Person person){
        people.add(person);
    }
    
    public void add(Project project){
        projects.add(project);
    }
    
    public void remove(Person person){
        people.remove(person);
    }
    
    public void remove(Project project){
        projects.remove(project);
    }
    
    public List<Project> getAllProjects(){
        return (List<Project>) projects.clone();
    }
    
    public List<Person> getAllPeople(){
        return (List<Person>) people.clone();
    }
    
    
    public Project getProjectById(String id){
        Project p = new Project() ;
        p.setProjectId(id);
        Collections.sort(projects);
        return projects.get(Collections.binarySearch(projects, p));
    }
    
    public Person getPersonByNIC(String NIC){
        Person p = new Person() ;
        p.setNIC(NIC);
        Collections.sort(people);
        return people.get(Collections.binarySearch(people, p));
    }
    
    
    public void deleteProjectById(String id){
        
        
        Project p = new Project() ;
        p.setProjectId(id);
        Collections.sort(projects);
      projects.remove(Collections.binarySearch(projects, p));
    }
    
    public void deletePersonByNIC(String NIC){
        Person p = new Person() ;
        p.setNIC(NIC);
        Collections.sort(people);
        people.remove(Collections.binarySearch(people, p));
    }
    
    public void savePerson(File file) throws IOException{
   
         FileOutputStream outputFile =
         new FileOutputStream(file);
         ObjectOutputStream output = new ObjectOutputStream(outputFile);
         output.writeObject(people);
         output.close();
        outputFile.close();

    }
    
    public void saveProject(File file) throws IOException{
    
         FileOutputStream outputFile =
         new FileOutputStream(file);
         ObjectOutputStream output = new ObjectOutputStream(outputFile);
         output.writeObject(projects);
         output.close();
        outputFile.close();
         
    
    }
    
    
    public void loadProject(File file) throws FileNotFoundException, IOException, ClassNotFoundException{
   
         FileInputStream inputFile =
         new FileInputStream(file);
         ObjectInputStream input = new ObjectInputStream(inputFile);
         projects = (ArrayList<Project>) input.readObject();
         input.close();
        inputFile.close();
         
     
    }
    
    public void loadPerson(File file) throws FileNotFoundException, IOException, ClassNotFoundException{
   
         FileInputStream inputFile =
         new FileInputStream(file);
         ObjectInputStream input = new ObjectInputStream(inputFile);
        people = (ArrayList<Person>) input.readObject();
         input.close();
        inputFile.close();
         
     
    }
}
