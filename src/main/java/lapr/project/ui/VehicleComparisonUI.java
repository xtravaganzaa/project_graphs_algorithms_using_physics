/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import lapr.project.controller.VehicleComparisonController;
import lapr.project.model.Junction;
import lapr.project.model.Vehicle;

/**
 *
 * @author Miguel Santos <1161386@isep.ipp.pt>
 */
public class VehicleComparisonUI extends javax.swing.JFrame {

    private static final long serialVersionUID = 1;
    VehicleComparisonController controller;
    private DefaultListModel<Vehicle> projectVehiclesModel;
    private DefaultListModel<Vehicle> comparisonVehiclesModel;

    /**
     * Creates new form VehicleComparisonUI
     */
    public VehicleComparisonUI(JFrame parent) {
        initComponents();
        projectVehiclesModel = new DefaultListModel<>();
        comparisonVehiclesModel = new DefaultListModel<>();
        controller = new VehicleComparisonController();
        projectNameTextField.setText(controller.getProjectName());

        projectVehicleJList.setModel(projectVehiclesModel);
        comparisonVehicleJList.setModel(comparisonVehiclesModel);

        for (Vehicle vehicle : controller.getProjectVehicleList()) {
            projectVehiclesModel.addElement(vehicle);
        }

        for (Junction junction : controller.getProjectJunctions()) {
            beginJunctionJCombobox.addItem(junction);
            endJunctionComboBox.addItem(junction);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        projectVehicleJList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        comparisonVehicleJList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        projectNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addVehicleJButton = new javax.swing.JButton();
        removeVehicleJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        beginJunctionJCombobox = new javax.swing.JComboBox<>();
        endJunctionComboBox = new javax.swing.JComboBox<>();
        compareJButton = new javax.swing.JButton();
        cancelJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        energyEfficientCheckbox = new javax.swing.JCheckBox();
        energySavingCheckbox = new javax.swing.JCheckBox();
        fastestPathCheckbox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        accelerationJTextField = new javax.swing.JTextField();
        accelerationUnitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jScrollPane1.setViewportView(projectVehicleJList);

        jScrollPane2.setViewportView(comparisonVehicleJList);

        jLabel1.setText("Active Project:");

        projectNameTextField.setEditable(false);
        projectNameTextField.setFocusable(false);
        projectNameTextField.setRequestFocusEnabled(false);

        jLabel2.setText("Project Vehicles");

        jLabel3.setText("Comparison Vehicles");

        addVehicleJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/green_arrow_icon.png"))); // NOI18N
        addVehicleJButton.setText("Add Vehicle");
        addVehicleJButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        addVehicleJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVehicleJButtonActionPerformed(evt);
            }
        });

        removeVehicleJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red_arrow_icon.png"))); // NOI18N
        removeVehicleJButton.setText("Remove Vehicle");
        removeVehicleJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeVehicleJButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Begin Junction:");

        jLabel5.setText("End Junction:");

        compareJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/statistic_icon.png"))); // NOI18N
        compareJButton.setText("Get Results");
        compareJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compareJButtonActionPerformed(evt);
            }
        });

        cancelJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return_icon.png"))); // NOI18N
        cancelJButton.setText("Cancel");
        cancelJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelJButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Algorithms:");

        energyEfficientCheckbox.setForeground(new java.awt.Color(0, 51, 204));
        energyEfficientCheckbox.setText("Energy Efficient Path");
        energyEfficientCheckbox.setToolTipText("");
        energyEfficientCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                energyEfficientCheckboxActionPerformed(evt);
            }
        });

        energySavingCheckbox.setForeground(new java.awt.Color(0, 153, 0));
        energySavingCheckbox.setText("Energy Saving Mode Path");
        energySavingCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                energySavingCheckboxActionPerformed(evt);
            }
        });

        fastestPathCheckbox.setForeground(new java.awt.Color(255, 0, 0));
        fastestPathCheckbox.setText("Fastest Path");
        fastestPathCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastestPathCheckboxActionPerformed(evt);
            }
        });

        jLabel7.setText("Acceleration:");

        accelerationJTextField.setText("0");
        accelerationJTextField.setEnabled(false);

        accelerationUnitLabel.setText("m/s²");
        accelerationUnitLabel.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(44, 44, 44))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(removeVehicleJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(addVehicleJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(projectNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancelJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compareJButton)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(122, 122, 122)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(beginJunctionJCombobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(endJunctionComboBox, 0, 158, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(energyEfficientCheckbox)
                                            .addComponent(fastestPathCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26))
                                    .addComponent(energySavingCheckbox))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(accelerationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(accelerationUnitLabel)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(projectNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(addVehicleJButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeVehicleJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(beginJunctionJCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(endJunctionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(accelerationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accelerationUnitLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compareJButton)
                            .addComponent(cancelJButton))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fastestPathCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(energyEfficientCheckbox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(energySavingCheckbox)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addVehicleJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVehicleJButtonActionPerformed
        try {
            if (!projectVehiclesModel.isEmpty()) {
                comparisonVehiclesModel.addElement(projectVehiclesModel.getElementAt(projectVehicleJList.getSelectedIndex()));
                projectVehiclesModel.removeElement(projectVehiclesModel.getElementAt(projectVehicleJList.getSelectedIndex()));
            } else {
                JOptionPane.showMessageDialog(this, "There are no vehicles to add", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No vehicle selected", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addVehicleJButtonActionPerformed

    private void compareJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compareJButtonActionPerformed
        boolean valid = true;
        if (!energyEfficientCheckbox.isSelected() && !energySavingCheckbox.isSelected() && !fastestPathCheckbox.isSelected()) {
            JOptionPane.showMessageDialog(this, "Please select an algorithm first!", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        if (beginJunctionJCombobox.getSelectedItem().equals(endJunctionComboBox.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "Please select different junctions", "ERROR", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }

        for (int i = 0; i < comparisonVehiclesModel.size(); i++) {
            controller.bestPath(fastestPathCheckbox.isEnabled(), energyEfficientCheckbox.isEnabled(), energySavingCheckbox.isEnabled(), (Junction) beginJunctionJCombobox.getSelectedItem(), (Junction) endJunctionComboBox.getSelectedItem(), comparisonVehiclesModel.get(i), Double.parseDouble(accelerationJTextField.getText()));
            controller.addResult();
        }
        if (valid) {
            AlgorithmVehicleResultsUI ui = new AlgorithmVehicleResultsUI(this, controller.getResultsList());
            ui.setVisible(true);
        }
    }//GEN-LAST:event_compareJButtonActionPerformed

    private void cancelJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelJButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cancelJButtonActionPerformed

    private void energyEfficientCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_energyEfficientCheckboxActionPerformed
        if (energyEfficientCheckbox.isSelected()) {
            fastestPathCheckbox.setSelected(false);
            energySavingCheckbox.setSelected(false);
        }
    }//GEN-LAST:event_energyEfficientCheckboxActionPerformed

    private void energySavingCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_energySavingCheckboxActionPerformed
        if (energySavingCheckbox.isSelected()) {
            accelerationJTextField.setEnabled(true);
            fastestPathCheckbox.setSelected(false);
            energyEfficientCheckbox.setSelected(false);
        }
    }//GEN-LAST:event_energySavingCheckboxActionPerformed

    private void fastestPathCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastestPathCheckboxActionPerformed
        if (fastestPathCheckbox.isSelected()) {
            accelerationJTextField.setEnabled(true);
            accelerationJTextField.setEnabled(false);
            energyEfficientCheckbox.setSelected(false);
            energySavingCheckbox.setSelected(false);
        }
    }//GEN-LAST:event_fastestPathCheckboxActionPerformed

    private void removeVehicleJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeVehicleJButtonActionPerformed
        try {
            if (!comparisonVehiclesModel.isEmpty()) {
                projectVehiclesModel.addElement(comparisonVehiclesModel.getElementAt(comparisonVehicleJList.getSelectedIndex()));
                comparisonVehiclesModel.removeElement(comparisonVehiclesModel.getElementAt(comparisonVehicleJList.getSelectedIndex()));
            } else {
                JOptionPane.showMessageDialog(this, "There are no vehicles to remove", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "No vehicle selected", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_removeVehicleJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accelerationJTextField;
    private javax.swing.JLabel accelerationUnitLabel;
    private javax.swing.JButton addVehicleJButton;
    private javax.swing.JComboBox<Junction> beginJunctionJCombobox;
    private javax.swing.JButton cancelJButton;
    private javax.swing.JButton compareJButton;
    private javax.swing.JList<Vehicle> comparisonVehicleJList;
    private javax.swing.JComboBox<Junction> endJunctionComboBox;
    private javax.swing.JCheckBox energyEfficientCheckbox;
    private javax.swing.JCheckBox energySavingCheckbox;
    private javax.swing.JCheckBox fastestPathCheckbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField projectNameTextField;
    private javax.swing.JList<Vehicle> projectVehicleJList;
    private javax.swing.JButton removeVehicleJButton;
    // End of variables declaration//GEN-END:variables
}
