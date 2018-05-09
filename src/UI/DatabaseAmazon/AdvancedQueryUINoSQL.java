/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DatabaseAmazon;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import com.mongodb.BasicDBObject;
import com.mongodb.client.AggregateIterable;
import org.bson.Document;
import com.mongodb.client.FindIterable; 
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Accumulators;
import static com.mongodb.client.model.Accumulators.avg;
import static com.mongodb.client.model.Accumulators.sum;
import com.mongodb.client.model.Aggregates;
import static com.mongodb.client.model.Aggregates.group;
import static com.mongodb.client.model.Aggregates.limit;
import static com.mongodb.client.model.Aggregates.lookup;
import static com.mongodb.client.model.Aggregates.match;
import static com.mongodb.client.model.Aggregates.out;
import static com.mongodb.client.model.Aggregates.sort;
import com.mongodb.client.model.Filters;
import static com.mongodb.client.model.Filters.eq;
import com.mongodb.client.model.Indexes;
import static com.mongodb.client.model.Indexes.descending;
import java.util.Iterator; 
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import static com.mongodb.client.model.Projections.excludeId;
import static com.mongodb.client.model.Projections.fields;
import static com.mongodb.client.model.Projections.include;
import com.mongodb.client.model.Sorts;
import static com.mongodb.client.model.Sorts.orderBy;



/**
 *
 * @author Lei Luo
 */
public class AdvancedQueryUINoSQL extends javax.swing.JFrame {

    /**
     * Creates new form AdvancedQueryUI
     */
    
    private AdvancedQuery query;
    private MongoDatabase mongodb;
    
    public AdvancedQueryUINoSQL(MongoDatabase mongodb) {
        this.mongodb = mongodb;
        initComponents();
        
        sTableHeader();
     //   query = new AdvancedQuery(mongodb);
     //   query.prepareStatements();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NoSQL");

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

        jComboProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please choose a product", "1577943082", "1577943279", "1577943422", "1577944437", "1578004306" }));
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jQ3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jQ4))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jQ1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQ2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jQ3Button))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jQ4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(228, Short.MAX_VALUE))
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
        
        System.out.println(this.mongodb.getName());
        
        MongoIterable<String> colls = this.mongodb.listCollectionNames();

        
        MongoCollection<Document> collection = this.mongodb.getCollection("product");
        
        collection.createIndex(new BasicDBObject().append("salerank", 1));
        collection.createIndex(new BasicDBObject().append("type", 1));

        FindIterable<Document> iterDoc = collection.find(new BasicDBObject().append("type", value)).sort(new BasicDBObject().append("salerank", -1));

        // Getting the iterator 
        Iterator it = iterDoc.iterator(); 

        jQ1.setText(iterDoc.first().getString("title"));
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("NoSQL function1 running time is: %f%n", (double)totalTime);
    }//GEN-LAST:event_jComboTypeActionPerformed

    private void jComboCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboCustomerActionPerformed
        // TODO add your handling code here:
        long startTime = System.nanoTime();
        String value = jComboCustomer.getSelectedItem().toString();
        
        MongoCollection<Document> review = this.mongodb.getCollection("review");

        
        List<Document> pipeline = new ArrayList<Document>(); 
        
        review.createIndex(new BasicDBObject().append("cid", 1));
        review.createIndex(new BasicDBObject().append("rating", 1));
        review.createIndex(new BasicDBObject().append("review_date", 1));
        review.createIndex(new BasicDBObject().append("vote", 1));
        review.createIndex(new BasicDBObject().append("asin", 1));
        review.createIndex(new BasicDBObject().append("id", 1));

       AggregateIterable<Document> iterDoc = review.aggregate(Arrays.asList(Aggregates.match(Filters.eq("cid", value)),
               Aggregates.group("$review", Accumulators.avg("rating", "$rating"))));//sum("count", 1)
       Iterator it = iterDoc.iterator(); 
    

        jQ2.setText(iterDoc.first().getDouble("rating").toString());
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("NoSQL function2 running time is: %f%n", (double)totalTime);
    }//GEN-LAST:event_jComboCustomerActionPerformed

    private void jQ3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jQ3ButtonActionPerformed
        // TODO add your handling code here:
        long startTime = System.nanoTime();
        
        MongoCollection<Document> product = this.mongodb.getCollection("product");
        MongoCollection<Document> belongTo = this.mongodb.getCollection("belongTo");
        MongoCollection<Document> category = this.mongodb.getCollection("category");

        product.createIndex(new BasicDBObject().append("salerank", 1));
        product.createIndex(new BasicDBObject().append("type", 1));
        belongTo.createIndex(new BasicDBObject().append("asin", 1));
        category.createIndex(new BasicDBObject().append("cat_id", 1));
        AggregateIterable<Document> iterDoc = product.aggregate(Arrays.asList(
                                    match(eq("type", "Book")),
                                   sort(orderBy(descending("salerank"))),
                                   limit(5),
                                   lookup("belongTo", "asin", "asin", "cat_id"),
                                   lookup("category", "cat_id.cat_id", "cat_id", "category"),
                                   Aggregates.project(fields(include("category"), excludeId()))
                                   
        ));
        LinkedList<Category> list = new LinkedList<>();  
        Iterator it = iterDoc.iterator(); 
        int i = 0;
        while (it.hasNext() && i < 5) {  
            Document doc = (Document)it.next();
            List<Document> docList = (ArrayList<Document>)doc.get("category");
            Document doc2 = (Document)docList.get(0);
            list.add(new Category(doc2.getInteger("cat_id"), doc2.getString("name")));
            i++;
        }
        setCategoryTable(list);
        
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("NoSQL function3 running time is: %f%n", (double)totalTime);
        
    }//GEN-LAST:event_jQ3ButtonActionPerformed

    private void jComboProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboProductActionPerformed
        // TODO add your handling code here:
        long startTime = System.nanoTime();
        String value = jComboProduct.getSelectedItem().toString();
        MongoCollection<Document> product = this.mongodb.getCollection("product");
        MongoCollection<Document> similarTo = this.mongodb.getCollection("similarTo");
        
        product.createIndex(new BasicDBObject().append("asin", 1));
        similarTo.createIndex(new BasicDBObject().append("asin1", 1));
        similarTo.createIndex(new BasicDBObject().append("asin2", 1));
        
        AggregateIterable<Document> iterDoc = product.aggregate(Arrays.asList(
                                    Aggregates.match(Filters.eq("asin", value)),
                                    Aggregates.lookup("similarTo", "asin", "asin1", "simi_pro"),
                                    Aggregates.lookup("product", "simi_pro.asin2", "asin", "similar_product"),
                                    Aggregates.project(fields(include("similar_product"), excludeId())),
                                    Aggregates.project(fields(include("similar_product.asin","similar_product.title","similar_product.salerank","similar_product.type"), excludeId()))
                   ));
        
        List<Document> _list = (List)(iterDoc.first().get("similar_product"));
        Iterator<Document> it = _list.iterator(); 
        int max = Integer.MIN_VALUE;
        String title = "";
        while (it.hasNext()) {  
            Document doc = it.next();
            int tmp = doc.getInteger("salerank");
            if (tmp > max) {
                max = tmp;
                title = doc.getString("title");
            }
        }
        jQ4.setText(title);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.printf("NoSQL function4 running time is: %f%n", (double)totalTime);
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
            java.util.logging.Logger.getLogger(AdvancedQueryUINoSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdvancedQueryUINoSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdvancedQueryUINoSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdvancedQueryUINoSQL.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
    // End of variables declaration//GEN-END:variables
}
