package driver;

/**
 * Abstract Class of an object employee
 *
 * @author Diogo Pessoa
 * @author Luana Andrade
 *
 */
abstract class Employee {

    private String name;
    private String dob;
    private String address;
    private int pps;

    /**
     * Constructor Method
     *
     * @param name String - Employee's name
     * @param dob String - Employee's dob
     * @param address String - Employee's address
     * @param pps Integer - Employee's pps
     *
     */
    public Employee(String name, String dob, String address, int pps) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.pps = pps;
    }

    /**
     * Method returns the employee's name
     *
     * @return String name
     */
    public String getName() {
        return name;
    }

    /**
     * Method returns the employee's dob
     *
     * @return String dob
     */
    public String getDob() {
        return dob;
    }

    /**
     * Method returns the employee's address
     *
     * @return String address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Method returns the employee's pps
     *
     * @return Integer pps number
     */
    public int getPps() {
        return pps;
    }

    /**
     * Method sets the employee's name
     *
     * @param name String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method sets the employee's dob
     *
     * @param dob Integer
     */
    public void setDob(String dob) {
        this.dob = dob;
    }

    /**
     * Method sets the employee's address
     *
     * @param address String
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method sets the employee's pps number
     *
     * @param pps Integer
     */
    public void setPps(int pps) {
        this.pps = pps;
    }

}
