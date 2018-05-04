/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DatabaseAmazon;

import java.sql.Connection;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sswu
 */
public class AdvancedQueryUI extends javax.swing.JFrame {

    /**
     * Creates new form AdvancedQueryUI
     */
    
    private AdvancedQuery query;
    
    public AdvancedQueryUI(Connection mysqlDB) {
        initComponents();
        
        sTableHeader();
        query = new AdvancedQuery(mysqlDB);
        query.prepareStatements();
    }
    
    private void sTableHeader() {
        Object[] colCat = new String[]{"ID", "Name"};
        //Object[] colProduct = new String[]{"ASIN", "Title", "Salerank", "Type"};
        
        DefaultTableModel modelCat = new DefaultTableModel(0, 0);
        //DefaultTableModel modelProduct = new DefaultTableModel(0, 0);
        modelCat.setColumnIdentifiers(colCat);
        //modelProduct.setColumnIdentifiers(colProduct);
        jCatTable.setModel(modelCat);
  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboType = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jQ1 = new javax.swing.JTextField();
        jComboCustomer = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jQ2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jQ3Button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jCatTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jQ4 = new javax.swing.JTextField();
        jComboProduct = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MySQL");

        jComboType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please choose one type", "Book", "DVD", "Music", "Video" }));
        jComboType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTypeActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose a give type, which product has the highest sales rank? Show product name.");

        jComboCustomer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please choose one customer", "A1ROEAGQKVZXZO", "A3M32D4BHEHJA3", "ATVPDKIKX0DER", "A126EH6HX6ZDWX", "A3QN51Q4QSIHUG" }));
        jComboCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboCustomerActionPerformed(evt);
            }
        });

        jLabel2.setText("Choose a given customer, show the average rating of this customer.");

        jLabel3.setText("What categories of book have top salerank? ");

        jQ3Button.setText("Query");
        jQ3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jQ3ButtonActionPerformed(evt);
            }
        });

        jCatTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jCatTable);

        jLabel4.setText("In similar group, which product has the highest salerank? Show product name");

        jComboProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please choose a product", "1577943082", "B00000AU3R", "6472184", "2154129", "2250535" }));
        jComboProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jQ1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jQ2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jQ4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jQ3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jQ3Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setCategoryTable(LinkedList<Category> list) {
        Category c;
        DefaultTableModel model  = (DefaultTableModel)jCatTable.getModel();
        model.setRowCount(0);
        for (int i = 0; i < list.size(); ++i) {
            c = list.get(i);
            model.addRow(new Object[]{c.id, c.name});
        }
    }
    
    private void jComboTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTypeActionPerformed
        // TODO add your handling code here:
        long startTime = System.nanoTime();
        String value = jComboType.getSelectedItem().toString();
        
        String name = query.getHighestSalerank(value);
        jQ1.setText(name);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("MySQL function1 running time is: %f%n", (double)totalTime);
    }//GEN-LAST:event_jComboTypeActionPerformed

    private void jComboCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCustomerActionPerformed
        // TODO add your handling code here:
        long startTime = System.nanoTime();
        String value = jComboCustomer.getSelectedItem().toString();
        
        double avg = query.getAvgRatingByCustomerId(value);
        jQ2.setText(String.valueOf(avg));
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("MySQL function2 running time is: %f%n", (double)totalTime);
    }//GEN-LAST:event_jComboCustomerActionPerformed

    private void jQ3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQ3ButtonActionPerformed
        // TODO add your handling code here:
        long startTime = System.nanoTime();
        LinkedList<Category> list = query.getHighestSalerankOfCategory();
        setCategoryTable(list);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("MySQL function3 running time is: %f%n", (double)totalTime);
        
    }//GEN-LAST:event_jQ3ButtonActionPerformed

    private void jComboProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProductActionPerformed
        // TODO add your handling code here:
        long startTime = System.nanoTime();
        String value = jComboProduct.getSelectedItem().toString();
        String name = query.getHighestSalerankInSimilarGroup(value);
        jQ4.setText(name);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("MySQL function4 running time is: %f%n", (double)totalTime);
    }//GEN-LAST:event_jComboProductActionPerformed

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
            java.util.logging.Logger.getLogger(AdvancedQueryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvancedQueryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvancedQueryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvancedQueryUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdvancedQueryUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable jCatTable;
    private javax.swing.JComboBox<String> jComboCustomer;
    private javax.swing.JComboBox<String> jComboProduct;
    private javax.swing.JComboBox<String> jComboType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jQ1;
    private javax.swing.JTextField jQ2;
    private javax.swing.JButton jQ3Button;
    private javax.swing.JTextField jQ4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
