package com.planittesting.bma;

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
    //todo add attribute hours
    /**
     * assigned, Boolean value that represents the assigned to client mark
     */
    private boolean assigned;


// -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Constructor of the Consultant class, The class is
     * @param theName The name of the new consultant
     */
    public Consultant(String theName) {
        this.fullName = theName;
        this.assigned = false;
        //todo initialize Attribute Hours
    }


    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * Method that add a new hours to the current worked hours and returns the actual value
     * @param hours The new worked hours to be added
     * @return The new current value of worked hours
     */
    //todo Create method Add hours

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

// todo create Getters and setters for attribute Hours

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
     * The toString method allows an object to define a standard way of exposing its information
     * @return String containing the custom information of the Consultant to be shown
     */
    @Override
    public String toString() {
        return fullName +
                ", assigned=" + assigned
                ;
    }

}
