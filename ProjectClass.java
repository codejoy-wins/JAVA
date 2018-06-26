import java.util.*;
public class ProjectClass {
    // private attributes for class of ProjectClass
    private String name;
    private String description;
    private double initialCost;

    public ProjectClass(){};
    // contructor for no arguments

    public ProjectClass(String nameGiven){
        // constructor for name argument  -- overloaded
        this.name = nameGiven;
    }

    public ProjectClass(String nameGiven, String descriptionGiven){
        // constructor for two arguments == overloaded
        this.name = nameGiven;
        this.description = descriptionGiven;
    }
    // instance method that returns name and description separated by colon
    public String elevatorPitch(){
        return this.name + "(" + this.initialCost + "): " + this.description;
    }
    // SETTERS!
    public Object setDescription(String newDescription){
        this.description = newDescription;
        return this;
    }

    public Object setCost(double cost){
        this.initialCost = cost;
        return this;
    }

    // BONUS SETTER!!! set name!!!

    public Object setName(String newName){
        this.name = newName;
        return this;
    }

//  GETTERS!!
    public double getCost(){
        return this.initialCost;
    }

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }
}