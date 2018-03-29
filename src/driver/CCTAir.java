/**
 * Created on 28th of March of 2018
 * for a Assignment Project
 * Module Object Oriented Constructs
 */
/**
 * @author Diogo Pessoa 2016326
 * @author Luana Andrade 2016270
 * @author Luzilene OLiveira 2016299
 */
package driver;

import java.util.Scanner;

/**
 * Main Class
 *
 * @version 1.0
 */
public class CCTAir {

    /**
     * Main method was created to hold all instances and call methods
     */
    public static void main(String[] args) {

        /**
         * Creating new instances of object Pilot
         */
        Pilot p1 = new Pilot("Paul McDonald's", "04-10-80", "67 Blessington St", 132345, 5);

        Pilot p2 = new Pilot("Mary O'Brien", "16-12-78", "25 Waterford St", 456783, 4);

        Pilot p3 = new Pilot("Boris Kasoy", "21-09-91", "85 Ballyogan Rd", 123484, 3);

        Pilot p4 = new Pilot("Justine Polach", "08-01-83", "987 Marrion Sq", 897345, 2);

        Pilot p5 = new Pilot("Robert Fitzpatrick", "12-07-89", "34 Westmoreland St", 145876, 1);

        /**
         * Creating new instances of object AirPlane
         */
        AirPlane a1 = new AirPlane("Embraer", "E-195", "A", 25);

        AirPlane a2 = new AirPlane("Boeing", "747-100", "B", 150);

        AirPlane a3 = new AirPlane("Airbus", "A320", "C", 365);

        AirPlane a4 = new AirPlane("Boeing", "747-300", "D", 420);

        AirPlane a5 = new AirPlane("Airbus", "Beluga-Cargo", "E", 8);

        /**
         * Creating new instance of object Flight
         */
        Flight f1 = new Flight("Dublin", "Belo Horizonte", "15:38", "11:15 +1 day", "18/07/2018", a2);

        Flight f2 = new Flight("New York", "Madrid", "9:40", "23:25", "15/05/2018", a5);

        Flight f3 = new Flight("London", "Rome", "8:50", "13:30", "01/04/2018", a3);

        Flight f4 = new Flight("Paris", "Cairo", "12:10", "19:50", "07/05/2018", a4);

        Flight f5 = new Flight("Cork", "Dublin", "10:20", "12:15", "24/04/2018", a1);

        /**
         * Using the method assingPilot from Class AirPlane This way it was
         * linked a Pilot to each AirPlane, consequently links a pilot to a
         * flight
         */
        a1.assignPilot(p4);
        a2.assignPilot(p3);
        a3.assignPilot(p2);
        a4.assignPilot(p1);
        a5.assignPilot(p5);

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("Type in 1 for: ADD Flight");
        System.out.println("Type in 2 for: Change the Departure and Arrival time of a Flight");
        System.out.println("Type in 3 for: Change an Arrival time of a Flight");
        System.out.println("Type in 4 for: Display all flights");

        Flight flight = new Flight();
        int cases = input.nextInt();

        switch (cases) {

            case 1:
                System.out.println("Type in the Flight's Origin:");
                String origin = input.nextLine();
                System.out.println("Type in the Flight's Destination:");
                String destination = input.nextLine();
                System.out.println("Type in the Flight's Departure Time:");
                String departureTime = input.nextLine();
                System.out.println("Type in the Flight's Arrival Time:");
                String arrivalTime = input.nextLine();
                System.out.println("Type in the Flight's Date:");
                String dateFlight = input.nextLine();

                System.out.println("Choose the airplane:");
                System.out.println("Type in 1 for: Embraer E-195");
                System.out.println("Type in 2 for: Boeing 747-100");
                System.out.println("Type in 3 for: Airbus A320");
                System.out.println("Type in 4 for: Boeing 747-300");
                System.out.println("Type in 5 for: Airbus Beluga - Cargo");

                int aircraft = input.nextInt();

                switch (aircraft) {
                    case 1:
                        Flight f7 = new Flight(origin, destination, departureTime,
                                arrivalTime, dateFlight, a1);
                        flight = f7;
                        break;
                    case 2:
                        Flight f8 = new Flight(origin, destination, departureTime,
                                arrivalTime, dateFlight, a2);
                        flight = f8;
                        break;
                    case 3:
                        Flight f9 = new Flight(origin, destination, departureTime,
                                arrivalTime, dateFlight, a3);
                        flight = f9;
                        break;
                    case 4:
                        Flight f10 = new Flight(origin, destination, departureTime,
                                arrivalTime, dateFlight, a4);
                        flight = f10;
                        break;
                    case 5:
                        Flight f11 = new Flight(origin, destination, departureTime,
                                arrivalTime, dateFlight, a5);
                        flight = f11;
                        break;
                }

//        if (aircraft == 1) {
//            Flight f7 = new Flight(origin, destination, departureTime, arrivalTime, dateFlight, a1);
//            f6 = f7;
//        } else if (aircraft == 2) {
//            Flight f7 = new Flight(origin, destination, departureTime, arrivalTime, dateFlight, a2);
//            f6 = f7;
//        } else if (aircraft == 3) {
//            Flight f7 = new Flight(origin, destination, departureTime, arrivalTime, dateFlight, a3);
//            f6 = f7;
//        } else if (aircraft == 4) {
//            Flight f7 = new Flight(origin, destination, departureTime, arrivalTime, dateFlight, a4);
//            f6 = f7;
//        } else if (aircraft == 5) {
//            Flight f7 = new Flight(origin, destination, departureTime, arrivalTime, dateFlight, a5);
//            f6 = f7;
//        }else{
//            Flight f7= new Flight();
//            f6 = f7;
//        }
            case 2:
                /**
                 * Using the method to set the arrival Time and Departure Time
                 */
                f4.schedule("21:45", "11:24");
                break;

            case 3:
                /**
                 * Using the method to set the arrival Time
                 */
                f4.schedule("23:56");
                break;

            case 4:
                /**
                 * Display all Flights
                 */
                System.out.println(f1.toString());
                System.out.println(f2.toString());
                System.out.println(f3.toString());
                System.out.println(f4.toString());
                System.out.println(f5.toString());
                if(flight.getDestination().isEmpty() == false){
                    System.out.println(f5.toString());

                }// dando erro de exceção
        }
    }
}
