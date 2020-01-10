package BMA.src.com.planittesting.gui;

import java.time.LocalDate;

public class Consultant extends Employee {

    //variable declaration
    private boolean assign;

    public boolean isAssign()
    {
        return assign;
    }

    public void setAssign(boolean assign)
    {
        this.assign = assign;
    }

    @Override
    public String toString()
    {
        return getFullName() +", "+ getStartDate() + ", " + isAssign();
    }

    //The constructor
    public Consultant(String fullName, LocalDate startDate) {
        // TODO Auto-generated constructor stub
        this.setFullName(fullName);
        this.setStartDate(startDate);}

    // getDisplayText method
    public String getDisplayText() {
        return getFullName() + getStartDate();

    }
}