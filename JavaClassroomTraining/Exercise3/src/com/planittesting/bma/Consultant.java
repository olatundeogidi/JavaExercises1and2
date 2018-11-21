package com.planittesting.bma;

public class Consultant extends Employee{

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
        super.setJoinDate(joinDate);
        //todo initialize the Hourly rate variable
    }


    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * The toString method allows an object to define a standard way of exposing its information
     * @return String containing the custom information of the Consultant to be shown
     */
    public String getDisplayText() {
        return fullName +
                ", assigned= " + assigned+
                ", Joined= " + joinDate
                ;
    }



}
