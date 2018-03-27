/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author Diogo Pessoa
 */
public class AirPlane {
    
    private final String make; // final because we can't change after the isntance was created
    private final String model;
    private int capacity;
    private String category;
    private Pilot pilot;
   
    public AirPlane(String make, String model, String category, int capacity){
        this.make = make;
        this.model = model;
        this.category = category;
        this.capacity = capacity;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }
    
    public Pilot getPilot() {
        return pilot;
    }

    public String getCategory() {
        return category;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
    public void assingPilot(Pilot pilot){
        
        if (pilot.getRating() == 1 && category.equals("E")){
            this.pilot = pilot;
            System.out.print("Pilot is able to flight this airplane");
        }else if (pilot.getRating() == 2 && category.equals("A") && category.equals("E")){
            this.pilot = pilot;
            System.out.print("Pilot is able to flight this airplane");
        }else{
            System.out.print("Pilot is not allowed to fly");
        } 
 
    }

   @Override // pq é um metodo da super classe objeto
    public String toString(){
        String output;
        output = "\tPlane Information: \n";
        output += "\tAircraft: " + this.make;
        output += " Model: " + this.model + "\n";
        output += "\tCapacity: " + this.capacity + " seats\n";
        output += "\tPilot : " +  this.pilot.getName();
        return output;
    }
    
}
