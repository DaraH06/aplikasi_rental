                                                /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Main.MenuUtama;
import database.database_two;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.MessageDigest;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class FormLogin extends javax.swing.JFrame {

    int xx, xy;
    private Connection con;

    public FormLogin() {
        initComponents();
        con = database_two.con();
        setBackground(new Color(0, 0, 0, 0));
        setActionButton();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelcustom2 = new Palette.Panelcustom();
        btn_cancel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_username = new Palette.JTextfieldRounded();
        txt_password = new Palette.Custom_JPasswordFieldRounded();
        btn_login = new Palette.Custom_ButtonRounded();
        custom_ButtonRounded2 = new Palette.Custom_ButtonRounded();
        hide_eye = new javax.swing.JLabel();
        eye = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        panelcustom2.setBackground(new java.awt.Color(255, 255, 255));
        panelcustom2.setRoundBottomRight(50);
        panelcustom2.setRoundBottomleft(50);
        panelcustom2.setRoundTopLeft(50);
        panelcustom2.setRoundTopRight(50);

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Close Window.png"))); // NOI18N
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Login.png"))); // NOI18N

        txt_username.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        txt_password.setFont(new java.awt.Font("Poppins", 1, 12)); // NOI18N
        txt_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordActionPerformed(evt);
            }
        });

        btn_login.setBackground(new java.awt.Color(0, 0, 255));
        btn_login.setForeground(new java.awt.Color(102, 102, 255));
        btn_login.setText("SIGN IN");
        btn_login.setFillClick(new java.awt.Color(255, 255, 255));
        btn_login.setFillOriginal(new java.awt.Color(255, 255, 255));
        btn_login.setFillOver(new java.awt.Color(255, 255, 255));
        btn_login.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        custom_ButtonRounded2.setBackground(new java.awt.Color(255, 255, 255));
        custom_ButtonRounded2.setText("REGISTER");
        custom_ButtonRounded2.setFillClick(new java.awt.Color(0, 0, 153));
        custom_ButtonRounded2.setFillOriginal(new java.awt.Color(51, 51, 255));
        custom_ButtonRounded2.setFillOver(new java.awt.Color(51, 102, 255));
        custom_ButtonRounded2.setFont(new java.awt.Font("Poppins", 1, 14)); // NOI18N
        custom_ButtonRounded2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custom_ButtonRounded2ActionPerformed(evt);
            }
        });

        hide_eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Invisible.png"))); // NOI18N

        eye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Eye.png"))); // NOI18N

        javax.swing.GroupLayout panelcustom2Layout = new javax.swing.GroupLayout(panelcustom2);
        panelcustom2.setLayout(panelcustom2Layout);
        panelcustom2Layout.setHorizontalGroup(
            panelcustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(1240, 1240, 1240)
                .addComponent(btn_cancel))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(770, 770, 770)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(770, 770, 770)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(1110, 1110, 1110)
                .addComponent(eye))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(1110, 1110, 1110)
                .addComponent(hide_eye))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(770, 770, 770)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(custom_ButtonRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5)
        );
        panelcustom2Layout.setVerticalGroup(
            panelcustom2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addComponent(btn_cancel)
                .addGap(565, 565, 565)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(eye, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(hide_eye, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(500, 500, 500)
                .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelcustom2Layout.createSequentialGroup()
                .addGap(447, 447, 447)
                .addComponent(custom_ButtonRounded2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel5)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelcustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelcustom2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
//        try {
//            String sql = "SELECT * FROM tbl_user where Nama_User = '" + txt_username.getText()
//                    + "'AND Password ='" + txt_password.getText() + "'";
//            java.sql.Connection con = (Connection) database_two.con();
//            java.sql.PreparedStatement pst = con.prepareStatement(sql);
//            java.sql.ResultSet rs = pst.executeQuery(sql);
//            if (rs.next()) {
//                if (txt_username.getText().equals(rs.getString("Nama_User"))
//                        && txt_password.getText().equals(rs.getString("Password"))) {
//                    JOptionPane.showMessageDialog(null, "Berhasil  Login");
//                    this.setVisible(false);
//                    new MenuUtama().setVisible(true);
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Username atau Password salah");
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, e.getMessage());
//        }
//        //        new MenuUtama().show();
//        //        this.dispose();
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordActionPerformed

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked

    }//GEN-LAST:event_btn_cancelMouseClicked

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    private void custom_ButtonRounded2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custom_ButtonRounded2ActionPerformed
        new Register().setVisible(true);

        // Opsional: Menutup JFrame saat ini jika diperlukan
        this.dispose();
    }//GEN-LAST:event_custom_ButtonRounded2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        FlatLightLaf.setup();
        UIManager.put("Component.arc", 30); // Sudut melengkung pada komponen
        UIManager.put("Button.arc", 30);    // Sudut melengkung pada tombo
        UIManager.put("Button.background", new java.awt.Color(70, 130, 180)); // Warna latar belakang tombol
        UIManager.put("Button.foreground", java.awt.Color.WHITE); // Warna teks tombol
        UIManager.put("Button.hoverBackground", new java.awt.Color(100, 150, 200)); // Warna tombol saat dihover
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_cancel;
    private Palette.Custom_ButtonRounded btn_login;
    private Palette.Custom_ButtonRounded custom_ButtonRounded2;
    private javax.swing.JLabel eye;
    private javax.swing.JLabel hide_eye;
    private javax.swing.JLabel jLabel5;
    private Palette.Panelcustom panelcustom2;
    private Palette.Custom_JPasswordFieldRounded txt_password;
    private Palette.JTextfieldRounded txt_username;
    // End of variables declaration//GEN-END:variables

    private void setActionButton() {
        eye.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                eye.setVisible(false);
                hide_eye.setVisible(true);
                txt_password.setEchoChar((char) 0);
            }
        });

        hide_eye.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                eye.setVisible(true);
                hide_eye.setVisible(true);
                txt_password.setEchoChar('*');
            }
        });

        btn_login.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                prosesLogin();
            }
        });

        btn_cancel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                System.exit(0);
            }
        });

        txt_password.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    btn_login.doClick();
                }
            }

        });
    }

    public String getMd5java(String message) {
        String digest = null;
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(message.getBytes("UTF-8"));

            StringBuilder sb = new StringBuilder(2 * hash.length);
            for (byte b : hash) {
                sb.append(String.format("%02x", b & 0xff));
            }
            digest = sb.toString();

        } catch (Exception e) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, e);
        }
        return digest;
    }

    private boolean validasiInput() {
        boolean valid = false;
        if (txt_username.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username tidak boleh kosong");
        } else if (txt_password.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Password tidak boleh kosong");
        } else {
            valid = true;
        }
        return valid;
    }

    private boolean checkLogin(String username, String password) {
        if (con != null) {
            try {
                String sql = "SELECT * FROM tbl_user WHERE Nama_User=? AND Password=?";
                PreparedStatement st = con.prepareStatement(sql);
                st.setString(1, username);
                st.setString(2, password);

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    return true;
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    private void prosesLogin() {
        if (validasiInput()) {
            String username = txt_username.getText();
            String password = new String(txt_password.getPassword());
            String hashedPassword = getMd5java(password);

            if (checkLogin(username, hashedPassword)) {
                MenuUtama mn = new MenuUtama();
                mn.setVisible(true);
                mn.revalidate();

                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Username dan Password Salah", "Pesan", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }
}
