package View;

import com.mysql.cj.protocol.Resultset;
import database.database_two;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mahar
 */
public class MenuMeja extends javax.swing.JPanel {

    /**
     * Creates new form MenuDashboard
     */
    private int HalamanSaatIni = 1;
    private int DataperHalaman = 14;
    private int totalpages;

    private final Connection con;// Koneksi database

    // Konstruktor kelas MenuKategori
    public MenuMeja() {
        con = database_two.con(); // Membuat koneksi ke database
        initComponents(); // Inisialisasi komponen GUI
        loadData(); // Memuat data Kategori ke dalam JTable
        setTabelModel(); // Mengatur model tabel (misalnya, kolom-kolomnya)
        resetForm(); // Mereset form input menjadi kosong
        pagination(); // Mengatur paginasi untuk tampilan data
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbJenisKelamin = new javax.swing.ButtonGroup();
        panelMain = new javax.swing.JPanel();
        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new Palette.JTable_Custom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_hapus = new Palette.Custom_ButtonRounded();
        btn_tambah = new Palette.Custom_ButtonRounded();
        txt_search = new Palette.JTextfieldRounded();
        btn_first = new javax.swing.JButton();
        btn_before = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();
        btn_cancel = new Palette.Custom_ButtonRounded();
        panelAdd = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_simpan = new Palette.Custom_ButtonRounded();
        btn_batal_add = new Palette.Custom_ButtonRounded();
        txt_id = new Palette.JTextfieldRounded();
        jLabel8 = new javax.swing.JLabel();
        txt_nomor = new Palette.JTextfieldRounded();
        jLabel9 = new javax.swing.JLabel();
        txt_status = new Palette.JTextfieldRounded();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panelMain.setBackground(new java.awt.Color(255, 255, 255));
        panelMain.setLayout(new java.awt.CardLayout());

        panelView.setBackground(new java.awt.Color(255, 255, 255));

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        tbl_data.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tbl_data.setSelectionForeground(new java.awt.Color(204, 255, 51));
        tbl_data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_data);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Diversity.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Home.png"))); // NOI18N
        jLabel2.setText("> Meja");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Data Meja");

        btn_hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Delete.png"))); // NOI18N
        btn_hapus.setText("Hapus");
        btn_hapus.setFillClick(new java.awt.Color(153, 0, 51));
        btn_hapus.setFillOriginal(new java.awt.Color(255, 0, 51));
        btn_hapus.setFillOver(new java.awt.Color(204, 0, 51));
        btn_hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_hapusActionPerformed(evt);
            }
        });

        btn_tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Add Male User Group.png"))); // NOI18N
        btn_tambah.setText("Tambah");
        btn_tambah.setFillClick(new java.awt.Color(0, 51, 102));
        btn_tambah.setFillOver(new java.awt.Color(41, 128, 185));
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        txt_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_search.setText("Search");
        txt_search.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_searchKeyTyped(evt);
            }
        });

        btn_first.setText("First Page");

        btn_before.setText("<");

        cbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "16", "32", "64" }));

        btn_next.setText(">");

        btn_last.setText("Last Page");

        lb_halaman.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lb_halaman.setForeground(new java.awt.Color(153, 153, 153));
        lb_halaman.setText("Halaman of Total Halaman");

        btn_cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel.png"))); // NOI18N
        btn_cancel.setText("Batal");
        btn_cancel.setFillClick(new java.awt.Color(153, 51, 0));
        btn_cancel.setFillOriginal(new java.awt.Color(255, 102, 0));
        btn_cancel.setFillOver(new java.awt.Color(204, 102, 0));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                                .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(19, 19, 19))
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGap(345, 345, 345)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addComponent(btn_first)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_before)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_next)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_last))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lb_halaman)
                        .addGap(27, 27, 27)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_tambah, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_hapus, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lb_halaman)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_first, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_before, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbx_data, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_last, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panelMain.add(panelView, "card2");

        panelAdd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Diversity.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Home.png"))); // NOI18N
        jLabel6.setText("> Meja");

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Tambah Data Meja");

        btn_simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Save.png"))); // NOI18N
        btn_simpan.setText("Simpan");
        btn_simpan.setFillClick(new java.awt.Color(0, 51, 102));
        btn_simpan.setFillOver(new java.awt.Color(41, 128, 185));
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        btn_batal_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Cancel.png"))); // NOI18N
        btn_batal_add.setText("Batal");
        btn_batal_add.setFillClick(new java.awt.Color(153, 51, 0));
        btn_batal_add.setFillOriginal(new java.awt.Color(255, 102, 0));
        btn_batal_add.setFillOver(new java.awt.Color(204, 102, 0));
        btn_batal_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batal_addActionPerformed(evt);
            }
        });

        txt_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_id.setText("ID_Meja");
        txt_id.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 102, 102));
        jLabel8.setText("ID_Meja");

        txt_nomor.setForeground(new java.awt.Color(102, 102, 102));
        txt_nomor.setText("Nomor_Meja");
        txt_nomor.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        txt_nomor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nomorActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Nomor_Meja");

        txt_status.setForeground(new java.awt.Color(102, 102, 102));
        txt_status.setText("Status");
        txt_status.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 102, 102));
        jLabel10.setText("Status");

        javax.swing.GroupLayout panelAddLayout = new javax.swing.GroupLayout(panelAdd);
        panelAdd.setLayout(panelAddLayout);
        panelAddLayout.setHorizontalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_batal_add, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 739, Short.MAX_VALUE))
                    .addGroup(panelAddLayout.createSequentialGroup()
                        .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_nomor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 679, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(txt_status, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(panelAddLayout.createSequentialGroup()
                                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(20, 20, 20))))
        );
        panelAddLayout.setVerticalGroup(
            panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panelAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_simpan, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal_add, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nomor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );

        panelMain.add(panelAdd, "card2");

        add(panelMain, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btn_batal_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batal_addActionPerformed
        showPanel();// Kembali ke panel utama
        loadData();// Refresh data di JTable
    }//GEN-LAST:event_btn_batal_addActionPerformed

    private void btn_hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_hapusActionPerformed
        hapusData();// Memanggil fungsi hapusData() untuk menghapus data yang dipilih
    }//GEN-LAST:event_btn_hapusActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        showPanel(); // Kembali ke panel utama
        loadData(); // Refresh data di JTable
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_nomorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nomorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nomorActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        panelMain.removeAll();
        panelMain.add(panelAdd);// Beralih ke panel tambah/edit
        panelMain.repaint();
        panelMain.revalidate();

        try {
            txt_id.setText(setIDMeja()); // Menyiapkan ID Kategori baru secara otomatis
            if (btn_tambah.getText().equals("UBAH")) { // Jika tombol menunjukkan "UBAH"
                dataTabel(); // Memuat data Kategori yang dipilih ke form
                btn_simpan.setText("PERBARUI"); // Ubah teks tombol simpan menjadi perbarui
            } else {
                btn_simpan.setText("SIMPAN"); // Jika menambah data, tombol tetap "SIMPAN"
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuMeja.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        if (btn_simpan.getText().equals("SIMPAN")) {
            insertData(); // Menyimpan data baru ke database
        } else if (btn_simpan.getText().equals("PERBARUI")) {
            updateData(); // Memperbarui data Kategori yang sudah ada
        }
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed

    }//GEN-LAST:event_txt_idActionPerformed

    private void tbl_dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dataMouseClicked
        btn_tambah.setText("UBAH"); // Ubah tombol tambah menjadi "UBAH"
        btn_simpan.setText("PERBARUI"); // Ubah tombol simpan menjadi "PERBARUI"
        btn_cancel.setVisible(true); // Tampilkan tombol batal
        btn_hapus.setVisible(true); // Tampilkan tombol hapus
    }//GEN-LAST:event_tbl_dataMouseClicked

    private void txt_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyTyped
        searchData(); // Memanggil fungsi searchData() untuk mencari data berdasarkan kata kunci
    }//GEN-LAST:event_txt_searchKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Palette.Custom_ButtonRounded btn_batal_add;
    private javax.swing.JButton btn_before;
    private Palette.Custom_ButtonRounded btn_cancel;
    private javax.swing.JButton btn_first;
    private Palette.Custom_ButtonRounded btn_hapus;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private Palette.Custom_ButtonRounded btn_simpan;
    private Palette.Custom_ButtonRounded btn_tambah;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JPanel panelAdd;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelView;
    private javax.swing.ButtonGroup rbJenisKelamin;
    private Palette.JTable_Custom tbl_data;
    private Palette.JTextfieldRounded txt_id;
    private Palette.JTextfieldRounded txt_nomor;
    private Palette.JTextfieldRounded txt_search;
    private Palette.JTextfieldRounded txt_status;
    // End of variables declaration//GEN-END:variables

    // pagination() - Mengatur fungsi pagination untuk Kategori
    private void pagination() {
        // Mengatur tombol halaman pertama
        btn_first.addActionListener(e -> {
            HalamanSaatIni = 1;// Set ke halaman pertama
            loadData(); // Memuat data pada halaman pertama
        });

        // Mengatur tombol halaman sebelumnya
        btn_before.addActionListener(e -> {
            if (HalamanSaatIni > 1) {// Memastikan halaman saat ini lebih dari 1
                HalamanSaatIni--; // Turun ke halaman sebelumnya
                loadData();// Memuat data pada halaman saat ini
            }
        });

        // Mengatur combo box untuk jumlah data per halaman
        cbx_data.addActionListener(e -> {
            DataperHalaman = Integer.parseInt(cbx_data.getSelectedItem().toString());// Mengambil jumlah data per halaman dari combo box
            HalamanSaatIni = 1;// Set ke halaman pertama setiap kali data per halaman diubah
            loadData(); //Memuat data
        });

        // Mengatur tombol halaman berikutnya
        btn_next.addActionListener(e -> {
            if (HalamanSaatIni < totalpages) {// Memastikan belum di halaman terakhir
                HalamanSaatIni++;// Naik ke halaman berikutnya
                loadData();//Memuat data pada halaman baru
            }
        });

        // Mengatur tombol halaman terakhir
        btn_last.addActionListener(e -> {
            HalamanSaatIni = totalpages;// Set ke halaman terakhir
            loadData();// Memuat data pada halaman terakhir
        });
    }

    // calculateTotalPage() - Menghitung total halaman berdasarkan jumlah data dan data per halaman
    private void calculateTotalPage() {
        int totalData = getTotalData();// Mendapatkan total data Kategori
        totalpages = (int) Math.ceil((double) totalData / DataperHalaman);// Menghitung total halaman
    }

    // getTotalData() - Mendapatkan total data Kategori dari database
    private int getTotalData() {
        int totalData = 0;
        try {
            String sql = "SELECT COUNT(*) AS total FROM tbl_meja";// Query menghitung total data Kategori
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery(); // Eksekusi query
                if (rs.next()) {
                    totalData = rs.getInt("total");// Mendapatkan jumlah total dari kolom "total"
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuMeja.class.getName()).log(Level.SEVERE, null, e);
        }
        return totalData;// Mengembalikan jumlah data
    }

    // loadData() - Memuat data Kategori ke dalam JTable berdasarkan halaman saat ini
    private void loadData() {
        calculateTotalPage();// Menghitung total halaman
        int totalData = getTotalData();// Mendapatkan total data Kategori
        lb_halaman.setText(String.valueOf("Halaman " + HalamanSaatIni + " Dari total data " + totalData)); // Menampilkan halaman saat ini

        int startIndex = (HalamanSaatIni - 1) * DataperHalaman;// Menentukan indeks awal data berdasarkan halaman saat ini
        getData(startIndex, DataperHalaman, (DefaultTableModel) tbl_data.getModel());// Mendapatkan data untuk ditampilkan di tabel
        btn_hapus.setVisible(false); // Menyembunyikan tombol hapus
        btn_cancel.setVisible(false); // Menyembunyikan tombol batal
    }

    // showPanel() - Mengatur tampilan panel utama
    private void showPanel() {
        panelMain.removeAll();// Menghapus semua komponen di panel utama
        panelMain.add(new MenuMeja());// Menambahkan panel MenuKategori ke panel utama
        panelMain.repaint();// Menggambar ulang panel utama
        panelMain.revalidate();// Memastikan perubahan diterapkan
    }

    // resetForm() - Mengosongkan input form Kategori
    private void resetForm() {
        txt_id.setText("");
        txt_nomor.setText("");
        txt_status.setText("");
    }

    // setTabelModel() - Mengatur model tabel dengan kolom-kolom yang sesuai
    private void setTabelModel() {
        String[] columnNames = {
            "ID",
            "Nomor Meja",
            "Status"
        };
        DefaultTableModel model = new DefaultTableModel(columnNames, 0); // Membuat model tabel dengan kolom yang ditentukan
        tbl_data.setModel(model); // Mengatur model tabel untuk JTable
        loadData(); // Memuat data ke dalam tabel
    }

    // getData() - Mendapatkan data Kategori dari database dengan batasan jumlah data per halaman
    private void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0); // Mengosongkan data yang ada di tabel

        try {
            String sql = "SELECT * FROM tbl_meja LIMIT ?,?"; // Query dengan limit berdasarkan halaman
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setInt(1, startIndex); // Indeks awal
                st.setInt(2, entriesPage); // Jumlah data per halaman
                ResultSet rs = st.executeQuery(); // Eksekusi query

                while (rs.next()) {
                    String IdKategori = rs.getString("ID_Meja");
                    String NomorMeja = rs.getString("Nomor_Meja");
                    String Status = rs.getString("Status");

                    Object[] rowData = {IdKategori, NomorMeja, Status}; // Data Kategori
                    model.addRow(rowData); // Menambahkan baris data ke dalam tabel
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuMeja.class.getName()).log(Level.SEVERE, null, e);

        }
    }

    // setIDMeja() - Mengatur ID Kategori secara otomatis
    private String setIDMeja() throws SQLException {
        String urutan = null;
        Date now = new Date();
        SimpleDateFormat noFormat = new SimpleDateFormat("yyMM"); // Format tanggal sebagai bagian dari ID
        String no = noFormat.format(now);

        String sql = "SELECT RIGHT(ID_Meja, 3) AS Nomor FROM tbl_meja WHERE ID_Meja LIKE 'MJA" + no + "%' ORDER BY ID_Meja DESC LIMIT 1";

        try (PreparedStatement st = con.prepareStatement(sql)) {
            ResultSet rs = st.executeQuery(); // Eksekusi query

            if (rs.next()) {
                int nomor = Integer.parseInt(rs.getString("nomor")) + 1; // Menambah nomor urut
                urutan = "MJA" + no + String.format("%03d", nomor); // Format ID baru
            } else {
                urutan = "MJA" + no + "001"; // ID awal jika tidak ada data
            }
        } catch (SQLException e) {
            java.util.logging.Logger.getLogger(MenuMeja.class.getName()).log(Level.SEVERE, null, e);
        }
        return urutan;
    }

    // insertData() - Menambahkan data Kategori ke database
    private void insertData() {
        String IdKategori = txt_id.getText();
        String NomorMeja = txt_nomor.getText();
        String Status = txt_status.getText();

        // Validasi input data
        if (IdKategori.isEmpty() || NomorMeja.isEmpty() || Status.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Insert data ke database
        try {
            String sql = "INSERT INTO tbl_meja (ID_Meja, Nomor_Meja, Status) VALUES (?,?,?)";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, IdKategori);
                st.setString(2, NomorMeja);
                st.setString(3, Status);

                int rowInserted = st.executeUpdate();// Menjalankan perintah insert
                if (rowInserted > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Ditambahkan");
                    resetForm(); // Kosongkan text field setelah data berhasil ditambahkan
                    loadData();  // Memuat data ke tampilan JTable atau komponen lainnya
                    showPanel();
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuMeja.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    // dataTabel() - Menampilkan data Kategori dari JTable ke dalam form untuk diperbarui
    private void dataTabel() {
        panelView.setVisible(false); // Menyembunyikan panel view
        panelAdd.setVisible(true); // Menampilkan panel tambah/edit

        int row = tbl_data.getSelectedRow(); // Mendapatkan baris yang dipilih pada tabel
        jLabel7.setText("PERBARUI DATA Kategori"); // Mengubah teks label menjadi "PERBARUI DATA Kategori"
        txt_id.setEnabled(false); // Menonaktifkan field ID Kategori agar tidak bisa diedit

        // Mengisi field form dengan data dari baris yang dipilih
        txt_id.setText(tbl_data.getValueAt(row, 0).toString());
        txt_nomor.setText(tbl_data.getValueAt(row, 1).toString());
        txt_status.setText(tbl_data.getValueAt(row, 2).toString());
    }

    // updateData() - Memperbarui data Kategori di database
    private void updateData() {
        // Mengambil data dari form
        String IdKategori = txt_id.getText();
        String NomorMeja = txt_nomor.getText();
        String Status = txt_status.getText();

        // Validasi input data
        if (IdKategori.isEmpty() || NomorMeja.isEmpty() || Status.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua Kolom Harus Diisi!", "Validasi", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Insert data ke database
        try {
            String sql = "UPDATE tbl_meja SET Nomor_Meja=?, Status=? WHERE ID_Meja=?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, NomorMeja);
                st.setString(2, Status);
                st.setString(3, IdKategori);

                int rowUpdated = st.executeUpdate();
                if (rowUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Data Berhasil Diperbarui");
                    resetForm();// Kosongkan form
                    loadData();  // Refresh data di JTable
                    showPanel(); // Tampilkan panel utama
                }
            }
        } catch (SQLException e) {
            Logger.getLogger(MenuMeja.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    // hapusData() - Menghapus data Kategori dari database
    private void hapusData() {
        int row = tbl_data.getSelectedRow();// Mendapatkan baris yang dipilih
        String IdKategori = tbl_data.getValueAt(row, 0).toString();// Mendapatkan ID Kategori dari baris yang dipilih

        // Konfirmasi penghapusan
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah Anda Yakin Menghapus Data Ini?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                String sql = "DELETE FROM tbl_meja WHERE ID_Meja=?";
                try (PreparedStatement st = con.prepareStatement(sql)) {
                    st.setString(1, IdKategori);

                    int rowDeleted = st.executeUpdate();// Eksekusi penghapusan
                    if (rowDeleted > 0) {
                        JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
                        loadData();// Refresh data di JTable
                    }
                }
            } catch (SQLException e) {
                Logger.getLogger(MenuMeja.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    // searchData() - Mencari data Kategori berdasarkan nama atau alamat
    private void searchData() {
        String kataKunci = txt_search.getText(); // Mengambil kata kunci dari text field pencarian

        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0);// Mengosongkan data di tabel sebelum memuat hasil pencarian

        try {
            String sql = "SELECT * FROM tbl_meja WHERE Nomor_Meja LIKE ? OR Status LIKE ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setString(1, "%" + kataKunci + "%"); // Parameter pencarian pada kolom Nama
                st.setString(2, "%" + kataKunci + "%");// Parameter pencarian pada kolom Alamat

                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String IdKategori = rs.getString("ID_Meja");
                    String NomorMeja = rs.getString("Nomor_Meja");
                    String Status = rs.getString("Status");

                    Object[] rowData = {IdKategori, NomorMeja, Status};
                    model.addRow(rowData);// Tambahkan hasil pencarian ke dalam JTable
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuMeja.class.getName()).log(Level.SEVERE, null, e);

        }
    }
}