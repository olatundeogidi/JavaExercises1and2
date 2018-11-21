package com.planittesting.gui;

import com.planittesting.bma.BenchManager;
import com.planittesting.bma.Consultant;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.*;


public class GUIBenchManager extends JFrame {

    // -----------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------

    public final static String MAIN_TITLE = "Bench Management Operations";
    public final static String ERROR_REMOVE = "Consultant not found.";
    public final static String CONFIRMATION_REMOVE = "Consultant removed.";

    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    private BenchManager benchManager;
    private PanelImage panelImage;
    private PanelBench panelBench;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    public GUIBenchManager() {
        benchManager = new BenchManager();

        setTitle(MAIN_TITLE);
        setSize(470, 480);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setResizable(false);

        JPanel centralpanel = new JPanel();
        centralpanel.setLayout(new BorderLayout());

        panelImage = new PanelImage();
        add(panelImage, BorderLayout.NORTH);

        panelBench = new PanelBench(this);
        add(panelBench, BorderLayout.CENTER);

        updateInformation();
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    public void addConsultantHoursDialog() {
        AddConsultantHoursDialog dialog = new AddConsultantHoursDialog(this);
        dialog.setVisible(true);
    }

    public void addConsultantAssignDialog() {
        AssignConsultantDialog dialog = new AssignConsultantDialog(this);
        dialog.setVisible(true);
    }

    public String getAverageHoursWorked() {
        return "" + benchManager.getHoursAverage();

    }

    public String getBusiestConsultant() {
        return "Bench's Busiest Consultant: "+ benchManager.getBusiestConsultant().getFullName();

    }

    public void removeConsultant(Consultant Consultant) {
//        if( Consultant != null )
//        {
//            if( !benchManager.removeConsultantFromBench( Consultant.getName( ) ) )
//            {
//                JOptionPane.showMessageDialog( this, ERROR_REMOVE, "Error", JOptionPane.ERROR_MESSAGE );
//            }
//            else
//            {
//                updateInformation( );
//                JOptionPane.showMessageDialog( this, CONFIRMATION_REMOVE, "Success", JOptionPane.INFORMATION_MESSAGE );
//            }
//        }
//        else
//        {
//            JOptionPane.showMessageDialog( this, "Select an com.planittesting.bma.Consultant", "Remove com.planittesting.bma.Consultant", JOptionPane.ERROR_MESSAGE );
//        }
    }

    public void updateInformation() {

        ArrayList<Consultant> consultants = new ArrayList<>();
        consultants.add(benchManager.getConsultant1());
        consultants.add(benchManager.getConsultant2());
        consultants.add(benchManager.getConsultant3());
        consultants.add(benchManager.getConsultant4());


        panelBench.refresh_consultants(consultants, benchManager.getNumberOfConsultantsAvailable());
        if (!consultants.isEmpty()) {
            panelBench.changeConsultantSelected(consultants.get(0));
        }

    }

    public void addConsultantHours(String name, String hours) {

        try {
            benchManager.addWorkHoursToConsultant(name, Integer.parseInt(hours));
            updateInformation();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "work in progress.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void assignConsultant(String name, boolean assign) {

        try {
            benchManager.assignConsultant(name, assign);
            updateInformation();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "work in progress.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }


    // -----------------------------------------------------------------
    // Main
    // -----------------------------------------------------------------

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            GUIBenchManager window = new GUIBenchManager();
            window.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
