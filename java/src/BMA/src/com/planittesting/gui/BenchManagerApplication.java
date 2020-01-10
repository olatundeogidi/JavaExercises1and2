package BMA.src.com.planittesting.gui;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BenchManagerApplication implements iBenchManagerApplication {

    ArrayList<Employee> empArray = new ArrayList<Employee>();

    //Auto created with implementation of iBenchManagerApplication
    @Override
    public Employee getEmployee(String fullName) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double getHoursAverage() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Employee getBusiestEmployee() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getNumberOfEmployeeAvailable() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Employee getLessBusyEmployee() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int addWorkHoursToEmployee(String fullname, int hours) {
        // TODO Auto-generated method stub
        for(Employee gConsultant : empArray) {
            if (gConsultant.getFullName().equals(fullname)){
                gConsultant.setHours(hours);
            }
        }
        return hours;
    }

    @Override
    public boolean assignEmployee(String fullName, boolean assign) {
        // TODO Auto-generated method stub
        for(Employee aConsultant : empArray) {
            if (aConsultant.getFullName().equals(fullName)){
                Consultant newConsultant = (Consultant)aConsultant;
                newConsultant.setAssign(assign);
                break;
            }
        }
        return true;}

    @Override
    public boolean removeEmployee(String fullName){
        // TODO Auto-generated method stub

        for(Employee Remployee : empArray){
            if (Remployee.getFullName().contains(fullName)) {
                empArray.remove(Remployee);
                break;
            }
        }
        return true;}

    @Override
    public boolean addEmployee(String fullName,String joinDate) {
        // TODO Auto-generated method stub
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate StartDate = LocalDate.parse(joinDate, formatter);
        Employee newEmployee = new Consultant(fullName, StartDate);

        //add employee to Arraylist
        empArray.add(newEmployee);
        return true;
    }

    @Override
    public ArrayList getEmployees() {
        // TODO Auto-generated method stub
        return empArray;
    }

    @Override
    public String getTotalSalary() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String getBMSalary() {
        // TODO Auto-generated method stub
        return null;
    }
}