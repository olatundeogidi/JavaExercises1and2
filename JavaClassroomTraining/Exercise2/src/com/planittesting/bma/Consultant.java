package com.planittesting.bma;

import java.time.LocalDate;

public class Consultant {


    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    /**
     * fullName, String value that represents the full name of the consultant
     */
    private String fullName;

    /**
     * hours, Integer value that represent the worked hours of the consultant
     */
    private int hours;

    /**
     * assigned, Boolean value that represents the assigned to client mark
     */
    private boolean assigned;

    /**
     * joinDate, LocalDate value that represents the the date the client joined the company
     */

    //Todo create joinDate Variable


// -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Constructor of the Consultant class, The class is
     * @param theName The name of the new consultant
     */
    public Consultant(String theName,String joinDate) {
        this.fullName = theName;
        this.assigned = false;
        this.hours = 0;
        this.setJoinDate(joinDate);
    }


    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------
    /**
     * Method that add a new hours to the current worked hours and returns the actual value
     * @param hours The new worked hours to be added
     * @return The new current value of worked hours
     */
    public int addHours(int hours) {
        this.hours += hours;
        return hours;
    }

    /**
     * Getter method for the fullname
     * @return The fullname of the consultant
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Setter method for the fullname of the consultant
     * @param fullName The new name to be set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Getter method for the worked hours
     * @return The hours of the consultant
     */
    public int getHours() {
        return hours;
    }

    /**
     * Setter method for the worked hours of the consultant
     * @param hours The new name to be set
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Getter method for the assigned mark
     * @return The fullname of the consultant
     */
    public boolean isAssigned() {
        return assigned;
    }

    /**
     * Setter method for the assigned mark of the consultant
     * @param assigned The new assigned mark to be set
     */
    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    /**
     * getter method for the Join date of the consultant
     * @return the joindate
     */
    public LocalDate getJoinDate() {
   //todo complete getter
    }

    /**
     * Setter method for the JoinDate
     * @param Date the JoinDAte of the consultant in String format
     */
    public void setJoinDate(String Date) {

        // TODO parse the string into date and Set it
    }

    /**
     * The toString method allows an object to define a standard way of exposing its information
     * @return String containing the custom information of the Consultant to be shown
     */
    @Override
    public String toString() {
        return fullName +
                ", assigned= " + assigned+
                ", Joined= " + joinDate
                ;
    }

}
