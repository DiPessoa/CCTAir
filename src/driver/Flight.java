package driver;

/**
 * Class of an object Flight type where is possible find all variables and
 * methods about flight.
 *
 * @author Luana Andrade
 */
public class Flight {

    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String dateFlight;
    private AirPlane airplane;

    /**
     * Constructor Method
     *
     * @param origin String - Where it is coming from
     * @param destination String - Where it is going to
     * @param departureTime String - What time the flight will depart
     * @param arrivalTime String - What time the flight will land
     * @param dateFlight String - Date of the flight
     * @param airplane Airplane - Assigned airplane to an airplane
     */
    public Flight(String origin, String destination, String departureTime,
            String arrivalTime, String dateFlight, AirPlane airplane) {

        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.dateFlight = dateFlight;
        this.airplane = airplane;
    }

    public Flight() {

    }

    /**
     * Method returns Flight's origin
     *
     * @return String origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Method returns Flight's destination
     *
     * @return String destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Method returns Flight's Departure Time
     *
     * @return String departureTime
     */
    public String getDepartureTime() {
        return departureTime;
    }

    /**
     * Method returns Flight's Arrival Time
     *
     * @return String arrivalTime
     */
    public String getArrivalTime() {
        return arrivalTime;
    }

    /**
     * Method returns Flight's Date of flight
     *
     * @return String DateOfFlight
     */
    public String getDateFlight() {
        return dateFlight;
    }

    /**
     * Method returns Flight's Aircraft
     *
     * @return String Aircraft
     */
    public AirPlane getAircraft() {
        return airplane;
    }

    /**
     * Method sets origin
     *
     * @param origin String
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * Method sets Destination
     *
     * @param destination String
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * Method sets Departure Time
     *
     * @param departureTime String
     */
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    /**
     * Method sets Date of Flight
     *
     * @param dateFlight String
     */
    public void setDateFlight(String dateFlight) {
        this.dateFlight = dateFlight;
    }

    /**
     * Method sets Aircraft
     *
     * @param airplane String
     */
    public void setAircraft(AirPlane airplane) {
        this.airplane = airplane;
    }

    /**
     * Method sets Arrival Time
     *
     * @param arrivalTime String
     */
    public void schedule(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * Method sets arrival Time and Departure Time
     *
     * @param arrivalTime String
     * @param departureTime String
     */
    public void schedule(String arrivalTime, String departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    /**
     * Method returns a String of an object
     *
     * @return String output
     */
    @Override // pq é um metodo da super classe objeto
    public String toString() {
        String output;
        output = "----------// - CCTAir - //----------\n";
        output += "Flight Information: \n";
        output += "\tDate: " + this.dateFlight + "\n";
        output += "\tFrom: " + this.origin + " to " + this.destination + "\n";
        output += "\tFlight time: " + this.departureTime + " to " + this.arrivalTime + "\n";
        output += "\tAirPlane Information" + this.airplane;
        return output;
    }

}
