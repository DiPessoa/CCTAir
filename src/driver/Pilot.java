package driver;

/**
 * Extended Class of an Pilot object that extends the class employee
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 *
 */
public class Pilot extends Employee {

    private int rating;

    /**
     * Constructor Method
     *
     * @param name - String - Pilot's name
     * @param dob - String - Pilot's dob
     * @param address - String - Pilot's address
     * @param pps - Integer - Pilot's pps
     * @param rating - Integer - Tells about what kind of airplane the assigned
     * pilot is allowed to fly
     *
     */
    public Pilot(String name, String dob, String address, int pps, int rating) {
        super(name, dob, address, pps);

        this.rating = rating;
    }

    /**
     * Method returns Pilot's rating
     *
     * @return Integer rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * Method sets rating
     *
     * @param rating integer
     */
    public void setRating(int rating) {
        this.rating = rating;
    }
}
