// Dorcas Kumbu Buthidi 40224424
// COMP249
// Assignment 2
// Part 1
// Due Date: March 4, 2023 

package Part1.Package6;

/**
 * The Ferry class represents a ferry
 * 
 * @author  Dorcas
 */
public class Ferry {
    private double maxSpeed;
    private double maxLoad;

    /**
     * Default constructor for objects of class Ferry
     * 
     */
    public Ferry() {
        maxSpeed = 0.0;
        maxLoad = 0.0;
    }

    /**
     * Constructor for objects of class Ferry
     * 
     * @param maxSpeed The maximum speed of the ferry
     * @param maxLoad The maximum load of the ferry
     */
    public Ferry(double maxSpeed, double maxLoad) {
        this.maxSpeed = maxSpeed;
        this.maxLoad = maxLoad;
    }

    /**
     * Copy constructor for objects of class Ferry
     * 
     * @param other The object to be copied
     */
    public Ferry(Ferry other) {
        maxSpeed = other.maxSpeed;
        maxLoad = other.maxLoad;
    }

    /**
     * Sets the maximum speed of the ferry
     * 
     * @param newMaxSpeed The new maximum speed of the ferry
     */
    public void setMaxSpeed(double newMaxSpeed) {
        maxSpeed = newMaxSpeed;
    }

    /**
     * Gets the maximum speed of the ferry
     * 
     * @return The maximum speed of the ferry
     */
    public double getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * Sets the maximum load of the ferry
     * 
     * @param newMaxLoad The new maximum load of the ferry
     */
    public void setMaxLoad(double newMaxLoad) {
        maxLoad = newMaxLoad;
    }

    /**
     * Gets the maximum load of the ferry
     * 
     * @return The maximum load of the ferry
     */
    public double getMaxLoad() {
        return maxLoad;
    }

    /**
     * Returns a string representation of the object
     * 
     * @return A string representation of the object
     */
    public String toString() {
        if(maxSpeed == 0 || maxLoad == 0){
            return "\nSince no ferry was selected, the maximum speed and the maximum load are set to 0.";
        }
        return "\nThis ferry has a maximum speed of " + maxSpeed + " km/h and a maximum load of " + maxLoad + " kg.";
    }

    /**
     * Returns true if the two objects are equal
     * 
     * @param o The object to be compared
     * @return True if the two objects are equal
     */
    public boolean equals(Object o) {
        if(o==null || !(o instanceof Ferry)){
            return false;
        } else {
            Ferry other = (Ferry) o;
            return maxSpeed == other.maxSpeed && maxLoad == other.maxLoad;
        }
    }
}
