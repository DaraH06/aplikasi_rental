package View;

import java.sql.Connection;
import database.database_two;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mahar
 */
public class DataKonsol extends javax.swing.JDialog {

    /**
     * Creates new form DataPelanggan
     */
    private int HalamanSaatIni = 1;
    private int DataperHalaman = 14;
    private int totalpages;

    private final Connection con;// Koneksi database

    private String IdKonsol;
    private String NamaKonsol;
    private String HargaPerhari;

    public String getIdKonsol() {
        return IdKonsol;
    }

    public String getNamaKonsol() {
        return NamaKonsol;
    }

    public String getHargaPerhari() {
        return HargaPerhari;
    }

    public DataKonsol(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        con = database_two.con();
        loadData(); // Memuat data Konsol ke dalam JTable
        setTabelModel(); // Mengatur model tabel (misalnya, kolom-kolomnya)
        paginationPelanggan();
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

        panelView = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_data = new Palette.JTable_Custom();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_search = new Palette.JTextfieldRounded();
        btn_first = new javax.swing.JButton();
        btn_before = new javax.swing.JButton();
        cbx_data = new javax.swing.JComboBox<>();
        btn_next = new javax.swing.JButton();
        btn_last = new javax.swing.JButton();
        lb_halaman = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelView.setBackground(new java.awt.Color(255, 255, 255));

        tbl_data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tbl_data.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tbl_data.setSelectionForeground(new java.awt.Color(204, 255, 51));
        jScrollPane1.setViewportView(tbl_data);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/Icon2.png"))); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Data Konsol");

        txt_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_search.setText("Search");
        txt_search.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N

        btn_first.setText("First Page");

        btn_before.setText("<");

        cbx_data.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8", "16", "32", "64" }));

        btn_next.setText(">");

        btn_last.setText("Last Page");

        lb_halaman.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        lb_halaman.setForeground(new java.awt.Color(153, 153, 153));
        lb_halaman.setText("Halaman of Total Halaman");

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_search, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelViewLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))))
                    .addGroup(panelViewLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
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
                                .addGap(27, 27, 27)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(DataKonsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataKonsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataKonsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataKonsol.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataKonsol dialog = new DataKonsol(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_before;
    private javax.swing.JButton btn_first;
    private javax.swing.JButton btn_last;
    private javax.swing.JButton btn_next;
    private javax.swing.JComboBox<String> cbx_data;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_halaman;
    private javax.swing.JPanel panelView;
    private Palette.JTable_Custom tbl_data;
    private Palette.JTextfieldRounded txt_search;
    // End of variables declaration//GEN-END:variables

    // paginationPelanggan() - Mengatur fungsi pagination untuk pelanggan
    private void paginationPelanggan() {
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

    private void actionButton() {
        txt_search.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                searchData();
            }
        });

        tbl_data.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                pilihData();
            }
        });
    }

    // calculateTotalPage() - Menghitung total halaman berdasarkan jumlah data dan data per halaman
    private void calculateTotalPage() {
        int totalData = getTotalData();// Mendapatkan total data pelanggan
        totalpages = (int) Math.ceil((double) totalData / DataperHalaman);// Menghitung total halaman
    }

    // getTotalData() - Mendapatkan total data pelanggan dari database
    private int getTotalData() {
        int totalData = 0;
        try {
            String sql = "SELECT COUNT(*) AS total FROM tbl_konsol";// Query menghitung total data pelanggan
            try (PreparedStatement st = con.prepareStatement(sql)) {
                ResultSet rs = st.executeQuery(); // Eksekusi query
                if (rs.next()) {
                    totalData = rs.getInt("total");// Mendapatkan jumlah total dari kolom "total"
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuPelanggan.class.getName()).log(Level.SEVERE, null, e);
        }
        return totalData;// Mengembalikan jumlah data
    }

    // loadData() - Memuat data pelanggan ke dalam JTable berdasarkan halaman saat ini
    private void loadData() {
        calculateTotalPage();// Menghitung total halaman
        int totalData = getTotalData();// Mendapatkan total data pelanggan
        lb_halaman.setText(String.valueOf("Halaman " + HalamanSaatIni + " Dari total data " + totalData)); // Menampilkan halaman saat ini

        int startIndex = (HalamanSaatIni - 1) * DataperHalaman;// Menentukan indeks awal data berdasarkan halaman saat ini
        getData(startIndex, DataperHalaman, (DefaultTableModel) tbl_data.getModel());// Mendapatkan data untuk ditampilkan di tabel
    }

    private void setTabelModel() {
        String[] columnNames = {
            "ID Konsol",
            "Nama",
            "Kategori",
            "Status",
            "Stock",
            "Harga Perjam",
            "Harga Perhari"
        };
        DefaultTableModel model = new DefaultTableModel(columnNames, 0); // Membuat model tabel dengan kolom yang ditentukan
        tbl_data.setModel(model); // Mengatur model tabel untuk JTable
        loadData(); // Memuat data ke dalam tabel
    }

    private void searchData() {
        String kataKunci = txt_search.getText(); // Mengambil kata kunci dari text field pencarian

        DefaultTableModel model = (DefaultTableModel) tbl_data.getModel();
        model.setRowCount(0); // Mengosongkan data di tabel sebelum memuat hasil pencarian

        try {
            // Modifikasi query untuk mencakup pencarian berdasarkan Nama_Konsol dan Stock
            String sql = "SELECT tbl_konsol.ID_Konsol, tbl_konsol.Nama_Konsol, tbl_konsol.Status, tbl_konsol.Stock, tbl_konsol.Harga_Perjam, tbl_konsol.Harga_Perhari, "
                    + "tbl_kategori.ID_Kategori, tbl_kategori.Nama_Kategori "
                    + "FROM tbl_konsol "
                    + "INNER JOIN tbl_kategori ON tbl_kategori.ID_Kategori = tbl_konsol.ID_Kategori "
                    + "WHERE tbl_konsol.Nama_Konsol Like ? OR tbl_konsol.Status Like ?";
            try (PreparedStatement st = con.prepareStatement(sql)) {
                // Menambahkan parameter pencarian pada kolom Nama_Konsol dan Stock
                st.setString(1, "%" + kataKunci + "%");
                st.setString(2, "%" + kataKunci + "%"); // Menambahkan pencarian berdasarkan Stock

                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    String IdKonsol = rs.getString("ID_Konsol");
                    String NamaKonsol = rs.getString("Nama_Konsol");
                    String NamaKategori = rs.getString("Nama_Kategori");
                    String Status = rs.getString("Status");
                    String Stock = rs.getString("Stock");
                    String HargaPerjam = rs.getString("Harga_Perjam");
                    String HargaPerhari = rs.getString("Harga_Perhari");

                    // Menambahkan hasil pencarian ke dalam JTable
                    Object[] rowData = {IdKonsol, NamaKonsol, NamaKategori, Status, Stock, HargaPerjam, HargaPerhari};
                    model.addRow(rowData);
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuKonsol.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    private void pilihData() {
        int row = tbl_data.getSelectedRow();

        IdKonsol = tbl_data.getValueAt(row, 0).toString();
        NamaKonsol = tbl_data.getValueAt(row, 1).toString();
        HargaPerhari = tbl_data.getValueAt(row, 6).toString();

        dispose();
    }

    // getData() - Mendapatkan data Konsol dari database dengan batasan jumlah data per halaman
    private void getData(int startIndex, int entriesPage, DefaultTableModel model) {
        model.setRowCount(0); // Mengosongkan data yang ada di tabel

        try {
            String sql = "SELECT tbl_konsol.ID_Konsol, tbl_konsol.Nama_Konsol, tbl_konsol.Status, tbl_konsol.Stock, tbl_konsol.Harga_Perjam, tbl_konsol.Harga_Perhari, "
                    + "tbl_kategori.ID_Kategori, tbl_kategori.Nama_Kategori "
                    + "FROM tbl_konsol "
                    + "INNER JOIN tbl_kategori ON tbl_kategori.ID_Kategori = tbl_konsol.ID_Kategori "
                    + "ORDER BY tbl_konsol.ID_Konsol DESC LIMIT ?, ?";
            // Query dengan limit berdasarkan halaman
            try (PreparedStatement st = con.prepareStatement(sql)) {
                st.setInt(1, startIndex); // Indeks awal
                st.setInt(2, entriesPage); // Jumlah data per halaman
                ResultSet rs = st.executeQuery(); // Eksekusi query

                while (rs.next()) {
                    String IdKonsol = rs.getString("ID_Konsol");
                    String NamaKonsol = rs.getString("Nama_Konsol");
                    String NamaKategori = rs.getString("Nama_Kategori");
                    String Status = rs.getString("Status");
                    String Stock = rs.getString("Stock");
                    String HargaPerjam = rs.getString("Harga_Perjam");
                    String HargaPerhari = rs.getString("Harga_Perhari");

                    Object[] rowData = {IdKonsol, NamaKonsol, NamaKategori, Status, Stock, HargaPerjam, HargaPerhari}; // Data Konsol
                    model.addRow(rowData); // Menambahkan baris data ke dalam tabel
                }
            }
        } catch (Exception e) {
            Logger.getLogger(MenuKonsol.class.getName()).log(Level.SEVERE, null, e);

        }
    }
}