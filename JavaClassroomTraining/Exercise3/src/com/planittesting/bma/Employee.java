package com.planittesting.bma;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Abstract class employee
 * Creates an abstraction on the Planit Employee.
 *  This class is abstract so it needs to be extended by another class
 *
 */
public abstract class Employee {

    //-----------------------------------------------
    //-----ATTRIBUTES--------------------------------
    //-----------------------------------------------

    /**
     * fullName, String value that represents the full name of the employee
     */
    protected String fullName;
    /**
     * hours, Integer value that represent the worked hours of the employee
     */
    protected int hours;
    /**
     * assigned, Boolean value that represents the assigned to client mark
     */
    protected boolean assigned;

    /**
     *  joinDate, Date in which the employee joined the company
     */
    protected LocalDate joinDate;

    // todo Add a Hourly rate Attribute


    //-----------------------------------------------
    //-----METHODS TO IMPLEMENT----------------------
    //-----------------------------------------------

    /**
     * Method that allows to print in screen the definition of the employee
     *  This method should return:
     *      Fullname of the employee, assigned mark, entry date
     * @return
     */
    public abstract String getDisplayText();



    //-----------------------------------------------
    //-----GETTERS AND SETTERS-----------------------
    //-----------------------------------------------

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
     * @return The fullname of the employee
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Setter method for the fullname of the employee
     * @param fullName The new name to be set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Getter method for the worked hours
     * @return The hours of the employee
     */
    public int getHours() {
        return hours;
    }

    /**
     * Setter method for the worked hours of the employee
     * @param hours The new name to be set
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Getter method for the assigned mark
     * @return The fullname of the employee
     */
    public boolean isAssigned() {
        return assigned;
    }

    /**
     * Setter method for the assigned mark of the employee
     * @param assigned The new assigned mark to be set
     */
    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }


    /**
     *  Returns the date in which the employee joined the company
     * @return LocalDate Company entry Date
     */
    public LocalDate getJoinDate() {
        return joinDate;
    }


    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * Sets the company entry date of the employee
     * @param Date The initial date of entry
     */
    public void setJoinDate(String Date) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate newDate = LocalDate.parse(Date,df);
        this.joinDate = newDate;
    }

    /**
     *  Returns the amount of money to pay to the employee  (hours x hourly rate )
     * @return the salary of the employee
     */
    public  double getSalary(){

        //todo

        return 0;
    }

    @Override
    public String toString() {
        return this.getDisplayText();
    }
}
