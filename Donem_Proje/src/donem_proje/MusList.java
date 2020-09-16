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

public class MusList extends javax.swing.JFrame {

    Database db;
    Connection connection;
    Statement statement = null;
    ArrayList arrayList = new ArrayList();

    public MusList() {
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
        Musteri_table = new javax.swing.JTable();
        GeriGel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Musteri_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "İSİM", "SOYİSİM", "YAŞ", "TC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Musteri_table);
        if (Musteri_table.getColumnModel().getColumnCount() > 0) {
            Musteri_table.getColumnModel().getColumn(0).setResizable(false);
            Musteri_table.getColumnModel().getColumn(1).setResizable(false);
            Musteri_table.getColumnModel().getColumn(2).setResizable(false);
            Musteri_table.getColumnModel().getColumn(3).setResizable(false);
        }

        GeriGel.setBackground(new java.awt.Color(255, 153, 153));
        GeriGel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        GeriGel.setText("BACK");
        GeriGel.setBorder(null);
        GeriGel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GeriGelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Impact", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(3, 1, 2));
        jLabel1.setText("MÜŞTERİ LİSTESİ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 834, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GeriGel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(GeriGel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GeriGelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GeriGelActionPerformed
        OtelTest otelTest = new OtelTest();
        otelTest.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_GeriGelActionPerformed

    public void yükle() {
                DefaultTableModel tablo = (DefaultTableModel) Musteri_table.getModel();
        try {
            String query = "SELECT * FROM musteriler";
            statement = (Statement) connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            System.out.println(query);

            while (rs.next()) {
                Musteri musteri = new Musteri( rs.getNString("ad"), rs.getString("soyad"),
                        rs.getInt("yas"), rs.getInt("tc"), rs.getInt("tel_no"), rs.getInt("oda_no"), rs.getInt("gun_sayisi"),rs.getInt("bakiye"));
                System.out.println(musteri);
                tablo.addRow(new Object[]{musteri.getAd(),musteri.getSoyad(),musteri.getYas(),musteri.getTc()});
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(MusList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton GeriGel;
    private javax.swing.JTable Musteri_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
