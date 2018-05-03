/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DatabaseAmazon;

import java.sql.Connection;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author sswu
 */
public class BasicQueryUI extends javax.swing.JFrame {

    //private Connection _mysqlDB;
    private BasicQuery bQuery;
    private String asinSelected;
    private String cidSelected;
    /**
     * Creates new form BasicQueryUI
     */
    public BasicQueryUI(Connection mysqlDB) {
        initComponents();
        //_mysqlDB = mysqlDB;
        //jProductTable.setTableHeader(ne);
        sTableHeader();
        bQuery = new BasicQuery(mysqlDB);
        bQuery.prepareStatements();
    }
    
    //set table header
    private void sTableHeader() {
        
        Object[] colProduct = new String[]{"ASIN", "Title", "Salerank", "Type"};
        Object[] colReview = new String[]{"ASIN", "Customer ID", "Date", "Rating", "Vote"};
        //JTableHeader tableHeader = new JTableHeader();
        //tableHeader.
        //Object[][] obj = new Object[][]{};
        //DefaultTableModel modelProduct = new DefaultTableModel(obj, colProduct) {};
        //DefaultTableModel modelReview = new DefaultTableModel(obj, colReview){};
        DefaultTableModel modelProduct = new DefaultTableModel(0, 0);
        DefaultTableModel modelReview = new DefaultTableModel(0, 0);
        modelProduct.setColumnIdentifiers(colProduct);
        modelReview.setColumnIdentifiers(colReview);
        jProductTable.setModel(modelProduct);
        jReviewTable.setModel(modelReview);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTitle = new javax.swing.JTextField();
        jPidButton = new javax.swing.JButton();
        jTitleButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jProductTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jReviewTable = new javax.swing.JTable();
        jCustomerButton = new javax.swing.JButton();
        jCustomer = new javax.swing.JTextField();
        jPid = new javax.swing.JTextField();
        jReviewButton = new javax.swing.JButton();
        jSimilarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPidButton.setText("search by product id");
        jPidButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPidButtonActionPerformed(evt);
            }
        });

        jTitleButton.setText("search by title");
        jTitleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTitleButtonActionPerformed(evt);
            }
        });

        jProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jProductTable);

        jReviewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jReviewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jReviewTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jReviewTable);

        jCustomerButton.setText("search review by customer id");
        jCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCustomerButtonActionPerformed(evt);
            }
        });

        jReviewButton.setText("show reviews");
        jReviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReviewButtonActionPerformed(evt);
            }
        });

        jSimilarButton.setText("show similar group");
        jSimilarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSimilarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPidButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPid, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jTitleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSimilarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jReviewButton)
                        .addGap(154, 154, 154)
                        .addComponent(jCustomerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPidButton)
                    .addComponent(jTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTitleButton)
                    .addComponent(jPid, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSimilarButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jReviewButton)
                        .addComponent(jCustomerButton)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setProductTable(LinkedList<Product> list) {
        Product p;
        DefaultTableModel model = (DefaultTableModel)jProductTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < list.size(); ++i) {
            p = list.get(i);
            model.addRow(new Object[]{p.asin, p.title, p.salerank, p.type});
        }
    }
    
    private void jPidButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPidButtonActionPerformed
        // TODO add your handling code here:
        String asin = jPid.getText();
        System.out.println("Product asin: " + asin);
        LinkedList<Product> r = bQuery.searchByAsin(asin);
        setProductTable(r);
       
    }//GEN-LAST:event_jPidButtonActionPerformed

    private void jTitleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTitleButtonActionPerformed
        // TODO add your handling code here:
        String title = jTitle.getText();
        LinkedList<Product> r = bQuery.searchByTitle(title);
        setProductTable(r);
       
    }//GEN-LAST:event_jTitleButtonActionPerformed

    private void setReviewTable(LinkedList<Review> list) {
        Review r;
        DefaultTableModel model = (DefaultTableModel)jReviewTable.getModel();
        model.setRowCount(0);
        
        for (int i = 0; i < list.size(); ++i) {
            r = list.get(i);
            model.addRow(new Object[]{r.asin, r.cid, r.date, r.rating, r.vote});
        }
    }
    private void jReviewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReviewButtonActionPerformed
        // TODO add your handling code here:
        String asin = jPid.getText();
        LinkedList<Review> list = bQuery.searchReviewByAsin(asin);
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(this, "No reivew for this product");
            return;
        }
        setReviewTable(list);
        
    }//GEN-LAST:event_jReviewButtonActionPerformed

    private void jCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCustomerButtonActionPerformed
        // TODO add your handling code here:
        String cid = jCustomer.getText();
        LinkedList<Review> list = bQuery.searchReviewByCid(cid);
        
        setReviewTable(list);
        
    }//GEN-LAST:event_jCustomerButtonActionPerformed

    private void jSimilarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSimilarButtonActionPerformed
        // TODO add your handling code here:
        String asin = jPid.getText();
        
        LinkedList<Product> list = bQuery.searchSimilarGroup(asin);
        if (list.size() == 0) {
            JOptionPane.showMessageDialog(this, "No similar product for this product");
            return;
        }
        setProductTable(list);
        
    }//GEN-LAST:event_jSimilarButtonActionPerformed

    private void jProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jProductTableMouseClicked
        // TODO add your handling code here:
        int row = jProductTable.rowAtPoint(evt.getPoint());
        Object data = (Object) jProductTable.getValueAt(row, 0);
        asinSelected = (String)data;
        jPid.setText(asinSelected);
    }//GEN-LAST:event_jProductTableMouseClicked

    private void jReviewTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jReviewTableMouseClicked
        // TODO add your handling code here:
        int row = jReviewTable.rowAtPoint(evt.getPoint());
        Object data = (Object) jReviewTable.getValueAt(row, 1);
        cidSelected = (String)data;
        jCustomer.setText(cidSelected);
    }//GEN-LAST:event_jReviewTableMouseClicked

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BasicQueryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasicQueryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasicQueryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicQueryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new BasicQueryUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jCustomer;
    private javax.swing.JButton jCustomerButton;
    private javax.swing.JTextField jPid;
    private javax.swing.JButton jPidButton;
    private javax.swing.JTable jProductTable;
    private javax.swing.JButton jReviewButton;
    private javax.swing.JTable jReviewTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jSimilarButton;
    private javax.swing.JTextField jTitle;
    private javax.swing.JButton jTitleButton;
    // End of variables declaration//GEN-END:variables
}
