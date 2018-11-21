package com.planittesting.bma;

import java.time.LocalDate;

public class BenchManager extends Employee {

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * Constructor of the Consultant class, The class is
     * @param theName The name of the new consultant
     */
    public BenchManager(String theName,String joinDate) {
        this.fullName = theName;
        this.assigned = false;
        this.hours = 0;
        //todo initialize hourly rate
        super.setJoinDate(joinDate);
    }

    /**
     * Method that allows to print in screen the definition of the employee
     * This method should return:
     * Fullname of the employee, assigned mark, entry date
     *
     * @return
     */
    public String getDisplayText() {
        return "BenchManager "+fullName +
                ", assigned= " + assigned+
                ", Joined= " + joinDate
                ;
    }


}
