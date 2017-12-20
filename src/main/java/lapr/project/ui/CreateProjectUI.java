/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lapr.project.ui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import lapr.project.model.Project;
import lapr.project.model.Vehicle;
import lapr.project.utils.ImportException;
import lapr.project.utils.NetworkXML;
import lapr.project.utils.Session;
import lapr.project.utils.VehicleXML;

/**
 *
 * @author MarioDias
 */
public class CreateProjectUI extends JDialog {

    private JFileChooser m_jfc;

    protected Project m_project;
    boolean validProject;
    private static final long serialVersionUID = 1;
    private static final String IMPORT_NETWORK_TITLE = "Import RoadNetwork";
    private static final String IMPORT_VEHICLE_TITLE = "Import Vehicles";

    /**
     * Creates new form CreateProjectUI
     */
    public CreateProjectUI(JFrame parent) {
        super(parent, true);
        initComponents();
        m_project = new Project();
        initFileChooser();
        validProject = false;

    }

    public void initFileChooser() {
        m_jfc = new JFileChooser();
        FileNameExtensionFilter xmlfilter = new FileNameExtensionFilter("XML files (*.xml)", "xml");
        m_jfc.setFileFilter(xmlfilter);
        m_jfc.setCurrentDirectory(new File(System.getProperty("user.dir")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtfield_project_title = new javax.swing.JTextField();
        labelTitle = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        btnCreateProject = new javax.swing.JButton();
        btnImportRoadNetwork = new javax.swing.JButton();
        btnImportVehicle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtfld_description = new javax.swing.JTextArea();
        labelTitle1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create new project");

        txtfield_project_title.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfield_project_titleActionPerformed(evt);
            }
        });

        labelTitle.setText("Project title:");

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        btnCreateProject.setText("Create project");
        btnCreateProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateProjectActionPerformed(evt);
            }
        });

        btnImportRoadNetwork.setText("Import Road Network");
        btnImportRoadNetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportRoadNetworkActionPerformed(evt);
            }
        });

        btnImportVehicle.setText("Import Vehicle");
        btnImportVehicle.setToolTipText("");
        btnImportVehicle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportVehicleActionPerformed(evt);
            }
        });

        txtfld_description.setColumns(20);
        txtfld_description.setRows(5);
        jScrollPane1.setViewportView(txtfld_description);

        labelTitle1.setText("Description:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnClose)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCreateProject))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelTitle)
                                    .addComponent(labelTitle1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1)
                                    .addComponent(txtfield_project_title)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnImportVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(btnImportRoadNetwork)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfield_project_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTitle1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImportRoadNetwork)
                    .addComponent(btnImportVehicle))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClose)
                    .addComponent(btnCreateProject))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        dispose();
        

    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCreateProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateProjectActionPerformed
        String title = txtfield_project_title.getText().trim();
        String description = txtfld_description.getText().trim();
        m_project.setName(title);
        m_project.setDescription(description);
        try {
            if (m_project.validate()) {
                JOptionPane.showMessageDialog(this, "Project was created successfully", "Created a project", JOptionPane.INFORMATION_MESSAGE);
                Session.setActiveProject(m_project);
                dispose();
            }
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, "The project is invalid, it wasn't created, so it was reseted", "Error!", JOptionPane.ERROR_MESSAGE);
            m_project = new Project();
        }
    }//GEN-LAST:event_btnCreateProjectActionPerformed

    private void btnImportVehicleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportVehicleActionPerformed
        m_jfc.setDialogTitle(IMPORT_VEHICLE_TITLE);
        int returnvalue = m_jfc.showOpenDialog(this);
        if (returnvalue == JFileChooser.APPROVE_OPTION) {
            try {
                VehicleXML xml = new VehicleXML();
                File file = m_jfc.getSelectedFile();
                List<Vehicle> lista = xml.importVehicles(file);
                for (Vehicle v : lista) {
                    m_project.addVehicle(v);
                }
                JOptionPane.showMessageDialog(this, "Vehicle were imported with success.", "Vehicle import", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CreateProjectUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ImportException ex) {
                JOptionPane.showMessageDialog(this, "There was an error importing the file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnImportVehicleActionPerformed

    private void btnImportRoadNetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportRoadNetworkActionPerformed
        m_jfc.setDialogTitle(IMPORT_NETWORK_TITLE);
        int returnvalue = m_jfc.showOpenDialog(this);
        if (returnvalue == JFileChooser.APPROVE_OPTION) {
            try {
                NetworkXML xml = new NetworkXML();
                File file = m_jfc.getSelectedFile();
                xml.importNetwork(m_project, file);
                JOptionPane.showMessageDialog(this, "Roadnetwork was imported with success.", "Roadnetwork import", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CreateProjectUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ImportException ex) {
                JOptionPane.showMessageDialog(this, "There was an error importing the file", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnImportRoadNetworkActionPerformed

    private void txtfield_project_titleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfield_project_titleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfield_project_titleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCreateProject;
    private javax.swing.JButton btnImportRoadNetwork;
    private javax.swing.JButton btnImportVehicle;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JLabel labelTitle1;
    private javax.swing.JTextField txtfield_project_title;
    private javax.swing.JTextArea txtfld_description;
    // End of variables declaration//GEN-END:variables
}
