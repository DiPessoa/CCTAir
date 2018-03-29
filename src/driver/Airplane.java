package driver;

/**
 * Class of an Airplane object where is possible find all variables and
 * methods about airplane
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 *
 */
public class Airplane {

    private final String make; // final because we can't change after the isntance was created
    private final String model;
    private int capacity;
    private String category;
    private Pilot pilot;

    /**
     * Constructor Method
     *
     * @param make String - What brand it is
     * @param model String - Name of the model
     * @param category String - Says what kind of airplane is
     * @param capacity Integer - Number of seats
     */
    public Airplane(String make, String model, String category, int capacity) {
        this.make = make;
        this.model = model;
        this.category = category;
        this.capacity = capacity;
    }

    /**
     * Method returns airplane's make
     *
     * @return String make
     */
    public String getMake() {
        return make;
    }

    /**
     * Method returns airplane's model
     *
     * @return String model
     */
    public String getModel() {
        return model;
    }

    /**
     * Method returns airplane's seats
     *
     * @return Integer capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Method returns the Pilot assign to an airplane
     *
     * @return Pilot pilot
     */
    public Pilot getPilot() {
        return pilot;
    }

    /**
     * Method returns the Category
     *
     * @return String Category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Method sets capacity
     *
     * @param capacity integer
     */
    /*Capacity categories: 
     * category type A = Airplane seats <= 50;
     * category type B = Airplane 50 > seats <=150;
     * category type C = Airplane 150 > seats <= 300;
     * category type D = Airplane seats > 300 
     * category type E = Cargo Airplane;
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Method sets category
     *
     * @param category String
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Method assigns a Pilot to an airplane
     *
     * @param pilot Pilot
     */
    public void assignPilot(Pilot pilot) {

        if (pilot.getRating() == 1 && category.equals("E")) {
            this.pilot = pilot;
        } else if (pilot.getRating() == 2 && (category.equals("E") || category.equals("A"))) {
            this.pilot = pilot;
        } else if (pilot.getRating() == 3 && (category.equals("E") || category.equals("A") || category.equals("B"))) {
            this.pilot = pilot;
        } else if (pilot.getRating() == 4 && (category.equals("E") || category.equals("A") || category.equals("B") || category.equals("C"))) {
            this.pilot = pilot;
        } else if (pilot.getRating() == 5 && (category.equals("E") || category.equals("A") || category.equals("B") || category.equals("C") || category.equals("D"))) {
            this.pilot = pilot;
        } else {
            System.out.print("Pilot is not allowed to fly");
        }
    }

    /**
     * Method returns a String of an object
     *
     * @return String output
     */
    @Override // pq é um metodo da super classe objeto
    public String toString() {
        String output;
        output = "\t \n";
        output += "\t\tAircraft: " + this.make;
        output += " Model: " + this.model + "\n";
        output += "\t\tCapacity: " + this.capacity + " seats\n";
        output += "\t\tPilot : " + this.pilot.getName();
        return output;
    }

}
