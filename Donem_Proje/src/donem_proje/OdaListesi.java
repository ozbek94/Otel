/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donem_proje;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class OdaListesi extends javax.swing.JFrame {
    Database db;
    Connection connection;
    Statement statement = null;
    ArrayList arrayList = new ArrayList();

    public OdaListesi() {
        initComponents();
        db = new Database();
        connection = (Connection) db.getConnection();
        yükle();
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
        oda_tablo = new javax.swing.JTable();
        GeriGel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        oda_tablo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        oda_tablo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Oda NO", "Türü", "Kalan"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        oda_tablo.setRowHeight(25);
        jScrollPane1.setViewportView(oda_tablo);
        if (oda_tablo.getColumnModel().getColumnCount() > 0) {
            oda_tablo.getColumnModel().getColumn(0).setMinWidth(75);
            oda_tablo.getColumnModel().getColumn(0).setPreferredWidth(75);
            oda_tablo.getColumnModel().getColumn(0).setMaxWidth(75);
            oda_tablo.getColumnModel().getColumn(1).setMinWidth(120);
            oda_tablo.getColumnModel().getColumn(1).setPreferredWidth(120);
            oda_tablo.getColumnModel().getColumn(1).setMaxWidth(120);
            oda_tablo.getColumnModel().getColumn(2).setMinWidth(1);
        }

        GeriGel.setBackground(new java.awt.Color(255, 153, 153));
        GeriGel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        GeriGel.setText("BACK");
        GeriGel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeriGelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(GeriGel))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(GeriGel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeriGelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeriGelActionPerformed
        OtelTest otelTest = new OtelTest();
        otelTest.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GeriGelActionPerformed
    public void yükle() {
                DefaultTableModel tablo = (DefaultTableModel) oda_tablo.getModel();
        try {
            String query = "SELECT * FROM odalar";
            statement = (Statement) connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            System.out.println(query);

            while (rs.next()) {
                Oda oda = new Oda(rs.getInt("oda_no"), rs.getString("oda_turu"), rs.getString("kalanlar"));
                System.out.println(oda);
                tablo.addRow(new Object[]{oda.getOda_no(), oda.getOda_turu(), oda.getKalanlar()});
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(OdaListesi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GeriGel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable oda_tablo;
    // End of variables declaration//GEN-END:variables
}
