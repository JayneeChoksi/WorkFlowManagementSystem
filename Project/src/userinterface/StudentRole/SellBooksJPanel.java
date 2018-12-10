/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.StudentRole;

import Business.BookstoreData.Book;
import Business.BookstoreData.BookDirectory;
import Business.Enterprise.Enterprise;
import Business.Logging.MyLogging;
import Business.Organization.AssisstantManagerOrganization;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.Organization.StudentOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.BookstoreAssisstantManagerWorkRequest;
import Business.WorkQueue.BookstoreWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ami Gandhi
 */
public class SellBooksJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SellBooksJPanel
     */
    BookDirectory bookdir;
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    Organization organization;
    
    public SellBooksJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount account, Organization organization) {
        initComponents();
        this.bookdir = new BookDirectory();
        this.userProcessContainer= userProcessContainer;
        this.enterprise=enterprise;
        this.account=account;
        this.organization=organization;
        firstNameText.setText(account.getUsername()+"");

        populateData();
        
    }
    
    public void populateData(){
        DefaultTableModel dtm = (DefaultTableModel) sellBooksJTable.getModel();
        dtm.setRowCount(0);
          
        for(BookstoreWorkRequest request : account.getWorkQueue().getBookstoreWorkRequestList()){
            if (!request.getStatus().equalsIgnoreCase("Purchased"))
             {
            Object[] row = new Object[9];
            row[0] = request.getfName();
            row[1] = request.getBookName();
            row[2] = request.getBookPrice();
            row[3] = request.getBookAuthor();
            row[4] = request.getBooktype();
            row[5] = request.getNoOfBooks();
            row[6] = request.getStatus();
            String result = ((BookstoreAssisstantManagerWorkRequest) request).getReport();
            row[7] = result == null ? "Waiting" : result;
            
            dtm.addRow(row);
            }
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        sellBooksJTable = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        sellButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        bookNameText = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        bookPriceTxt = new javax.swing.JTextField();
        bookAuthorTxt = new javax.swing.JTextField();
        booksComboBox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        booktypeComboBox = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        firstNameText = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        chatButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BOOK SELLING WORK AREA");

        sellBooksJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Username", "Book Name", "Book Price", "Book Author", "Book Type", "#Books", "Status", "Result"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(sellBooksJTable);
        if (sellBooksJTable.getColumnModel().getColumnCount() > 0) {
            sellBooksJTable.getColumnModel().getColumn(0).setResizable(false);
            sellBooksJTable.getColumnModel().getColumn(1).setResizable(false);
            sellBooksJTable.getColumnModel().getColumn(2).setResizable(false);
            sellBooksJTable.getColumnModel().getColumn(3).setResizable(false);
            sellBooksJTable.getColumnModel().getColumn(4).setResizable(false);
            sellBooksJTable.getColumnModel().getColumn(5).setResizable(false);
            sellBooksJTable.getColumnModel().getColumn(6).setResizable(false);
            sellBooksJTable.getColumnModel().getColumn(7).setResizable(false);
        }

        btnBack.setBackground(new java.awt.Color(102, 102, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        sellButton.setBackground(new java.awt.Color(102, 102, 102));
        sellButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sellButton.setText("SELL");
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Book Name : ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Book Price :");

        booksComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));
        booksComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksComboBoxActionPerformed(evt);
            }
        });
        booksComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                booksComboBoxActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Book Author :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Book Type :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("No Of Books :");

        booktypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "action", "fiction", "comedy", "romance", "drama" }));

        jButton2.setBackground(new java.awt.Color(102, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("VIEW SOLD REQUESTS");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        firstNameText.setEnabled(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Username :");

        chatButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chatButton.setText("CHAT");
        chatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chatButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel12))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(firstNameText, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                            .addComponent(bookNameText)))
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(booktypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(bookPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel9))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(booksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(47, 47, 47))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(chatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(firstNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(bookNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(bookPriceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(bookAuthorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(booksComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(booktypeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sellButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellButtonActionPerformed
        double bookPrice=0.0;
        String fname= account.getUsername();
        String bookName= bookNameText.getText();
                try{
                  bookPrice = Double.parseDouble(bookPriceTxt.getText());
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Enter a valid number for book price ");
                    return;
                }
        if(fname != null && fname.trim().length()>0 &&
                bookName != null && bookName.trim().length()>0)
        {
        String bookAuthor= bookAuthorTxt.getText();
        String booktype = (String) booktypeComboBox.getSelectedItem();
        int noOfBooks = Integer.parseInt((String) booksComboBox.getSelectedItem());
        String status = "Pending";
        bookdir.sellBooks(bookName, bookPrice, bookAuthor, booktype, noOfBooks, fname, status);


        //code to generate the  sell request of student in the queue of Manager

        BookstoreAssisstantManagerWorkRequest request = new BookstoreAssisstantManagerWorkRequest();

        request.setBookName(bookName);
        request.setBookPrice(bookPrice);
        request.setBookAuthor(bookAuthor);
        request.setBooktype(booktype);
        request.setNoOfBooks(noOfBooks);
        request.setfName(account.getUsername());
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

            managerOrg.getWorkQueue().getBookstoreWorkRequestList().add(request);
            //adding student request only to current student's account so that when other students log in they cant see current students request
            account.getWorkQueue().getBookstoreWorkRequestList().add(request);
            assistantManagerOrg.getWorkQueue().getBookstoreWorkRequestList().add(request);
        }
        
        populateData();

        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please enter all the value.");
        }
        MyLogging.log(Level.INFO, account.getUsername()+ "  from  "  + enterprise +"   Enterprise posted a sell request on dashboard"); 

    }//GEN-LAST:event_sellButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        SoldBooksJPanel sold = new SoldBooksJPanel(userProcessContainer,enterprise,account,organization);
        userProcessContainer.add("SoldBooksJPanel", sold);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void booksComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_booksComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_booksComboBoxActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
     // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void chatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chatButtonActionPerformed
        // TODO add your handling code here:

        System.out.println("2");
        TestChat_Client cc = new TestChat_Client();
        //chat_client cc = new chat_client();
        cc.setVisible(true);
        System.out.println("21");
    }//GEN-LAST:event_chatButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bookAuthorTxt;
    private javax.swing.JTextField bookNameText;
    private javax.swing.JTextField bookPriceTxt;
    private javax.swing.JComboBox booksComboBox;
    private javax.swing.JComboBox booktypeComboBox;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton chatButton;
    private javax.swing.JTextField firstNameText;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable sellBooksJTable;
    private javax.swing.JButton sellButton;
    // End of variables declaration//GEN-END:variables
}
