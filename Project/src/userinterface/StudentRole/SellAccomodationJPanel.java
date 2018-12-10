/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.AccomodationData.SellAccomodation;
import Business.AccomodationData.SellAccomodationDirectory;
import Business.Enterprise.Enterprise;
import Business.Logging.MyLogging;
import Business.Organization.AssisstantManagerOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.StudentOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccomodationAssisstantManagerWorkRequest;
import Business.WorkQueue.AccomodationWorkRequest;
import Business.WorkQueue.BookstoreAssisstantManagerWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.AssistantManagerRole.AssistantAccomodationManagerWorkAreaJPanel;
import userinterface.MainJFrame;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author Charmy
 */
public class SellAccomodationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SellAccomodationJPanel
     */
    SellAccomodationDirectory sellAccDir;
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount userAccount;
    Organization organization;
    
    public SellAccomodationJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount,Organization organization) {
        initComponents();
          this.sellAccDir = new SellAccomodationDirectory();
          this.userProcessContainer=userProcessContainer;
          this.enterprise=enterprise;
          this.userAccount=userAccount;
          this.organization=(StudentOrganization)organization;
          firstNameText.setText(userAccount.getUsername()+"");
          populateData();
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
        sellAccTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        apptSizeComboBox = new javax.swing.JComboBox();
        bathroomsComboBox = new javax.swing.JComboBox();
        mattressComboBox = new javax.swing.JComboBox();
        rentTextField = new javax.swing.JTextField();
        tenantsComboBox = new javax.swing.JComboBox();
        groceriesComboBox = new javax.swing.JComboBox();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0));
        jButton1 = new javax.swing.JButton();
        createButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        firstNameText = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        chatButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sellAccTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Appt Size", "No Of Bathroom", "Rent", "No Of Tenants", "Mattress Provided", "Groceries Provided", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sellAccTable);
        if (sellAccTable.getColumnModel().getColumnCount() > 0) {
            sellAccTable.getColumnModel().getColumn(0).setResizable(false);
            sellAccTable.getColumnModel().getColumn(1).setResizable(false);
            sellAccTable.getColumnModel().getColumn(2).setResizable(false);
            sellAccTable.getColumnModel().getColumn(3).setResizable(false);
            sellAccTable.getColumnModel().getColumn(4).setResizable(false);
            sellAccTable.getColumnModel().getColumn(5).setResizable(false);
            sellAccTable.getColumnModel().getColumn(6).setResizable(false);
            sellAccTable.getColumnModel().getColumn(7).setResizable(false);
            sellAccTable.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Appt. Size");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("No Of Bathrooms");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mattress Provided");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Rent");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("No. of Tenants");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Grocerie Included");

        apptSizeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 BHK", "2 BHK", "3 BHK", " " }));
        apptSizeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apptSizeComboBoxActionPerformed(evt);
            }
        });

        bathroomsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "1.5", "2", "3" }));

        mattressComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));

        tenantsComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        groceriesComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Yes", "No" }));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        createButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        createButton.setText("SELL");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Username");

        firstNameText.setEnabled(false);
        firstNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("VIEW SOLD REQUESTS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        chatButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chatButton.setText("CHAT");
        chatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("ACCOMMODATION SELLING WORK AREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(bathroomsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(122, 122, 122)
                            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(427, 427, 427))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel7))
                            .addGap(61, 61, 61)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(apptSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(480, 480, 480)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(groceriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mattressComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tenantsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(33, 33, 33)
                                    .addComponent(jLabel8))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(41, 41, 41)
                                    .addComponent(rentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(160, 160, 160))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createButton)
                .addGap(64, 64, 64)
                .addComponent(jButton2)
                .addGap(70, 70, 70)
                .addComponent(chatButton)
                .addGap(185, 185, 185))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(tenantsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(apptSizeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(groceriesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(mattressComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(bathroomsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rentTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(createButton)
                    .addComponent(chatButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void apptSizeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apptSizeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apptSizeComboBoxActionPerformed
    public void populateData()
    {
        DefaultTableModel model = (DefaultTableModel) sellAccTable.getModel();

        model.setRowCount(0);
//        for(SellAccomodation sellAcc: sellAccDir.getSellAccomodationDataList())
//        {
//            
//            Object row[] = new Object[10];
//            row[0]=sellAcc.getfName();
//            row[1]=sellAcc.getApptSize();
//            row[2]=sellAcc.getNoOfBathrooms();
//            row[3]=sellAcc.getRent();
//            row[4]=sellAcc.getNoOfTenants();
//            row[5]=sellAcc.getMattress();
//            row[6]=sellAcc.getGroceries();
//            row[7]=sellAcc.getStatus();
//            String result = sellAcc.getResult();
//            row[8] = result == null ? "Waiting" : result;
//           ((DefaultTableModel) sellAccTable.getModel()).addRow(row);
//        }
        
        
         for(AccomodationWorkRequest request : userAccount.getWorkQueue().getAccomodationWorkRequestList()){
            if (!request.getStatus().equalsIgnoreCase("Purchased"))
            {
               Object[] row = new Object[10];
               row[0] = request.getfName();
               row[1] = request.getApptSize();
               row[2]=request.getNoOfBathrooms();
               row[3]=request.getRent();
               row[4]=request.getNoOfTenants();
               row[5] =request.getGroceries();
               row[6]=request.getMattress();
               row[7]=request.getStatus();
               String result = ((AccomodationAssisstantManagerWorkRequest) request).getTestResult();
               row[8] = result == null ? "Waiting" : result;
               model.addRow(row);
            }
        }
    }
    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
                double rent = 0; 
                String apptSize = (String) apptSizeComboBox.getSelectedItem();
                double  noOfBathrooms = Double.parseDouble((String) bathroomsComboBox.getSelectedItem());
                String mattress =(String) mattressComboBox.getSelectedItem();
                
                try{
                 rent =Double.parseDouble(rentTextField.getText());
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Enter a valid number for the rent amount");
                    return;
                }
                int noOfTenants = Integer.parseInt((String) tenantsComboBox.getSelectedItem());
                String groceries = (String) groceriesComboBox.getSelectedItem();
                String fname= userAccount.getUsername();
                String status = "Pending";
                sellAccDir.sellAccomodationInformation(apptSize, noOfBathrooms, mattress, rent, noOfTenants, groceries, fname,status);
                
               
               //code to generate the  sell request of student in the queue of Manager
               
               AccomodationAssisstantManagerWorkRequest request = new AccomodationAssisstantManagerWorkRequest();
               
                request.setApptSize(apptSize);
                request.setNoOfBathrooms(noOfBathrooms);
                request.setNoOfTenants(noOfTenants);
                request.setMattress(mattress);
                request.setRent(rent);
                request.setGroceries(groceries);
                request.setfName(userAccount.getUsername());
                request.setStatus("Pending");
                
                
            
                Organization managerOrg = null;
                Organization studentOrg =null;
                Organization assistantManagerOrg=null;
                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                    if (organization instanceof ManagerOrganization){
                        managerOrg = organization;
                        break;
                    }
                }
         for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof StudentOrganization){
                studentOrg = organization;
                break;
            }
        }
          for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof AssisstantManagerOrganization){
                assistantManagerOrg = organization;
                break;
            }
        }
        if (managerOrg!=null && studentOrg!=null && assistantManagerOrg!=null ){
           
            managerOrg.getWorkQueue().getAccomodationWorkRequestList().add(request);
            //adding student request only to current student's account so that when other students log in they cant see current students request
            userAccount.getWorkQueue().getAccomodationWorkRequestList().add(request);
            assistantManagerOrg.getWorkQueue().getAccomodationWorkRequestList().add(request);
        }
        
        populateData();

        MyLogging.log(Level.INFO, userAccount.getUsername()+ "  from  "  + enterprise +"   Enterprise posted a sell request on dashboard"); 

                
    }//GEN-LAST:event_createButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
           
         SoldAccomodationJPanel sold = new SoldAccomodationJPanel(userProcessContainer,enterprise,userAccount,organization);
        userProcessContainer.add("SoldAccomodationJPanel", sold);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        StudentAccomodationWorkAreaJPanel sysAdminwjp = (StudentAccomodationWorkAreaJPanel) component;

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void chatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatButtonActionPerformed
        // TODO add your handling code here:

        System.out.println("2");
        TestChat_Client cc = new TestChat_Client();
        //chat_client cc = new chat_client();
        cc.setVisible(true);
        System.out.println("21");
    }//GEN-LAST:event_chatButtonActionPerformed

    private void firstNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox apptSizeComboBox;
    private javax.swing.JComboBox bathroomsComboBox;
    private javax.swing.JButton chatButton;
    private javax.swing.JButton createButton;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JComboBox groceriesComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox mattressComboBox;
    private javax.swing.JTextField rentTextField;
    private javax.swing.JTable sellAccTable;
    private javax.swing.JComboBox tenantsComboBox;
    // End of variables declaration//GEN-END:variables
}
