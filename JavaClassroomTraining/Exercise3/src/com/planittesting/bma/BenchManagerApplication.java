package com.planittesting.bma;

import java.util.ArrayList;

public class BenchManagerApplication implements iBenchManagerApplication {


    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------
    private ArrayList<Employee> consultants;


// -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    /**
     * BenchManagerApplication class constructor
     * In this constructor all the attributes must be created for the 4 consultants as follows:
     * Consultant1 -> Name: James, Assigned: false, Hours worked: 10
     * Consultant2 -> Name: Cameron, Assigned: true, Hours worked: 5
     * Consultant3 -> Name: Ram, Assigned: true, Hours worked: 20
     * Consultant4 -> Name: Arantxa, Assigned: false, Hours worked: 2
     */
    public BenchManagerApplication() {


        consultants = new ArrayList();
        consultants.add(new Consultant("James", "24/05/2015"));
        consultants.add(new Consultant("Cameron", "23/08/2012"));
        consultants.add(new Consultant("Ram", "24/08/2017"));
        consultants.add(new Consultant("Arantxa", "12/11/2016"));

        assignEmployee("Cameron", true);
        assignEmployee("Ram", true);


        addWorkHoursToEmployee("James", 4);
        addWorkHoursToEmployee("Cameron", 5);
        addWorkHoursToEmployee("Ram", 1);
        addWorkHoursToEmployee("Arantxa", 10);


    }
    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------


    public Employee getEmployee(String fullName) {
        Employee searched = null;


        for (Employee consultant : consultants) {
            if (consultant.getFullName().equalsIgnoreCase(fullName)) {
                searched = consultant;
            }
        }

        return searched;
    }


    public double getHoursAverage() {
        double answer = 0.0;
        double totalHoursWorked = 0.0;
        int numberOfConsultants = consultants.size();
        if (numberOfConsultants > 0) {

            //todo update the for loop
            for (int i = 0; i < consultants.size(); i++) {
                Employee temp = (Employee) consultants.get(i);
                totalHoursWorked += temp.getHours();

            }
            answer = totalHoursWorked / numberOfConsultants;
        }


        return answer;
    }


    public Employee getBusiestEmployee() {

        Employee busiest = null;

        for (Employee consultant : consultants) {
            if (busiest == null || consultant.getHours() >= busiest.getHours()) {
                busiest = consultant;
            }
        }

        return busiest;
    }


    public int getNumberOfEmployeeAvailable() {
        int availableNo = 0;


        //todo update the for loop
        for (int i = 0; i < consultants.size(); i++) {
            Employee temp = (Employee) consultants.get(i);
            if (!temp.isAssigned()) {
                availableNo++;
            }
        }


        return availableNo;
    }


    public Employee getLessBusyEmployee() {

        Employee leastBusy = null;

        for (Employee consultant : consultants) {
            if (consultant.getHours() < leastBusy.getHours()) {
                leastBusy = consultant;
            }
        }

        return leastBusy;
    }


    public int addWorkHoursToEmployee(String fullname, int hours) {
        int workedHours = 0;
        Employee Employee = getEmployee(fullname);
        workedHours = Employee.addHours(hours);
        return workedHours;
    }


    public boolean assignEmployee(String fullName, boolean assign) {

        Employee employee = getEmployee(fullName);
        employee.setAssigned(assign);

        return employee.isAssigned();
    }


    public boolean removeEmployee(String fullName) {
        boolean remove = false;


        int removeIndex= -1;
        for (int i = 0; i < consultants.size(); i++) {
            Employee temp = (Employee) consultants.get(i);
            if (fullName.equalsIgnoreCase(temp.getFullName())) {
                removeIndex=i;
            }
        }
        if(removeIndex>0){
            consultants.remove(removeIndex);
            remove = true;
        }

        return remove;
    }


    public boolean addEmployee(String fullName, String joinDate) {
        boolean added = false;

        Employee newEmployee = new Consultant(fullName, joinDate);
        if (newEmployee != null) {
            consultants.add(newEmployee);
            added = true;
        }

        return added;
    }


    public ArrayList getEmployees() {
        return consultants;
    }


    public void setEmployees(ArrayList consultants) {
        this.consultants = consultants;
    }

    @Override
    public String getTotalSalary() {
        return null;
        // todo create a method that gives the total bench salary
    }

    @Override
    public String getBMSalary() {
        return null;
        //todo
    }

}
