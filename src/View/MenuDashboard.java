/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import database.database_two;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author mahar
 */
public class MenuDashboard extends javax.swing.JPanel {

    private final java.sql.Connection con;// Koneksi database

    public MenuDashboard() {
        initComponents();
        con = database_two.con(); // Membuat koneksi ke database
        loadData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CardPelanggan = new Palette.Panelcustom();
        jPanelGradient1 = new Palette.JPanelGradient();
        lb_IconPelanggan = new javax.swing.JLabel();
        lb_jumlah_konsol = new javax.swing.JLabel();
        lb_pelanggan = new javax.swing.JLabel();
        lb_jumlah1 = new javax.swing.JLabel();
        CardPelanggan1 = new Palette.Panelcustom();
        jPanelGradient2 = new Palette.JPanelGradient();
        lb_pelanggan1 = new javax.swing.JLabel();
        lb_jumlah_sewa = new javax.swing.JLabel();
        lb_IconPelanggan4 = new javax.swing.JLabel();
        CardPelanggan3 = new Palette.Panelcustom();
        jPanelGradient3 = new Palette.JPanelGradient();
        lb_pelanggan3 = new javax.swing.JLabel();
        lb_jumlah_kembali = new javax.swing.JLabel();
        lb_IconPelanggan8 = new javax.swing.JLabel();
        CardPelanggan4 = new Palette.Panelcustom();
        jPanelGradient4 = new Palette.JPanelGradient();
        lb_pelanggan4 = new javax.swing.JLabel();
        lb_jumlah_pelanggan = new javax.swing.JLabel();
        lb_IconPelanggan2 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        CardPelanggan.setBackground(new java.awt.Color(102, 255, 204));
        CardPelanggan.setToolTipText("");
        CardPelanggan.setRoundBottomRight(30);
        CardPelanggan.setRoundBottomleft(30);
        CardPelanggan.setRoundTopLeft(30);
        CardPelanggan.setRoundTopRight(30);

        jPanelGradient1.setColorend(new java.awt.Color(0, 204, 153));
        jPanelGradient1.setColorstart(new java.awt.Color(0, 255, 204));

        lb_IconPelanggan.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lb_IconPelanggan.setForeground(new java.awt.Color(204, 204, 240));
        lb_IconPelanggan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Video Game.png"))); // NOI18N

        lb_jumlah_konsol.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        lb_jumlah_konsol.setForeground(new java.awt.Color(255, 255, 255));
        lb_jumlah_konsol.setText("100");

        lb_pelanggan.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lb_pelanggan.setForeground(new java.awt.Color(153, 153, 153));
        lb_pelanggan.setText("Konsol");

        javax.swing.GroupLayout jPanelGradient1Layout = new javax.swing.GroupLayout(jPanelGradient1);
        jPanelGradient1.setLayout(jPanelGradient1Layout);
        jPanelGradient1Layout.setHorizontalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumlah_konsol)
                    .addComponent(lb_pelanggan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lb_IconPelanggan)
                .addGap(20, 20, 20))
        );
        jPanelGradient1Layout.setVerticalGroup(
            jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGradient1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelGradient1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb_IconPelanggan)
                    .addGroup(jPanelGradient1Layout.createSequentialGroup()
                        .addComponent(lb_pelanggan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb_jumlah_konsol)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout CardPelangganLayout = new javax.swing.GroupLayout(CardPelanggan);
        CardPelanggan.setLayout(CardPelangganLayout);
        CardPelangganLayout.setHorizontalGroup(
            CardPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGradient1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CardPelangganLayout.setVerticalGroup(
            CardPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPelangganLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGradient1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lb_jumlah1.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        lb_jumlah1.setForeground(new java.awt.Color(102, 102, 102));
        lb_jumlah1.setText("STATUS Playstation");

        CardPelanggan1.setBackground(new java.awt.Color(102, 255, 204));
        CardPelanggan1.setToolTipText("");
        CardPelanggan1.setRoundBottomRight(30);
        CardPelanggan1.setRoundBottomleft(30);
        CardPelanggan1.setRoundTopLeft(30);
        CardPelanggan1.setRoundTopRight(30);

        jPanelGradient2.setColorend(new java.awt.Color(0, 204, 153));
        jPanelGradient2.setColorstart(new java.awt.Color(0, 255, 204));

        lb_pelanggan1.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lb_pelanggan1.setForeground(new java.awt.Color(153, 153, 153));
        lb_pelanggan1.setText("Sewa");

        lb_jumlah_sewa.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        lb_jumlah_sewa.setForeground(new java.awt.Color(255, 255, 255));
        lb_jumlah_sewa.setText("100");

        lb_IconPelanggan4.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lb_IconPelanggan4.setForeground(new java.awt.Color(204, 204, 240));
        lb_IconPelanggan4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PlayStation.png"))); // NOI18N

        javax.swing.GroupLayout jPanelGradient2Layout = new javax.swing.GroupLayout(jPanelGradient2);
        jPanelGradient2.setLayout(jPanelGradient2Layout);
        jPanelGradient2Layout.setHorizontalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_pelanggan1)
                    .addComponent(lb_jumlah_sewa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(lb_IconPelanggan4)
                .addGap(20, 20, 20))
        );
        jPanelGradient2Layout.setVerticalGroup(
            jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanelGradient2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_IconPelanggan4)
                    .addGroup(jPanelGradient2Layout.createSequentialGroup()
                        .addComponent(lb_pelanggan1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumlah_sewa)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout CardPelanggan1Layout = new javax.swing.GroupLayout(CardPelanggan1);
        CardPelanggan1.setLayout(CardPelanggan1Layout);
        CardPelanggan1Layout.setHorizontalGroup(
            CardPelanggan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPelanggan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGradient2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        CardPelanggan1Layout.setVerticalGroup(
            CardPelanggan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPelanggan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CardPelanggan3.setBackground(new java.awt.Color(102, 255, 204));
        CardPelanggan3.setToolTipText("");
        CardPelanggan3.setRoundBottomRight(30);
        CardPelanggan3.setRoundBottomleft(30);
        CardPelanggan3.setRoundTopLeft(30);
        CardPelanggan3.setRoundTopRight(30);

        jPanelGradient3.setColorend(new java.awt.Color(0, 204, 153));
        jPanelGradient3.setColorstart(new java.awt.Color(0, 255, 204));

        lb_pelanggan3.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lb_pelanggan3.setForeground(new java.awt.Color(153, 153, 153));
        lb_pelanggan3.setText("Kembali");

        lb_jumlah_kembali.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        lb_jumlah_kembali.setForeground(new java.awt.Color(255, 255, 255));
        lb_jumlah_kembali.setText("100");

        lb_IconPelanggan8.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lb_IconPelanggan8.setForeground(new java.awt.Color(204, 204, 240));
        lb_IconPelanggan8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PlayStation.png"))); // NOI18N

        javax.swing.GroupLayout jPanelGradient3Layout = new javax.swing.GroupLayout(jPanelGradient3);
        jPanelGradient3.setLayout(jPanelGradient3Layout);
        jPanelGradient3Layout.setHorizontalGroup(
            jPanelGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_pelanggan3)
                    .addComponent(lb_jumlah_kembali))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(lb_IconPelanggan8)
                .addGap(20, 20, 20))
        );
        jPanelGradient3Layout.setVerticalGroup(
            jPanelGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanelGradient3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_IconPelanggan8)
                    .addGroup(jPanelGradient3Layout.createSequentialGroup()
                        .addComponent(lb_pelanggan3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumlah_kembali)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout CardPelanggan3Layout = new javax.swing.GroupLayout(CardPelanggan3);
        CardPelanggan3.setLayout(CardPelanggan3Layout);
        CardPelanggan3Layout.setHorizontalGroup(
            CardPelanggan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPelanggan3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CardPelanggan3Layout.setVerticalGroup(
            CardPelanggan3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPelanggan3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGradient3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        CardPelanggan4.setBackground(new java.awt.Color(102, 255, 204));
        CardPelanggan4.setToolTipText("");
        CardPelanggan4.setRoundBottomRight(30);
        CardPelanggan4.setRoundBottomleft(30);
        CardPelanggan4.setRoundTopLeft(30);
        CardPelanggan4.setRoundTopRight(30);

        jPanelGradient4.setColorend(new java.awt.Color(0, 204, 153));
        jPanelGradient4.setColorstart(new java.awt.Color(0, 255, 204));

        lb_pelanggan4.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        lb_pelanggan4.setForeground(new java.awt.Color(153, 153, 153));
        lb_pelanggan4.setText("Pelanggan");

        lb_jumlah_pelanggan.setFont(new java.awt.Font("Poppins", 1, 30)); // NOI18N
        lb_jumlah_pelanggan.setForeground(new java.awt.Color(255, 255, 255));
        lb_jumlah_pelanggan.setText("100");

        lb_IconPelanggan2.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lb_IconPelanggan2.setForeground(new java.awt.Color(204, 204, 240));
        lb_IconPelanggan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Crowd.png"))); // NOI18N

        javax.swing.GroupLayout jPanelGradient4Layout = new javax.swing.GroupLayout(jPanelGradient4);
        jPanelGradient4.setLayout(jPanelGradient4Layout);
        jPanelGradient4Layout.setHorizontalGroup(
            jPanelGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_pelanggan4)
                    .addComponent(lb_jumlah_pelanggan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(lb_IconPelanggan2)
                .addGap(20, 20, 20))
        );
        jPanelGradient4Layout.setVerticalGroup(
            jPanelGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGradient4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanelGradient4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_IconPelanggan2)
                    .addGroup(jPanelGradient4Layout.createSequentialGroup()
                        .addComponent(lb_pelanggan4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb_jumlah_pelanggan)))
                .addGap(9, 9, 9))
        );

        javax.swing.GroupLayout CardPelanggan4Layout = new javax.swing.GroupLayout(CardPelanggan4);
        CardPelanggan4.setLayout(CardPelanggan4Layout);
        CardPelanggan4Layout.setHorizontalGroup(
            CardPelanggan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPelanggan4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGradient4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CardPelanggan4Layout.setVerticalGroup(
            CardPelanggan4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CardPelanggan4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelGradient4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_jumlah1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CardPelanggan4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CardPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addComponent(CardPelanggan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(CardPelanggan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lb_jumlah1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CardPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardPelanggan3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CardPelanggan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CardPelanggan4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Panelcustom CardPelanggan;
    private Palette.Panelcustom CardPelanggan1;
    private Palette.Panelcustom CardPelanggan3;
    private Palette.Panelcustom CardPelanggan4;
    private Palette.Panelcustom CardPelanggan6;
    private javax.swing.JPanel jPanel1;
    private Palette.JPanelGradient jPanelGradient1;
    private Palette.JPanelGradient jPanelGradient2;
    private Palette.JPanelGradient jPanelGradient3;
    private Palette.JPanelGradient jPanelGradient4;
    private javax.swing.JLabel lb_IconPelanggan;
    private javax.swing.JLabel lb_IconPelanggan2;
    private javax.swing.JLabel lb_IconPelanggan4;
    private javax.swing.JLabel lb_IconPelanggan6;
    private javax.swing.JLabel lb_IconPelanggan8;
    private javax.swing.JLabel lb_jumlah1;
    private javax.swing.JLabel lb_jumlah_kembali;
    private javax.swing.JLabel lb_jumlah_konsol;
    private javax.swing.JLabel lb_jumlah_pelanggan;
    private javax.swing.JLabel lb_jumlah_sewa;
    private javax.swing.JLabel lb_jumlah_sewa1;
    private javax.swing.JLabel lb_pelanggan;
    private javax.swing.JLabel lb_pelanggan1;
    private javax.swing.JLabel lb_pelanggan3;
    private javax.swing.JLabel lb_pelanggan4;
    private javax.swing.JLabel lb_pelanggan6;
    // End of variables declaration//GEN-END:variables

    private int jumlahPelanggan() {
        int totalPelanggan = 0;

        try {
            String sql = "SELECT COUNT(*) AS total FROM tbl_pelanggan";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                totalPelanggan = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalPelanggan;
    }

    private int jumlahKonsol() {
        int totalKonsol = 0;

        try {
            String sql = "SELECT COUNT(*) AS total FROM tbl_konsol";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                totalKonsol = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalKonsol;
    }

    private int jumlahSewa() {
        int totalSewa = 0;

        try {
            String sql = "SELECT COUNT(*) AS total FROM tbl_detail_rental";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                totalSewa = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalSewa;
    }

    private int jumlahKembali() {
        int totalKembali = 0;

        try {
            String sql = "SELECT COUNT(*) AS total FROM tbl_detail_rental WHERE Status_Rental ='Sudah Dikembalikan'";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                totalKembali = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalKembali;
    }

    private void loadData() {
        lb_jumlah_pelanggan.setText(String.valueOf(jumlahPelanggan()));
        lb_jumlah_konsol.setText(String.valueOf(jumlahKonsol()));
        lb_jumlah_sewa.setText(String.valueOf(jumlahSewa()));
        lb_jumlah_kembali.setText(String.valueOf(jumlahKembali()));
//        lb_jumlah_rental.setText("");
    }
}
