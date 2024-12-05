/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package View;

import Main.MenuUtama;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;

/**
 *
 * @author mahar
 */
public class MenuProfile extends javax.swing.JDialog {

    private MenuUtama menuUtama;

    public MenuProfile(java.awt.Frame parent, boolean modal, MenuUtama menuUtama) {
        super(parent, modal);
        initComponents();
        this.menuUtama = menuUtama;
        actionButton();
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
        pn_ganti_pw = new javax.swing.JPanel();
        pn_line = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btn_ganti_pw = new javax.swing.JLabel();
        pn_btn_logout = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pn_ganti_pw.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Password Reset.png"))); // NOI18N

        btn_ganti_pw.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_ganti_pw.setForeground(new java.awt.Color(102, 102, 102));
        btn_ganti_pw.setText("Forget Password");

        javax.swing.GroupLayout pn_ganti_pwLayout = new javax.swing.GroupLayout(pn_ganti_pw);
        pn_ganti_pw.setLayout(pn_ganti_pwLayout);
        pn_ganti_pwLayout.setHorizontalGroup(
            pn_ganti_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ganti_pwLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ganti_pw, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_ganti_pwLayout.setVerticalGroup(
            pn_ganti_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_ganti_pwLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_ganti_pwLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_line, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_ganti_pw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        pn_btn_logout.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logout.png"))); // NOI18N

        btn_logout.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(102, 102, 102));
        btn_logout.setText("Logout");

        javax.swing.GroupLayout pn_btn_logoutLayout = new javax.swing.GroupLayout(pn_btn_logout);
        pn_btn_logout.setLayout(pn_btn_logoutLayout);
        pn_btn_logoutLayout.setHorizontalGroup(
            pn_btn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btn_logoutLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        pn_btn_logoutLayout.setVerticalGroup(
            pn_btn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btn_logoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btn_logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_line1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pn_ganti_pw, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pn_btn_logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(pn_ganti_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pn_btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MenuProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MenuProfile dialog = new MenuProfile(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_ganti_pw;
    private javax.swing.JLabel btn_logout;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pn_btn_logout;
    private javax.swing.JPanel pn_ganti_pw;
    private javax.swing.JPanel pn_line;
    private javax.swing.JPanel pn_line1;
    // End of variables declaration//GEN-END:variables

    private void actionButton() {
        btn_ganti_pw.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pn_ganti_pw.setBackground(new Color(240, 240, 240));
                pn_line.setBackground(new Color(0, 102, 153));

                dispose();
                JPanel jp = menuUtama.getPanelUtama();
                FormLogin formLogin = new FormLogin();
                MenuGantiPassword formGantiPassword = new MenuGantiPassword();

                jp.removeAll();
                jp.add(formGantiPassword);
                jp.repaint();
                jp.revalidate();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pn_ganti_pw.setBackground(new Color(250, 250, 250));
                pn_line.setBackground(new Color(0, 153, 153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pn_ganti_pw.setBackground(new Color(255, 255, 255));
                pn_line.setBackground(new Color(255, 255, 255));
            }

        });

        btn_logout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pn_btn_logout.setBackground(new Color(240, 240, 240));
                pn_line1.setBackground(new Color(0, 153, 153));

                dispose();
                menuUtama.dispose();
                FormLogin formLogin = new FormLogin();
                formLogin.setVisible(true);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                pn_btn_logout.setBackground(new Color(250, 250, 250));
                pn_line1.setBackground(new Color(0, 153, 153));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                pn_btn_logout.setBackground(new Color(255, 255, 255));
                pn_line1.setBackground(new Color(255, 255, 255));
            }

        });
    }
}