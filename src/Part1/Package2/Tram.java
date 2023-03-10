// Dorcas Kumbu Buthidi 40224424
// COMP249
// Assignment 2
// Part 1
// Due Date: March 4, 2023 

package Part1.Package2;

import Part1.Package3.Metro;

/**
 * A class that represents a tram
 * 
 * @author Dorcas
 */
public class Tram extends Metro {
    private int creationYear;

    /**
     * Default constructor for objects of class Tram
     * 
     */
    public Tram() {
        super();
        creationYear = 0;
    }

    /**
     * Constructor for objects of class Tram
     * 
     * @param numWheels The number of wheels on the tram
     * @param maxSpeed The maximum speed of the tram
     * @param numVehicles The number of vehicles on the tram
     * @param startStation The station where the tram starts
     * @param endStation The station where the tram ends
     * @param totStops The total number of stops the tram makes
     * @param creationYear The year the tram was created
     */
    public Tram(int numWheels, double maxSpeed, int numVehicles, String startStation, String endStation, int totStops, int creationYear) {
        super(numWheels, maxSpeed, numVehicles, startStation, endStation, totStops);
        this.creationYear = creationYear;
    }

    /**
     * Copy constructor for objects of class Tram
     * 
     * @param other The object to be copied
     */
    public Tram(Tram other) {
        super(other);
        creationYear = other.creationYear;
    }

    /**
     * Sets the year the tram was created
     * 
     * @param newCreationYear The new year the tram was created
     */
    public void setCreationYear(int newCreationYear) {
        creationYear = newCreationYear;
    }

    /**
     * Gets the year the tram was created
     * 
     * @return The year the tram was created
     */
    public int getCreationYear() {
        return creationYear;
    }

    /**
     * Returns a string representation of the object
     * 
     * @return A string representation of the object
     */
    public String toString() {
        if(numVehicles == 0){
            return "\nSince no tram has been selected, the number of wheels, the maximum speed, and the number of venhicles \nare set to 0. Travelling does not occur. There are 0 stops and no creation year.";
        }
        return "\nThis tram has " + numWheels + " wheels, a maximum speed of " + maxSpeed + " km/h, " + numVehicles + " vehicles, travels from " + startStation + " to " + endStation + ", \nhas " + totStops + " stops, and was created in " + creationYear + ".";
    }

    /**
     * Checks if two objects are equal
     * 
     * @param o The object to be compared
     * @return True if the objects are equal, false otherwise
     */
    public boolean equals(Object o) {
        if(o==null || !(o instanceof Tram)){
            return false;
        } else {
            Tram other = (Tram) o;
            return super.equals(other) && creationYear == other.creationYear;
        }
    }
    
}
