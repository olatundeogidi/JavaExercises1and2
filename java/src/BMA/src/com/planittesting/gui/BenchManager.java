package BMA.src.com.planittesting.gui;

import java.time.LocalDate;

public class BenchManager extends Employee{

    //Constructor
    public BenchManager(String name, LocalDate startDate)
    {
        this.setFullName(name);
        this.setStartDate(startDate);
    }

    // Method getDisplayText
    public String getDisplayText()
    {
        String fullName =  getFullName();
        LocalDate startDate = getStartDate();
        return fullName+", "+startDate+", "+ Fulladdress();
    }
}
