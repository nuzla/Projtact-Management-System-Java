/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

import Model.DataHandler;
import Model.LargeProject;
import Model.MiniProject;
import Model.Project;
import javax.swing.JOptionPane;

/**
 *
 * @author Nuzla
 */
public class FrameMiniProject extends javax.swing.JInternalFrame {

    /**
     * Creates new form AddProject
     */
    public FrameMiniProject() {
        initComponents();
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblProjectName = new javax.swing.JLabel();
        lblProjectId = new javax.swing.JLabel();
        lblProjectDescription = new javax.swing.JLabel();
        lblPlatform = new javax.swing.JLabel();
        lblDuration = new javax.swing.JLabel();
        lblTeamLeader = new javax.swing.JLabel();
        txtProjectName = new javax.swing.JTextField();
        txtProjectId = new javax.swing.JTextField();
        txtTeamLeader = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaProjectDescription = new javax.swing.JTextArea();
        cmbPlatform = new javax.swing.JComboBox();
        btnSave = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        cmbDuration = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(255, 204, 204));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        setClosable(true);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblProjectName.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProjectName.setText("Project Name");

        lblProjectId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProjectId.setText("Project ID");

        lblProjectDescription.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblProjectDescription.setText("Project Description");

        lblPlatform.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPlatform.setText("Platform");

        lblDuration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblDuration.setText("Duration");

        lblTeamLeader.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTeamLeader.setText("Team Leader");

        txtProjectName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txtProjectId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txtTeamLeader.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        txtAreaProjectDescription.setColumns(20);
        txtAreaProjectDescription.setRows(5);
        txtAreaProjectDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane1.setViewportView(txtAreaProjectDescription);

        cmbPlatform.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbPlatform.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Windows", "Linux", "Mobile" }));
        cmbPlatform.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        btnClear.setLabel("Clear");

        cmbDuration.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cmbDuration.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 Week", "2 Weeks", "3 Weeks", "1 Month", "2 Months", " " }));
        cmbDuration.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblProjectName)
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtProjectId, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(txtProjectName)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTeamLeader)
                            .addComponent(lblProjectId)
                            .addComponent(lblProjectDescription)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblPlatform)
                                .addComponent(lblDuration)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(txtTeamLeader, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbPlatform, 0, 186, Short.MAX_VALUE)
                                    .addComponent(cmbDuration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProjectName)
                            .addComponent(txtProjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProjectId)
                            .addComponent(txtProjectId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProjectDescription)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(lblDuration)
                        .addGap(18, 18, 18)
                        .addComponent(lblTeamLeader))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbPlatform, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlatform))
                        .addGap(18, 18, 18)
                        .addComponent(cmbDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtTeamLeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
                                             
        MiniProject project = new MiniProject();
        project.setDesc(txtAreaProjectDescription.getText());
        project.setLeader(txtTeamLeader.getText());
        project.setPlatform((String)cmbPlatform.getSelectedItem());
        project.setProjectId(txtProjectId.getText());
        project.setProjectName(txtProjectName.getText());
        project.setTime(cmbDuration.getSelectedIndex());
        
       try{
        DataHandler.getInstance().deleteProjectById(txtProjectId.getText());}catch(IndexOutOfBoundsException e){}
        DataHandler.getInstance().add(project);
        
        JOptionPane.showInternalMessageDialog(this, "Entry added/updated!");
        this.dispose();
    
    }//GEN-LAST:event_btnSaveActionPerformed

    public void showMiniProject(MiniProject p){
        
        
       txtProjectName.setText(p.getProjectName());
       txtProjectId.setText(p.getProjectId());
       txtAreaProjectDescription.setText(p.getDesc());
       
       cmbPlatform.setSelectedItem(p.getPlatform());
        cmbDuration.setSelectedIndex(p.getTime());
        
        txtTeamLeader.setText(p.getLeader());
       
    btnSave.setText("Update");
    txtProjectId.setEditable(false);
    }
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox cmbDuration;
    private javax.swing.JComboBox cmbPlatform;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblPlatform;
    private javax.swing.JLabel lblProjectDescription;
    private javax.swing.JLabel lblProjectId;
    private javax.swing.JLabel lblProjectName;
    private javax.swing.JLabel lblTeamLeader;
    private javax.swing.JTextArea txtAreaProjectDescription;
    private javax.swing.JTextField txtProjectId;
    private javax.swing.JTextField txtProjectName;
    private javax.swing.JTextField txtTeamLeader;
    // End of variables declaration//GEN-END:variables
}
