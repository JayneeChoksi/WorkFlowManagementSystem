/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AssistantManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Logging.MyLogging;
import Business.Organization.AssisstantManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccomodationAssisstantManagerWorkRequest;
import Business.WorkQueue.HouseholdAssisstantManagerWorkRequest;
import Business.WorkQueue.HouseholdWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jaynee
 */
public class HouseholdAssistantManagerWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Organization assistantManagerOrganization;
    private Enterprise enterprise;
    
    /**
     * Creates new form AssisstantManagerWorkAreaJPanel
     */
    public HouseholdAssistantManagerWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,Organization organization, EcoSystem business) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
       
       this.assistantManagerOrganization = (AssisstantManagerOrganization)organization;
        this.enterprise=enterprise;
       
        populateTable();
    }

   
    
    public void populateTable(){
       DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (HouseholdWorkRequest request : assistantManagerOrganization.getWorkQueue().getHouseholdWorkRequests()){
            Object[] row = new Object[6];
            row[0] = request;
            row[1]=request.getfName();
            row[2] = request.getFurnitureType();
            row[3]=request.getCost();
            row[4]=request.getQuantity();
            row[5] = request.getStatus();
            
            model.addRow(row);
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
        workRequestJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        resultTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Result", "Username", "Furniture Type", "Quantity", "Cost", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);
        if (workRequestJTable.getColumnModel().getColumnCount() > 0) {
            workRequestJTable.getColumnModel().getColumn(0).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(1).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(2).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(3).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(4).setResizable(false);
            workRequestJTable.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 490, 110));

        processJButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        processJButton.setText("PROCESS REQUEST");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, 40));

        resultTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTxtActionPerformed(evt);
            }
        });
        add(resultTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("HOUSEHOLD ASSISSTANT MANAGER WORK AREA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Decision:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        String result =resultTxt.getText();
        int selectedRow = workRequestJTable.getSelectedRow();
        if(result!= null && result.trim().length()>0)
        {
            if (selectedRow < 0){
                JOptionPane.showMessageDialog(null, "Please select a row");
                return;
            }

        HouseholdAssisstantManagerWorkRequest request = (HouseholdAssisstantManagerWorkRequest)workRequestJTable.getValueAt(selectedRow,0);
        String currentState=request.getStatus();
        
        
        switch(currentState.toUpperCase())
        {
            case "PENDING":
                JOptionPane.showMessageDialog(null, "Request is not yet processed by manager.");
                 
                break;
            case "PROCESSING":
                JOptionPane.showMessageDialog(null, "Request is completed");
                request.setStatus("Completed");
                request.setTestResult(result);
                break;
            case "COMPLETED":
                JOptionPane.showMessageDialog(null, "Request is  already Completed by you ");
                break;
            case "ADDED TO CART":
                JOptionPane.showMessageDialog(null, "Request is  already Completed by you");
                break;
            case "PURCHASED":
                JOptionPane.showMessageDialog(null, "Request is  already  Completed by you.");
                break;
                
            }   

            populateTable();
            MyLogging.log(Level.INFO, userAccount.getUsername()+ "  from  "  + enterprise +"  Completed the request"); 
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter decision.");
        }
        
    }//GEN-LAST:event_processJButtonActionPerformed

    private void resultTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTextField resultTxt;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
