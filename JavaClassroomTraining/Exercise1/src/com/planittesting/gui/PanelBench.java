package com.planittesting.gui;

import com.planittesting.bma.Consultant;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class PanelBench extends JPanel implements ActionListener, ListSelectionListener {
    // -----------------------------------------------------------------
    // Constants
    // -----------------------------------------------------------------

    public final static String BENCH_TITLE = "Planit Testing Bench";
    public final static String ADD = "Add Time";
    public final static String REMOVE = "Assign/UnAssign";
    public final static String OPT1 = "Get Average";
    public final static String OPT2 = "Get Busiest";
    public final static String Available = "Unassigned Consultants: ";


    // -----------------------------------------------------------------
    // Attributes
    // -----------------------------------------------------------------

    private GUIBenchManager guiManager;

    private JScrollPane scroll;
    private JList consultants;

    private JLabel lblConsultantName;
    private JLabel lblConsultantHours;
    private JLabel lblUnassignedConsultants;

    private JLabel lblConsultantJoinDate;

    private JTextField txtConsultantName;
    private JTextField txtConsultantHours;
    private JTextField txtUnassignedConsultants;
    private JTextField txtConsultantJoinDate;

    private JButton btnAdd;
    private JButton btnRemove;
    private JButton btnOpt1;
    private JButton btnOpt2;

    // -----------------------------------------------------------------
    // Constructors
    // -----------------------------------------------------------------

    public PanelBench(GUIBenchManager manager) {
        this.guiManager = manager;
        setLayout(new BorderLayout());

        JPanel consultant = new JPanel();
        consultant.setLayout(new GridLayout(5, 1));
        consultant.setBorder(new EmptyBorder(10, 10, 10, 10));

        lblConsultantName = new JLabel("Consultant Name: ");
        consultant.add(lblConsultantName);
        txtConsultantName = new JTextField();
        txtConsultantName.setEditable(false);
        consultant.add(txtConsultantName);

        lblConsultantHours = new JLabel("Hours: ");
        consultant.add(lblConsultantHours);
        txtConsultantHours = new JTextField();
        txtConsultantHours.setEditable(false);
        consultant.add(txtConsultantHours);

        lblUnassignedConsultants = new JLabel(Available);
        consultant.add(lblUnassignedConsultants);


//        lblConsultantJoinDate = new JLabel( "Since: " );
//        consultant.add(lblConsultantJoinDate);
//        txtConsultantJoinDate = new JTextField( );
//        txtConsultantJoinDate.setEditable( false );
//        consultant.add(txtConsultantJoinDate);

        JPanel buttons = new JPanel();
        buttons.setBorder(new EmptyBorder(10, 10, 10, 10));
        buttons.setLayout(new GridLayout(1, 1));

        btnRemove = new JButton(REMOVE);
        btnRemove.addActionListener(this);
        btnRemove.setActionCommand(REMOVE);
        buttons.add(btnRemove);

        btnAdd = new JButton(ADD);
        btnAdd.addActionListener(this);
        btnAdd.setActionCommand(ADD);
        buttons.add(btnAdd);

        btnOpt1 = new JButton(OPT1);
        btnOpt1.addActionListener(this);
        btnOpt1.setActionCommand(OPT1);
        buttons.add(btnOpt1);

        btnOpt2 = new JButton(OPT2);
        btnOpt2.addActionListener(this);
        btnOpt2.setActionCommand(OPT2);
        buttons.add(btnOpt2);

        JPanel wrapper = new JPanel();
        wrapper.setLayout(new BorderLayout());
        wrapper.setBorder(new TitledBorder("Consultant Information Summary"));
        wrapper.add(consultant, BorderLayout.NORTH);
        wrapper.add(buttons, BorderLayout.SOUTH);

        consultants = new JList();
        consultants.addListSelectionListener(this);
        consultants.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        consultants.setLayoutOrientation(JList.VERTICAL);
        consultants.setVisibleRowCount(-1);

        scroll = new JScrollPane(consultants);
        setBorder(new TitledBorder(BENCH_TITLE));
        scroll.setViewportView(consultants);
        scroll.setVerticalScrollBarPolicy(javax.swing.JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        wrapper.add(scroll, BorderLayout.CENTER);
        add(wrapper, BorderLayout.CENTER);
    }

    // -----------------------------------------------------------------
    // Methods
    // -----------------------------------------------------------------

    public void refresh_consultants(ArrayList<Consultant> consultants, int consultantsAvailable) {
        this.consultants.setListData(consultants.toArray());
        this.lblUnassignedConsultants.setText(Available + consultantsAvailable);
    }

    public void changeConsultantSelected(Consultant emp) {
        this.consultants.setSelectedValue(emp, true);
    }

    public void valueChanged(ListSelectionEvent e) {
        if (consultants.getSelectedValue() != null) {
            Consultant consultant = (Consultant) consultants.getSelectedValue();
            txtConsultantName.setText(consultant.getFullName());
            txtConsultantHours.setText(consultant.getHours() + "");

        } else {
            txtConsultantName.setText("");
            txtConsultantHours.setText("");
        }
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equalsIgnoreCase(ADD)) {
            guiManager.addConsultantHoursDialog();
        } else if (cmd.equalsIgnoreCase(REMOVE)) {
            guiManager.addConsultantAssignDialog();
        } else if (cmd.equalsIgnoreCase(OPT1)) {

            JOptionPane.showMessageDialog(this, guiManager.getAverageHoursWorked(), "Average Time Worked", JOptionPane.INFORMATION_MESSAGE);

        } else if (cmd.equalsIgnoreCase(OPT2)) {
            JOptionPane.showMessageDialog(this, guiManager.getBusiestConsultant(), "Busiest Consultant", JOptionPane.INFORMATION_MESSAGE);
        }
    }

}
