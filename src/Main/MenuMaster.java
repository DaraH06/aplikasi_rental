/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Main;
//menu master
import View.MenuDashboard;
import View.MenuKategori;
import View.MenuKonsol;
import View.MenuPelanggan;
import View.MenuUser;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author mahar
 */
public class MenuMaster extends javax.swing.JPanel {

    private MenuUtama menuUtama;

    public MenuMaster(MenuUtama menuUtama) {
        initComponents();
        this.menuUtama = menuUtama;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        pn_btnDashboard = new javax.swing.JPanel();
        pn_line = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JLabel();
        pn_btnPelanggan = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_pelanggan = new javax.swing.JLabel();
        pn_btnKonsol = new javax.swing.JPanel();
        pn_line2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_konsol = new javax.swing.JLabel();
        pn_btnUsers = new javax.swing.JPanel();
        pn_line3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_users = new javax.swing.JLabel();
        pn_btnKategori = new javax.swing.JPanel();
        pn_line9 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_kategori = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("MASTER DATA");

        pn_btnDashboard.setBackground(new java.awt.Color(255, 255, 255));

        pn_line.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_lineLayout = new javax.swing.GroupLayout(pn_line);
        pn_line.setLayout(pn_lineLayout);
        pn_lineLayout.setHorizontalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pn_lineLayout.setVerticalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/iMac.png"))); // NOI18N

        btn_dashboard.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(102, 102, 102));
        btn_dashboard.setText("Dashboard");
        btn_dashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_dashboardMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnDashboardLayout = new javax.swing.GroupLayout(pn_btnDashboard);
        pn_btnDashboard.setLayout(pn_btnDashboardLayout);
        pn_btnDashboardLayout.setHorizontalGroup(
            pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_btnDashboardLayout.setVerticalGroup(
            pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnDashboardLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnDashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        pn_btnPelanggan.setBackground(new java.awt.Color(255, 255, 255));

        pn_line1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Icon1.png"))); // NOI18N

        btn_pelanggan.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_pelanggan.setForeground(new java.awt.Color(102, 102, 102));
        btn_pelanggan.setText("Pelanggan");
        btn_pelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pelangganMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pelangganMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pelangganMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnPelangganLayout = new javax.swing.GroupLayout(pn_btnPelanggan);
        pn_btnPelanggan.setLayout(pn_btnPelangganLayout);
        pn_btnPelangganLayout.setHorizontalGroup(
            pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_btnPelangganLayout.setVerticalGroup(
            pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnPelangganLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnPelangganLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_line1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_pelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        pn_btnKonsol.setBackground(new java.awt.Color(255, 255, 255));

        pn_line2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line2Layout = new javax.swing.GroupLayout(pn_line2);
        pn_line2.setLayout(pn_line2Layout);
        pn_line2Layout.setHorizontalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pn_line2Layout.setVerticalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Icon2.png"))); // NOI18N

        btn_konsol.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_konsol.setForeground(new java.awt.Color(102, 102, 102));
        btn_konsol.setText("Konsol");
        btn_konsol.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_konsolMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_konsolMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_konsolMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnKonsolLayout = new javax.swing.GroupLayout(pn_btnKonsol);
        pn_btnKonsol.setLayout(pn_btnKonsolLayout);
        pn_btnKonsolLayout.setHorizontalGroup(
            pn_btnKonsolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKonsolLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_konsol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_btnKonsolLayout.setVerticalGroup(
            pn_btnKonsolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKonsolLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnKonsolLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_line2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_konsol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        pn_btnUsers.setBackground(new java.awt.Color(255, 255, 255));

        pn_line3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line3Layout = new javax.swing.GroupLayout(pn_line3);
        pn_line3.setLayout(pn_line3Layout);
        pn_line3Layout.setHorizontalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pn_line3Layout.setVerticalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Icon6.png"))); // NOI18N

        btn_users.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_users.setForeground(new java.awt.Color(102, 102, 102));
        btn_users.setText("Users");
        btn_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_usersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usersMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnUsersLayout = new javax.swing.GroupLayout(pn_btnUsers);
        pn_btnUsers.setLayout(pn_btnUsersLayout);
        pn_btnUsersLayout.setHorizontalGroup(
            pn_btnUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnUsersLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_btnUsersLayout.setVerticalGroup(
            pn_btnUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnUsersLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_line3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        pn_btnKategori.setBackground(new java.awt.Color(255, 255, 255));

        pn_line9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line9Layout = new javax.swing.GroupLayout(pn_line9);
        pn_line9.setLayout(pn_line9Layout);
        pn_line9Layout.setHorizontalGroup(
            pn_line9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 9, Short.MAX_VALUE)
        );
        pn_line9Layout.setVerticalGroup(
            pn_line9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Diversity.png"))); // NOI18N

        btn_kategori.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_kategori.setForeground(new java.awt.Color(102, 102, 102));
        btn_kategori.setText("Kategori");
        btn_kategori.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_kategoriMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_kategoriMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_kategoriMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnKategoriLayout = new javax.swing.GroupLayout(pn_btnKategori);
        pn_btnKategori.setLayout(pn_btnKategoriLayout);
        pn_btnKategoriLayout.setHorizontalGroup(
            pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pn_line9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_btnKategoriLayout.setVerticalGroup(
            pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnKategoriLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pn_btnKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_line9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_kategori, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(pn_btnPelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_btnDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_btnKonsol, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_btnUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pn_btnKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnKonsol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseClicked
        pn_btnDashboard.setBackground(new Color(240, 240, 240));
        pn_line.setBackground(new Color(0, 102, 153));

        JPanel jp = menuUtama.getPanelUtama();
        jp.removeAll();
        jp.add(new MenuDashboard());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_dashboardMouseClicked

    private void btn_dashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseEntered
        pn_btnDashboard.setBackground(new Color(250, 250, 250));
        pn_line.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_dashboardMouseEntered

    private void btn_dashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dashboardMouseExited
        pn_btnDashboard.setBackground(new Color(255, 255, 255));
        pn_line.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_dashboardMouseExited

    private void btn_pelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pelangganMouseClicked
        pn_btnPelanggan.setBackground(new Color(240, 240, 240));
        pn_line1.setBackground(new Color(0, 102, 153));

        JPanel jp = menuUtama.getPanelUtama();
        jp.removeAll();
        jp.add(new MenuPelanggan());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_pelangganMouseClicked

    private void btn_pelangganMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pelangganMouseEntered
        pn_btnPelanggan.setBackground(new Color(250, 250, 250));
        pn_line1.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_pelangganMouseEntered

    private void btn_pelangganMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pelangganMouseExited
        pn_btnPelanggan.setBackground(new Color(255, 255, 255));
        pn_line1.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_pelangganMouseExited

    private void btn_konsolMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konsolMouseClicked
        pn_btnKonsol.setBackground(new Color(240, 240, 240));
        pn_line2.setBackground(new Color(0, 102, 153));

        JPanel jp = menuUtama.getPanelUtama();
        jp.removeAll();
        jp.add(new MenuKonsol());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_konsolMouseClicked

    private void btn_konsolMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konsolMouseEntered
        pn_btnKonsol.setBackground(new Color(250, 250, 250));
        pn_line2.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_konsolMouseEntered

    private void btn_konsolMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_konsolMouseExited
        pn_btnPelanggan.setBackground(new Color(255, 255, 255));
        pn_line2.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_konsolMouseExited

    private void btn_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseClicked
        pn_btnKonsol.setBackground(new Color(240, 240, 240));
        pn_line3.setBackground(new Color(0, 102, 153));

        JPanel jp = menuUtama.getPanelUtama();
        jp.removeAll();
        jp.add(new MenuUser());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_usersMouseClicked

    private void btn_usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseEntered
        pn_btnUsers.setBackground(new Color(250, 250, 250));
        pn_line3.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_usersMouseEntered

    private void btn_usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseExited
        pn_btnUsers.setBackground(new Color(255, 255, 255));
        pn_line3.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_usersMouseExited

    private void btn_kategoriMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kategoriMouseClicked
        pn_btnKategori.setBackground(new Color(240, 240, 240));
        pn_line9.setBackground(new Color(0, 102, 153));

        JPanel jp = menuUtama.getPanelUtama();
        jp.removeAll();
        jp.add(new MenuKategori());
        jp.repaint();
        jp.revalidate();
    }//GEN-LAST:event_btn_kategoriMouseClicked

    private void btn_kategoriMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kategoriMouseEntered
        pn_btnKategori.setBackground(new Color(250, 250, 250));
        pn_line9.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_kategoriMouseEntered

    private void btn_kategoriMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_kategoriMouseExited
        pn_btnKategori.setBackground(new Color(255, 255, 255));
        pn_line9.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_kategoriMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_dashboard;
    private javax.swing.JLabel btn_kategori;
    private javax.swing.JLabel btn_konsol;
    private javax.swing.JLabel btn_pelanggan;
    private javax.swing.JLabel btn_users;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel pn_btnDashboard;
    private javax.swing.JPanel pn_btnKategori;
    private javax.swing.JPanel pn_btnKonsol;
    private javax.swing.JPanel pn_btnPelanggan;
    private javax.swing.JPanel pn_btnUsers;
    private javax.swing.JPanel pn_line;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line2;
    private javax.swing.JPanel pn_line3;
    private javax.swing.JPanel pn_line9;
    // End of variables declaration//GEN-END:variables
}
