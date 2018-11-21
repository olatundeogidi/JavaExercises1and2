package com.planittesting.bma;

public class BenchManager {

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    private static final int numberOfConsultants = 4;

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    /**
     * Attribute consultant1: The first consultant of the bench manager application
     */
    private Consultant consultant1;

    /**
     * Attribute consultant2: The first consultant of the bench manager application
     */
    private Consultant consultant2;
   //TODO add missing attributes: consultant3 and consultant4


// -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * BenchManager class constructor
     * In this constructor all the attributes must be created for the 4 consultants as follows:
     * Consultant1 -> Name: James, Assigned: false, Hours worked: 10
     * Consultant2 -> Name: Cameron, Assigned: true, Hours worked: 5
     * Consultant3 -> Name: Ram, Assigned: true, Hours worked: 20
     * Consultant4 -> Name: Arantxa, Assigned: false, Hours worked: 2
     */
    public BenchManager() {

        consultant1 = new Consultant("James");
        consultant1.setAssigned(true);
        consultant1.setHours(4);

        //TODO complete the constructor

    }
    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * The getConsultant method have to return the corresponding consultant searching by the fullName.
     *  In order to avoid mismatches due capital letters a comparison with ignore case shall be used.
     * @param fullName: The fullName of the consultant being searched
     * @return An Consultant object that matches the corresponding name, if not found should return null.
     */
    public Consultant getConsultant(String fullName) {
        Consultant searched = null;

        if (consultant1.getFullName().equalsIgnoreCase(fullName)) {
            searched = consultant1;
        } else if (consultant2.getFullName().equalsIgnoreCase(fullName)) {
            searched = consultant2;
        } else if (consultant3.getFullName().equalsIgnoreCase(fullName)) {
            //TODO: add missing assignation
        }
        //TODO: add missing else if part
        return searched;

    }

    /**
     * The getHoursAverage method return the calculation of the average of hours for the 4 consultants
     *  that the BMA have available.
     * @return A double value with the Average
     */
    public double getHoursAverage() {

        //TODO: Implement Method

        return 0;
    }


    /**
     * Method that returns the busiest consultant that the BMA has.
     *  The definition of busiest consultant is the person with the most worked hours.
     *  If there is a draw in worked hours then the first one shall be returned.
     * @return Consultant: An object of the Consultant that meets the condition.
     */
    public Consultant getBusiestConsultant() {
        int hours1 = consultant1.getHours();
        int hours2 = consultant2.getHours();
        int hours3 = consultant3.getHours();
        int hours4 = consultant4.getHours();

        Consultant busiest = null;
        int mostHours = 0;

        if (hours1 > mostHours) {
            busiest = consultant1;
            mostHours = hours1;
        }
        if (hours2 > mostHours) {
            busiest = consultant2;
            mostHours = hours2;
        }
        if (hours3 > mostHours) {
            busiest = consultant3;
            mostHours = hours3;
        }
        if (hours4 > mostHours) {
            busiest = consultant4;
        }

        return busiest;
    }

    /**
     * Method that returns the number of consultants that are available.
     *  The consultant is available if the corresponding attribute is true.
     * @return int -> The number of available consultants
     */
    public int getNumberOfConsultantsAvailable() {
        int availableNo = 0;
        //TODO: complete method
        return availableNo;
    }

    /**
     * Methods that adds a number of hours worked to a specific consultant
     *  The criteria of choosing the consultant is the full name
     *  After adding the corresponding hours the method should return the
     *      new total hours worked of the consultant.
     * @param fullname The full name of the consultant, the comparison must be done ignoring Upper/Lower case
     * @param hours The hours to be added to the consultant
     * @return int, The new value for worked hours for the consultant
     */
    public void addWorkHoursToConsultant(String fullname, int hours) {

        Consultant Consultant = getConsultant(fullname);
        Consultant.addHours(hours);

    }

    /**
     * Method that allows to change the consultant assigned mark by his name
     *  The criteria of choosing the consultant is the full name,
     *      the comparison must be done ignoring Upper/Lower case
     * @param fullName The full name of the consultant
     * @param assign Boolean mark of the consultant being assigned to client
     * @return boolean, indicating the new assigned state of the Consultant
     */
    public boolean assignConsultant(String fullName, boolean assign) {
      //TODO: implement method

    }


    /**
     * Getter method for attribute consultant1
     * @return The consultant #1
     */
    public Consultant getConsultant1() {
        return consultant1;
    }


    /**
     * Getter method for attribute consultant2
     * @return The consultant #2
     */
    public Consultant getConsultant2() {
        return consultant2;
    }


    /**
     * Getter method for attribute consultant3
     * @return The consultant #3
     */
    public Consultant getConsultant3() {
        return consultant3;
    }

    /**
     * Method that allows to modify the existing consultant1
     * @param consultant3 The new #3 Consultant
     */
    public void setConsultant3(Consultant consultant3) {
        this.consultant3 = consultant3;
    }

    /**
     * Getter method for attribute consultant4
     * @return The consultant #4
     */
    public Consultant getConsultant4() {
        return consultant4;
    }


}
