/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package View;

/**
 *
 * @author Nuzla
 */
public class AboutWindow extends javax.swing.JInternalFrame {

    /**
     * Creates new form AboutWindow
     */
    public AboutWindow() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtAboutWindow = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(255, 204, 204));

        txtAboutWindow.setColumns(20);
        txtAboutWindow.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        txtAboutWindow.setRows(5);
        txtAboutWindow.setText("Company Name: NANOSOFT\n\n   (NANOSOFT is a modern software development company in Sri Lanka.\n We develop Windows, Linux and Mobile base software based on our customer requests.\n At present, less than 100 permanent and temporary employees are employed in the company) \n\n Developer      : F.N.ISMAIL  \n\n Index Number : AS2012393");
        jScrollPane1.setViewportView(txtAboutWindow);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 754, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    
    
    
    
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAboutWindow;
    // End of variables declaration//GEN-END:variables
}
