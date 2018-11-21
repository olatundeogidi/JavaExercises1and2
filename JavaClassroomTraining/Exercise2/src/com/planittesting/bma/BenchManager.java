package com.planittesting.bma;

import java.util.ArrayList;

public class BenchManager {


    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    private ArrayList consultants;




// -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * BenchManager class constructor
     * the arraylist consultants need to be created
     * In this constructor all the attributes must be created for the 4 consultants as follows:
     * Consultant1 -> Name: James, Assigned: false, Hours worked: 10
     * Consultant2 -> Name: Cameron, Assigned: true, Hours worked: 5
     * Consultant3 -> Name: Ram, Assigned: true, Hours worked: 20
     * Consultant4 -> Name: Arantxa, Assigned: false, Hours worked: 2
     * the consultants need to be added to the consultants array
     */
    public BenchManager() {

        // todo Modify so it add consultants to the consultant array

    }
    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    /**
     * The getConsultant method have to return the corresponding consultant searching by the fullName.
     * In order to avoid mismatches due capital letters a comparison with ignore case shall be used.
     *
     * @param fullName: The fullName of the consultant being searched
     * @return An Consultant object that matches the corresponding name, if not found should return null.
     */
    public Consultant getConsultant(String fullName) {
        Consultant searched = null;

        //todo search for the consultant on the array
        return searched;
    }

    /**
     * The getHoursAverage method return the calculation of the avergage of hours per consultant for the 4 consultants
     * that the BMA have available.
     *
     * @return A double value with the Average
     */
    public double getHoursAverage() {
        double answer = 0.0;
        int numberOfConsultants = consultants.size();
        //todo Modify to Use consultants Array

        return answer;
    }

    /**
     * Method that returns the busiest consultant that the BMA has.
     * The definition of busiest consultant is the person with the most worked hours.
     * If there is a draw in worked hours then the first one shall be returned.
     *
     * @return Consultant: An object of the Consultant that meets the condition.
     */
    public Consultant getBusiestConsultant() {

        Consultant busiest = null;


//todo Modify to Use consultants Array

        return busiest;
    }

    /**
     * Method that returns the number of consultants that are available.
     * The consultant is available if the corresponding attribute is true.
     *
     * @return int -> The number of available consultants
     */
    public int getNumberOfConsultantsAvailable() {
        int availableNo = 0;


        for (int i = 0; i < consultants.size(); i++) {
            Consultant temp = (Consultant) consultants.get(i);
            if (!temp.isAssigned()) {
                availableNo++;
            }
        }


        return availableNo;
    }



    /**
     * Methods that adds a number of hours worked to a specific consultant
     * The criteria of choosing the consultant is the full name
     * After adding the corresponding hours the method should return the
     * new total hours worked of the consultant.
     *
     * @param fullname The full name of the consultant, the comparison must be done ignoring Upper/Lower case
     * @param hours    The hours to be added to the consultant
     * @return int, The new value for worked hours for the consultant
     */
    public int addWorkHoursToConsultant(String fullname, int hours) {
        int workedHours = 0;
        Consultant Consultant = getConsultant(fullname);
        workedHours = Consultant.addHours(hours);
        return workedHours;
    }

    /**
     * Method that allows to change the consultant assigned mark by his name
     * The criteria of choosing the consultant is the full name,
     * the comparison must be done ignoring Upper/Lower case
     *
     * @param fullName The full name of the consultant
     * @param assign   Boolean mark of the consultant being assigned to client
     * @return boolean, indicating the new assigned state of the Consultant
     */
    public boolean assignConsultant(String fullName, boolean assign) {

        Consultant consultant = getConsultant(fullName);
        consultant.setAssigned(assign);

        return consultant.isAssigned();
    }


    /**
     * Removes a consultant from the list the bench
     * @param fullName of the consultant to be removed
     * @return true if the consultant was removed successfully
     */
    public boolean removeConsultant(String fullName) {
        boolean remove = false;


    // todo remove a consultant from the Array

        return remove;
    }


    /**
     * Add a new consultant to the bench
     * @param fullName the fullName of the new Consultant to be created
     * @param joinDate the date that the consultant Joined the date
     * @return
     */

    public boolean addConsultant(String fullName, String joinDate) {
        boolean added = false;

        //Todo Add new consultant to the bench  consultants array

        return added;
    }


    public ArrayList getConsultants() {
        return consultants;
    }

    public void setConsultants(ArrayList consultants) {
        this.consultants = consultants;
    }

}
